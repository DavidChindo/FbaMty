package com.fibramty.fbmty.Presenter;

import android.content.Context;

import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.ResetPasswordRequest;
import com.fibramty.fbmty.Presenter.Callbacks.ResetPasswordCallback;
import com.fibramty.fbmty.R;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 7/12/18.
 */

public class ResetPasswordPresenter {

    private final ResetPasswordCallback mResetPassword;
    private Context mContext;

    public ResetPasswordPresenter(Context context, ResetPasswordCallback registerCallback){
        this.mResetPassword = registerCallback;
        this.mContext = context;
    }

    public void register(final ResetPasswordRequest resetPasswordRequest){
        if (Connection.isConnected(mContext)){
            try {
                Call<ResponseBody> call = FbMtyApp.getFbMtyWebService().resetPassword(resetPasswordRequest);
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        if (response.code() == Statics.OK){
                            mResetPassword.onSuccessResetPassword("Se ha enviado un enlace a su correo para recuperar su contraseña");
                        }else{
                            mResetPassword.onErrorResetPassword("No se ha encontrado su correo electrónico");
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        mResetPassword.onErrorResetPassword(t.getMessage());
                    }
                });

            }catch (Exception e){
                e.printStackTrace();
                mResetPassword.onErrorResetPassword(e.getMessage());
            }
        }else{
            mResetPassword.onErrorResetPassword(mContext.getString(R.string.network_error));
        }
    }


}
