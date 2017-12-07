package com.fibramty.fbmty.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Network.Request.LoginRequest;
import com.fibramty.fbmty.Network.Response.LoginResponse;
import com.fibramty.fbmty.Presenter.Callbacks.LoginCallback;
import com.fibramty.fbmty.Presenter.LoginPresenter;
import com.fibramty.fbmty.R;
import com.lespinside.simplepanorama.view.SphericalView;
import com.panoramagl.utils.PLUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginCallback{

    @BindView(R.id.spherical_view)SphericalView sphericalView;
    @BindView(R.id.act_login_username)EditText usernameEdt;
    @BindView(R.id.act_login_password)EditText passwordEdt;
    LoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initViews();
        loginPresenter = new LoginPresenter(this,this);
    }

    private void initViews(){
        sphericalView.setPanorama(PLUtils.getBitmap(this, R.drawable.img1), false);
        sphericalView.setAccelerometerEnabled(true);
        sphericalView.setInertiaEnabled(true);
        sphericalView.setDefaultRotationSensibility(100);
    }

    @OnClick(R.id.act_login_enter)
    void onLoginClick(){
        String message = DesignUtils.validateCredentials(this,usernameEdt.getText().toString(),passwordEdt.getText().toString());
        if (message.isEmpty()){
            LoginRequest loginRequest = new LoginRequest(usernameEdt.getText().toString().trim(),passwordEdt.getText().toString().trim(),"");
            loginPresenter.login(loginRequest);
        }else{
            DesignUtils.errorMessage(this,"",message);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        sphericalView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sphericalView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sphericalView.onDestroy();
    }

    @Override
    public void onLoginSuccess(LoginResponse loginResponse) {
        if (loginResponse != null){
            startActivity(new Intent(this,MainActivity.class));
        }
    }

    @Override
    public void onLoginError(String msg) {
        DesignUtils.errorMessage(this,"Error Credenciales",msg);
    }
}

