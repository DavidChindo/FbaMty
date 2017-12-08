package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.fibramty.fbmty.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TicketDialog extends Activity {

    @BindView(R.id.dialog_ticket_title)TextView txttitle;

    private static final int READ_REQUEST_CODE = 42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_dialog);
        ButterKnife.bind(this);
        Bundle extra = getIntent().getExtras();
        if (extra != null){
            String title = extra.getString("ticket");
            txttitle.setText(title);
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
}
