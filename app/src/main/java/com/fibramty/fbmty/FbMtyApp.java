package com.fibramty.fbmty;

import android.app.Application;
import android.net.wifi.aware.PublishConfig;
import android.os.Environment;

import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.FbMtyWebService;
import com.fibramty.fbmty.Network.RetrofitEnvioroment;

import java.io.File;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by david.barrera on 12/7/17.
 */

public class FbMtyApp extends Application {

    public static FbMtyWebService fbMtyWebService;

    @Override
    public void onCreate() {
        super.onCreate();
        fbMtyWebService = RetrofitEnvioroment.createEnvironment("");
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().name("fbmty.realm").build();
        Realm.setDefaultConfiguration(config);
        initFolders();
    }

    public static FbMtyWebService getFbMtyWebService(){
        return fbMtyWebService;
    }

    private void initFolders(){
        File storagePath = new File(Environment.getExternalStorageDirectory(), Statics.NAME_FOLDER);
        try {
            if (!storagePath.exists()){
                storagePath.mkdirs();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
