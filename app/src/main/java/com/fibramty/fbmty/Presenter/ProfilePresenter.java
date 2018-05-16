package com.fibramty.fbmty.Presenter;


import android.content.Context;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Presenter.Callbacks.ProfileCallback;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 5/16/18.
 */

public class ProfilePresenter {

    private final ProfileCallback mProfileCallback;
    private Context mContext;

    public ProfilePresenter(ProfileCallback mProfileCallback, Context mContext) {
        this.mProfileCallback = mProfileCallback;
        this.mContext = mContext;
    }

    public void logOut(){
        try {
            if (Connection.isConnected(mContext)){
                Call<ResponseBody> call = FbMtyApp.getFbMtyWebService().logOut("bearer " + RealmManager.token());
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        if (response.code() == Statics.OK){
                            mProfileCallback.logoutSuccess("Sesión Finalizada");
                        }else{
                            try {
                                mProfileCallback.logoutError(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        t.printStackTrace();
                        mProfileCallback.logoutError(t.getMessage());
                    }
                });
            }else{
                mProfileCallback.logoutError("No hay conexión a Internet");
            }
        }catch (Exception e){
            e.printStackTrace();
            mProfileCallback.logoutError(e.getMessage());
        }

    }
}
