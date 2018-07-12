package com.fibramty.fbmty.View.Activity;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.LogicUtils;
import com.fibramty.fbmty.Library.Prefs;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.LoginRequest;
import com.fibramty.fbmty.Network.Request.RegisterRequest;
import com.fibramty.fbmty.Network.Response.HoldingResponse;
import com.fibramty.fbmty.Network.Response.LoginResponse;
import com.fibramty.fbmty.Presenter.Callbacks.HoldingCallback;
import com.fibramty.fbmty.Presenter.Callbacks.LoginCallback;
import com.fibramty.fbmty.Presenter.HoldingPresenter;
import com.fibramty.fbmty.Presenter.LoginPresenter;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Dialogs.ResetPasswordDialog;
import com.lespinside.simplepanorama.view.SphericalView;
import com.panoramagl.utils.PLUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;

public class LoginActivity extends AppCompatActivity implements LoginCallback,HoldingCallback{

    @BindView(R.id.act_login_username)EditText usernameEdt;
    @BindView(R.id.act_login_password)EditText passwordEdt;
    LoginPresenter loginPresenter;
    HoldingPresenter holdingPresenter;
    ProgressDialog mProgressDialog;
    private static String TAG = LoginActivity.class.getSimpleName();
    Prefs prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initViews();
        prefs = Prefs.with(LoginActivity.this);
        loginPresenter = new LoginPresenter(this,this);
        holdingPresenter = new HoldingPresenter(this,this);

        if (Build.VERSION.SDK_INT >=23) {
            LogicUtils.requestPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
            LogicUtils.requestPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
        }
    }

    private void initViews(){// JUST FOR TESTING
        usernameEdt.setText("shiniwes@hotmail.com");
        passwordEdt.setText("Fibra123$");
    }

    @OnClick(R.id.act_login_enter)
    void onLoginClick(){
        String message = DesignUtils.validateCredentials(this,usernameEdt.getText().toString(),passwordEdt.getText().toString());
        if (message.isEmpty()){
            if (Connection.isConnected(this)) {
                mProgressDialog = ProgressDialog.show(this, null, "Autenticando...");
                mProgressDialog.setCancelable(false);
                LoginRequest loginRequest = new LoginRequest(usernameEdt.getText().toString().trim(), passwordEdt.getText().toString().trim(), "","password");
                loginPresenter.login(loginRequest);
            }else{
                DesignUtils.errorMessage(this,"",R.string.network_error);
            }
        }else{
            DesignUtils.errorMessage(this,"",message);
        }
    }

    @OnClick(R.id.act_login_register)
    void onRegisterClick(){
        startActivity(new Intent(this, RegisterActivity.class));
    }

    @OnClick(R.id.act_login_recovery)
    void onResetPasswordClick(){
        startActivity(new Intent(this, ResetPasswordDialog.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onLoginSuccess(LoginResponse loginResponse) {
        if (loginResponse != null){
            Realm realm = Realm.getDefaultInstance();
            RealmManager.saveUser(loginResponse, realm);
            realm.close();
            mProgressDialog.setMessage("Descargando...");
            holdingPresenter.holding();
        }
    }

    @Override
    public void onLoginError(String msg) {
        mProgressDialog.dismiss();
        DesignUtils.errorMessage(this,"Error Credenciales",msg);
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
        DesignUtils.errorMessage(this,"Descarga",msg);
    }
}

