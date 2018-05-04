package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Presenter.Callbacks.TicketCallback;
import com.fibramty.fbmty.Presenter.TicketPresenter;
import com.fibramty.fbmty.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TicketDialog extends Activity implements TicketCallback{

    @BindView(R.id.dialog_ticket_title)TextView txttitle;
    @BindView(R.id.dialog_ticket_txt_file)TextView txtFile;
    @BindView(R.id.dialog_ticket_edt_description)EditText edtDescription;

    private static final int READ_REQUEST_CODE = 42;
    public ArrayList<String> files = new ArrayList<String>();
    public static final String folderOrigin = Environment.getExternalStorageDirectory() + "/" + Statics.NAME_FOLDER + "/";
    private String serviceId;
    private String holdingId;
    TicketPresenter ticketPresenter;
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_dialog);
        ButterKnife.bind(this);
        ticketPresenter = new TicketPresenter(this,this);
        Bundle extra = getIntent().getExtras();
        if (extra != null){
            String title = extra.getString("ticket");
            serviceId = String.valueOf(extra.getLong("serviceId"));
            holdingId = String.valueOf(extra.getLong("holdingId"));
            txttitle.setText(title);
        }
    }

    @OnClick(R.id.dialog_ticket_sent)
    void onSentFile(){
        if (files != null && files.size() > 0){
            if (edtDescription.getText().toString() != null && !edtDescription.getText().toString().isEmpty()) {
                mProgressDialog = ProgressDialog.show(this, null, "Enviando...");
                mProgressDialog.setCancelable(false);
                ticketPresenter.uploadTicket(files, edtDescription.getText().toString(),serviceId,holdingId);
            }else{
                DesignUtils.showToast(this,"Ingrese la descripción");
            }
        }else{
            DesignUtils.showToast(this,"Agregue un archivo");
        }
    }

    @OnClick(R.id.dialog_ticket_add)
    void onAddFilesClick(){
        performFileSearch();
    }

    public void performFileSearch() {
        Intent intent;
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        }else{
            intent = new Intent(Intent.ACTION_GET_CONTENT);
        }
        intent.putExtra(Intent.EXTRA_LOCAL_ONLY, true);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("*/*");
        startActivityForResult(Intent.createChooser(intent, getResources().getString(R.string.form_pick_files)), READ_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri uri = null;
        String path;
        if (requestCode == READ_REQUEST_CODE && resultCode == RESULT_OK) {
            if (data.getClipData() != null && data.getClipData().getItemCount() > 1) {
                int max = data.getClipData().getItemCount() > 3 ? 3 : data.getClipData().getItemCount();
                for (int i =0; i < max ; i++) {
                    Uri pathUri = data.getClipData().getItemAt(i).getUri();
                    String wholeID = DocumentsContract.getDocumentId(pathUri);
                    String id = wholeID.split(":").length > 1 ? wholeID.split(":")[1] : wholeID.split(":")[0];
                    String pathDest = isDownloadsDocument(pathUri) ? folderOrigin : folderOrigin + id;
                    try {
                        path = inputToFile(pathUri, pathDest);
                        String[] paths = path.split("/");
                        String name = paths[paths.length - 1];
                        txtFile.setText(name);
                        files.add(pathDest);
                    } catch (IOException e) {
                        e.printStackTrace();
                        if (e.getLocalizedMessage().contains("such")) {
                            DesignUtils.showToast(this, "El archivo seleccionado no existe o se ha movido de su ubicación");
                        } else {
                            DesignUtils.showToast(this,e.getLocalizedMessage());
                        }
                    }
                }
            }else {
                if (data != null) {
                    uri = data.getData();
                    String wholeID = DocumentsContract.getDocumentId(uri);
                    String id = wholeID.split(":").length > 1 ? wholeID.split(":")[1] : wholeID.split(":")[0];
                    String pathDest = isDownloadsDocument(uri) ? folderOrigin : folderOrigin + id;
                    try {
                        path = inputToFile(uri, pathDest);
                        String[] paths = path.split("/");
                        String name = paths[paths.length - 1];
                        txtFile.setText(name);
                        files.add(pathDest);
                    } catch (IOException e) {
                        e.printStackTrace();
                        if (e.getLocalizedMessage().contains("such")) {
                            DesignUtils.showToast(this,  "El archivo seleccionado no existe o se ha movido de su ubicación");
                        } else {
                            DesignUtils.showToast(this,  e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }


    private String copy(String src, String dst) throws IOException {
        File fOrigin = new File(src);
        File fDest = new File(dst);
        FileInputStream inStream = new FileInputStream(fOrigin);
        FileOutputStream outStream = new FileOutputStream(fDest);
        FileChannel inChannel = inStream.getChannel();
        FileChannel outChannel = outStream.getChannel();
        inChannel.transferTo(0, inChannel.size(), outChannel);
        inStream.close();
        outStream.close();
        return  dst;
    }

    private String inputToFile(Uri uri, String ruta) throws IOException {
        if (isDownloadsDocument(uri)){
            String pathDownload = "";
            final String id = DocumentsContract.getDocumentId(uri);
            uri = ContentUris.withAppendedId(
                    Uri.parse("content://downloads/public_downloads"), Long.valueOf(id));
            String selection = "_id=?";
            String[] selectionArgs = new String[]{id};

            if ("content".equalsIgnoreCase(uri.getScheme())) {
                String[] projection = {
                        MediaStore.Images.Media.DATA
                };
                Cursor cursor = null;
                try {
                    cursor = getContentResolver()
                            .query(uri, projection, selection, selectionArgs, null);
                    int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
                    if (cursor.moveToFirst()) {
                        pathDownload = cursor.getString(column_index);
                    }
                    if (!pathDownload.isEmpty()){
                        String[] paths =  pathDownload.split("/");
                        String name = paths[paths.length - 1];
                        ruta += name;
                        return copy(pathDownload,ruta);
                    }else{
                        return "";
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return "";
                }
            }else{
                return "";
            }
        }else{
            InputStream inputStream = getContentResolver().openInputStream(uri);
            ruta = ruta.contains("/Download") ? ruta.replace("/Download","") : ruta;
            File f = new File(uri.toString().contains("image")? ruta + ".jpg" : ruta);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            OutputStream outStream = new FileOutputStream(f);
            outStream.write(buffer);

            return f.getAbsolutePath();
        }
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    @Override
    public void onSentTicketSuccess(String msg) {
        mProgressDialog.dismiss();
        DesignUtils.showToast(this,msg);
        finish();
    }

    @Override
    public void onSentTicketError(String msg) {
        mProgressDialog.dismiss();
        DesignUtils.showToast(this,msg);
        finish();
    }
}
