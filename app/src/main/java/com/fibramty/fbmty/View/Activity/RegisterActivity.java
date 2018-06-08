package com.fibramty.fbmty.View.Activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.widget.EditText;
import android.widget.Toast;

import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Network.Request.RegisterRequest;
import com.fibramty.fbmty.Presenter.Callbacks.RegisterCallback;
import com.fibramty.fbmty.Presenter.RegisterPresenter;
import com.fibramty.fbmty.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends Activity implements RegisterCallback{

    @BindView(R.id.act_register_pass)TextInputLayout passEdt;
    @BindView(R.id.act_register_confirm)TextInputLayout confirmEdt;

    @BindViews({R.id.act_register_email,R.id.act_register_pass,
            R.id.act_register_confirm,R.id.act_register_rfc ,R.id.act_register_numclient})List<TextInputLayout> fields;

    RegisterPresenter registerPresenter;
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        registerPresenter = new RegisterPresenter(this,this);

    }

    @OnClick(R.id.act_register_registrar)
    void onRegister(){
        mProgressDialog = ProgressDialog.show(this, null, "Enviando...");
        mProgressDialog.setCancelable(false);
        registerPresenter.valid(fields);
    }

    @Override
    public void onSuccessRegister(String msg) {
        mProgressDialog.dismiss();
        DesignUtils.showDialogWithFinish("Registro",msg,this);
    }

    @Override
    public void onErrorRegister(String msg) {
        mProgressDialog.dismiss();
        DesignUtils.showToast(this,msg);
        finish();
    }

    @Override
    public void onValidFields(Boolean isValid, String msg) {
        if (isValid){
            registerPresenter.validPassword(passEdt,confirmEdt);
        }else{
            mProgressDialog.dismiss();
            DesignUtils.errorMessage(this,"Validación",msg);
        }
    }

    @Override
    public void onValidPassword(Boolean isEquals, String msg) {
        if (isEquals){
            RegisterRequest registerRequest = new RegisterRequest(fields.get(0).getEditText().getText().toString(),
                    fields.get(1).getEditText().getText().toString(), fields.get(2).getEditText().getText().toString(),
                    fields.get(3).getEditText().getText().toString(), fields.get(4).getEditText().getText().toString());
            registerPresenter.register(registerRequest);
        }else{
            mProgressDialog.dismiss();
            DesignUtils.errorMessage(this,"Validación",msg);
        }

    }
}
