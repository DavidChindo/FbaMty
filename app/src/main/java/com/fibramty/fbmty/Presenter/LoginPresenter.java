package com.fibramty.fbmty.Presenter;

import android.app.AlertDialog;
import android.content.Context;

import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.LoginRequest;
import com.fibramty.fbmty.Network.Response.LoginResponse;
import com.fibramty.fbmty.Presenter.Callbacks.LoginCallback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 12/7/17.
 */

public class LoginPresenter {

    private final LoginCallback mLoginCallback;

    public LoginPresenter(Context context, LoginCallback loginCallback){
        this.mLoginCallback = loginCallback;
    }

    public void login(LoginRequest loginRequest){
        try {
            Call<LoginResponse> call = FbMtyApp.getFbMtyWebService().login(loginRequest.getGrantType(),loginRequest.getUsername(),loginRequest.getPassword(),loginRequest.getPushId());
            call.enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    if (response.code() == Statics.OK){
                        mLoginCallback.onLoginSuccess(response.body());
                    }else{
                        mLoginCallback.onLoginError(response.message());
                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    mLoginCallback.onLoginError(t.getMessage());
                }
            });
        }catch (Exception e){
            e.printStackTrace();
            mLoginCallback.onLoginError(e.getMessage());
        }
    }
}
