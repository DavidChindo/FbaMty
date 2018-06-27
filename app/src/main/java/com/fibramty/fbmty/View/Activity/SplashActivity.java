package com.fibramty.fbmty.View.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.fibramty.fbmty.BuildConfig;
import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Prefs;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Response.HoldingResponse;
import com.fibramty.fbmty.Presenter.Callbacks.HoldingCallback;
import com.fibramty.fbmty.Presenter.HoldingPresenter;
import com.fibramty.fbmty.R;

import java.util.List;
import java.util.SortedMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class SplashActivity extends AppCompatActivity implements HoldingCallback {

    @BindView(R.id.act_splash_version)
    TextView txtVersion;

    ProgressDialog mProgressDialog;
    HoldingPresenter holdingPresenter;
    Prefs prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        setVerion();
        prefs = Prefs.with(this);
        holdingPresenter = new HoldingPresenter(this,this);
        if (prefs.getBoolean(Statics.LOGIN_PREFS)) {
            if (Connection.isConnected(SplashActivity.this)) {
                mProgressDialog = ProgressDialog.show(SplashActivity.this, "", "Descargando...");
                mProgressDialog.setCancelable(false);
                holdingPresenter.holding();
            }else{
                start(LoginActivity.class);
            }
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Prefs prefs = Prefs.with(SplashActivity.this);
                    start(LoginActivity.class);

                }
            }, 2000);
        }
    }

    private void setVerion() {
        txtVersion.setText(getString(R.string.text_version, BuildConfig.VERSION_NAME));
    }

    private void start(Class<?> aClass) {
        Intent intent = new Intent(this, aClass);
        startActivity(intent);
        finish();
    }

    @Override
    public void onDownloadHolding(List<HoldingResponse> holdingResponses) {
        mProgressDialog.dismiss();
        if (holdingResponses != null && holdingResponses.size() > 0){
            prefs.putBoolean(Statics.LOGIN_PREFS,true);
            Realm realm = Realm.getDefaultInstance();
            RealmManager.insert(realm,holdingResponses);
            realm.close();
            MainActivity.holdingResponses = holdingResponses;
            MainActivity.holdingResponse = holdingResponses.get(prefs.getInt(Statics.SELECTED_POSITION,0));
            startActivity(new Intent(this,MenuActivity.class));
        }else{
            DesignUtils.infoMessage(this,"Ingreso","No tiene ningún edificio contratado");
        }

    }

    @Override
    public void onDownloadError(String msg) {
        mProgressDialog.dismiss();
        if (msg.equals("salir")){
            DesignUtils.showToast(this,"Vuelve a inicar sesión por favor");
            start(LoginActivity.class);
        }else {
            DesignUtils.errorMessage(this, "Descarga", msg);
        }
    }
}