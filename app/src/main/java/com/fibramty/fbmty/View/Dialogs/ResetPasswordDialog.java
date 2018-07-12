package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.fibramty.fbmty.Network.Request.ResetPasswordRequest;
import com.fibramty.fbmty.Presenter.Callbacks.ResetPasswordCallback;
import com.fibramty.fbmty.Presenter.ResetPasswordPresenter;
import com.fibramty.fbmty.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ResetPasswordDialog extends Activity implements ResetPasswordCallback {

    @BindView(R.id.act_recovery_email)EditText emailEdt;

    ProgressDialog mProgressDialog;
    ResetPasswordPresenter resetPasswordPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_reset_password);
        ButterKnife.bind(this);
        this.setFinishOnTouchOutside(false);
        resetPasswordPresenter = new ResetPasswordPresenter(this,this);
    }

    @OnClick(R.id.act_recovery_sent)
    public void onCResetPassword(){
        String email = emailEdt.getText().toString().trim().toLowerCase();
        if (!email.isEmpty()){
            if (isValidEmail(email)){
            mProgressDialog = ProgressDialog.show(this, null, "Enviando...");
            mProgressDialog.setCancelable(false);
            ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest(emailEdt.getText().toString());
            resetPasswordPresenter.register(resetPasswordRequest);
        }else{
            Toast.makeText(this,"Formato de correo incorrecto. Intente nuevamente",Toast.LENGTH_LONG).show();
        }
    }else{
        Toast.makeText(this,"Favor de ingresar correo electrónico",Toast.LENGTH_LONG).show();
    }
    }


    @Override
    public void onSuccessResetPassword(String msg) {
        mProgressDialog.dismiss();
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void onErrorResetPassword(String msg) {
        mProgressDialog.dismiss();
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
        finish();
    }

    public final static boolean isValidEmail(String email) {
        if (TextUtils.isEmpty(email)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }
    }
}
