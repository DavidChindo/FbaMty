package com.fibramty.fbmty.Presenter;

import android.content.Context;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Response.HoldingResponse;
import com.fibramty.fbmty.Presenter.Callbacks.HoldingCallback;

import java.io.IOException;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 12/6/17.
 */

public class HoldingPresenter {

    private final HoldingCallback mHoldingCallback;
    private Context mContext;


    public HoldingPresenter(Context context, HoldingCallback mainCallback){
        this.mHoldingCallback = mainCallback;
        this.mContext = context;
    }

    public void holding(){
        try {
            if (Connection.isConnected(mContext)){
                Call<List<HoldingResponse>> call = FbMtyApp.getFbMtyWebService().holdingByUser("bearer " + RealmManager.token());
                call.enqueue(new Callback<List<HoldingResponse>>() {
                    @Override
                    public void onResponse(Call<List<HoldingResponse>> call, Response<List<HoldingResponse>> response) {
                        if (response.code() == Statics.code_OK){
                            mHoldingCallback.onDownloadHolding(response.body());
                        }else{
                            try {
                                mHoldingCallback.onDownloadError(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<List<HoldingResponse>> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
            }else {
                mHoldingCallback.onDownloadError("No hay conexión a Internet");
            }
        }catch (Exception e){
            e.printStackTrace();
            mHoldingCallback.onDownloadError(e.getMessage());
        }
    }
}