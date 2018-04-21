package com.fibramty.fbmty.Library;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.fibramty.fbmty.Network.Response.HoldingResponse;
import com.fibramty.fbmty.R;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by david.barrera on 11/29/17.
 */

public class LogicUtils {

    private static String TAG = LogicUtils.class.getSimpleName();

    public static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }

    public static String compressZip(Context context, String nameZip, ArrayList<String> files){
        File storagePath = new File(Environment.getExternalStorageDirectory(), Statics.NAME_FOLDER);
        try {
            if (!storagePath.exists()){
                storagePath.mkdirs();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        if (nameZip.equals("2222")){
            File zipTemp = new File(storagePath,nameZip+".zip");
            if (zipTemp.exists()){
                Log.d(TAG,"DELETE ZIP "+zipTemp.delete());
            }
        }
        final File zipFile = new File(storagePath, nameZip+".zip");

        Compress compress = new Compress(context, files, zipFile.getPath());

        compress.zipFileAtPath();

        if (zipFile.exists()){
            Log.d(TAG, "Zip created succesfully");
            return zipFile.getPath();
        }else{
            Log.d(TAG, "Zip created NOT succesfully");
            return null;
        }
    }

    public static void deleteFiles(ArrayList<String> files){
        if(!files.isEmpty()){
            for (int i = 0; i < files.size(); i++) {
                File f = new File(files.get(i));
                if (f.exists()){
                    if (f.delete()){
                        Log.d(TAG,"Borrado con exito "+f);
                        continue;
                    }else{
                        Log.d(TAG,"No se pudo borrar el archivo "+f);
                        break;
                    }
                }
            }
        }
    }

    public static String getUrlImage(Context context, HoldingResponse holdingResponse){
        String url = "";
        if (holdingResponse != null && holdingResponse.getPictures() != null){
            if (holdingResponse.getPictures().getComercialImages() != null && holdingResponse.getPictures().getComercialImages().size() > 0){
                url = context.getResources().getString(R.string.url_prod)+holdingResponse.getPictures().getComercialImages().get(0).getPath();
            }
        }
        return url;
    }
}
