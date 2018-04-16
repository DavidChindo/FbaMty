package com.fibramty.fbmty.Presenter;

import android.content.Context;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.fibramty.fbmty.Network.Response.HoldingResponse;
import com.fibramty.fbmty.Presenter.Callbacks.ChatCallback;
import com.fibramty.fbmty.Presenter.Callbacks.PaymentsCallback;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 4/16/18.
 */

public class PaymentsPresenter {


    private final PaymentsCallback mPaymentsCallback;
    private Context mContext;

    public PaymentsPresenter(Context context, PaymentsCallback paymentsCallback){
        this.mPaymentsCallback= paymentsCallback;
        this.mContext = context;
    }

    public void payments(){
        try {
            if (Connection.isConnected(mContext)){
                Call<List<Payment>> call = FbMtyApp.getFbMtyWebService().payments("bearer " + RealmManager.token());
                call.enqueue(new Callback<List<Payment>>() {
                    @Override
                    public void onResponse(Call<List<Payment>> call, Response<List<Payment>> response) {
                        if (response.code() == Statics.OK){
                            mPaymentsCallback.onPaymentsSuccess(response.body());
                        }else{
                            mPaymentsCallback.onPaymentsError(response.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Payment>> call, Throwable t) {
                        t.printStackTrace();
                        mPaymentsCallback.onPaymentsError(t.getMessage());
                    }
                });
            }else {
                mPaymentsCallback.onPaymentsError("No hay conexión a Internet");
            }
        }catch (Exception e){
            e.printStackTrace();
            mPaymentsCallback.onPaymentsError(e.getMessage());
        }
    }

}
