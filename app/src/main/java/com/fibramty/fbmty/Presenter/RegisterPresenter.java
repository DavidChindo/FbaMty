package com.fibramty.fbmty.Presenter;

import android.content.Context;
import android.support.design.widget.TextInputLayout;

import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.Network.Request.RegisterRequest;

import com.fibramty.fbmty.Presenter.Callbacks.RegisterCallback;
import com.fibramty.fbmty.R;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 4/10/18.
 */

public class RegisterPresenter {

    private final RegisterCallback mRegisterCallback;
    private Context mContext;

    public RegisterPresenter(Context context, RegisterCallback registerCallback){
        this.mRegisterCallback = registerCallback;
        this.mContext = context;
    }

    public void valid(List<TextInputLayout> fields){
        boolean isValid = true;
        String msg = "";
        for (TextInputLayout edt : fields) {
            if (Validators.validateEdt(edt.getEditText().getText().toString())) {
                isValid &= true;
            }else {
                msg = mContext.getString(R.string.validate_field, edt.getHint());
                isValid &= false;
                break;
            }
        }

        mRegisterCallback.onValidFields(isValid,msg);
    }

    public void validPassword(TextInputLayout pass, TextInputLayout confirmPass){
        if (pass.getEditText().getText().toString().equals(confirmPass.getEditText().getText().toString()))
            mRegisterCallback.onValidPassword(true,"");
        else
            mRegisterCallback.onValidPassword(false,mContext.getString(R.string.act_register_not_pass_equals));
    }

    public void register(final RegisterRequest registerRequest){
        if (Connection.isConnected(mContext)){
            try {
                Call<ResponseBody> call = FbMtyApp.getFbMtyWebService().register(registerRequest);
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        if (response.code() == Statics.OK){
                            mRegisterCallback.onSuccessRegister(mContext.getString(R.string.msg_success,"Registro"));
                        }else{
                            mRegisterCallback.onErrorRegister("Por el momento no es posible registrar");
                        }
                    }
                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        mRegisterCallback.onErrorRegister(t.getMessage());
                    }
                });
            }catch (Exception e){
                e.printStackTrace();
                mRegisterCallback.onErrorRegister(e.getMessage());
            }
        }else{
            mRegisterCallback.onErrorRegister(mContext.getString(R.string.network_error));
        }
    }

}
