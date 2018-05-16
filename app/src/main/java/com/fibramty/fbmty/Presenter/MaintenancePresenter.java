package com.fibramty.fbmty.Presenter;

import android.content.Context;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.fibramty.fbmty.Presenter.Callbacks.MaintenanceCallback;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 5/16/18.
 */

public class MaintenancePresenter {

    private final MaintenanceCallback mMaintenanceCallback;
    private Context mContext;

     public MaintenancePresenter(Context context, MaintenanceCallback maintenanceCallback){
         this.mMaintenanceCallback = maintenanceCallback;
         this.mContext = context;
     }

     public void maintenances(long idHolding){
         try {
             if (Connection.isConnected(mContext)){
                 Call<List<Maintenance>> call = FbMtyApp.getFbMtyWebService().maintenances("bearer "+ RealmManager.token(),idHolding);
                 call.enqueue(new Callback<List<Maintenance>>() {
                     @Override
                     public void onResponse(Call<List<Maintenance>> call, Response<List<Maintenance>> response) {
                         if (response.code() == Statics.OK){
                             mMaintenanceCallback.onLoadMaintenance(response.body());
                         }else{
                             try {
                                 mMaintenanceCallback.onErrorMaintenance(response.errorBody().string());
                             } catch (IOException e) {
                                 e.printStackTrace();
                             }
                         }
                     }
                     @Override
                     public void onFailure(Call<List<Maintenance>> call, Throwable t) {
                         t.printStackTrace();
                         mMaintenanceCallback.onErrorMaintenance(t.getMessage());
                     }
                 });

             }else{
                 mMaintenanceCallback.onErrorMaintenance("No hay conexión a internet");
             }
         }catch (Exception e){
             e.printStackTrace();
             mMaintenanceCallback.onErrorMaintenance(e.getMessage());
         }
     }
}
