package com.fibramty.fbmty.Presenter;

import android.content.Context;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Response.ServicesDataResponse;
import com.fibramty.fbmty.Presenter.Callbacks.ParkingsInboxCallback;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 5/18/18.
 */

public class ParkingsInboxPresenter {

    private final ParkingsInboxCallback mParkingsInboxCallback;
    private Context mContext;

    public ParkingsInboxPresenter(ParkingsInboxCallback parkingsInboxCallback, Context context) {
        this.mParkingsInboxCallback = parkingsInboxCallback;
        this.mContext = context;
    }

    public void getHoldingUserParkingLotsTickets(long idholding){
        try {
            if (Connection.isConnected(mContext)) {
                Call<List<ServicesDataResponse>> call = FbMtyApp.getFbMtyWebService().getHoldingUserParkingLotsTickets("bearer " + RealmManager.token(),idholding);
                call.enqueue(new Callback<List<ServicesDataResponse>>() {
                    @Override
                    public void onResponse(Call<List<ServicesDataResponse>> call, Response<List<ServicesDataResponse>> response) {

                        if (response.code() == Statics.OK){

                            mParkingsInboxCallback.onLoadServicesData(response.body());

                        }else{

                            try {
                                mParkingsInboxCallback.onErrorServicesData(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    }

                    @Override
                    public void onFailure(Call<List<ServicesDataResponse>> call, Throwable t) {

                        t.printStackTrace();
                        mParkingsInboxCallback.onErrorServicesData(t.getMessage());

                    }
                });
            }else{
                mParkingsInboxCallback.onErrorServicesData("No hay conexión a Internet.");
            }
        }catch (Exception e){
            e.printStackTrace();
            mParkingsInboxCallback.onErrorServicesData(e.getMessage());
        }
    }

    public void getHoldingUserParkingMembershipsTickets(long idholding){
        try {
            if (Connection.isConnected(mContext)) {
                Call<List<ServicesDataResponse>> call = FbMtyApp.getFbMtyWebService().getHoldingUserParkingMembershipsTickets("bearer " + RealmManager.token(),idholding);
                call.enqueue(new Callback<List<ServicesDataResponse>>() {
                    @Override
                    public void onResponse(Call<List<ServicesDataResponse>> call, Response<List<ServicesDataResponse>> response) {

                        if (response.code() == Statics.OK){

                            mParkingsInboxCallback.onLoadServicesData(response.body());

                        }else{

                            try {
                                mParkingsInboxCallback.onErrorServicesData(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    }

                    @Override
                    public void onFailure(Call<List<ServicesDataResponse>> call, Throwable t) {

                        t.printStackTrace();
                        mParkingsInboxCallback.onErrorServicesData(t.getMessage());

                    }
                });
            }else{
                mParkingsInboxCallback.onErrorServicesData("No hay conexión a Internet.");
            }
        }catch (Exception e){
            e.printStackTrace();
            mParkingsInboxCallback.onErrorServicesData(e.getMessage());
        }
    }

    public void getHoldingUserParkingCardsTickets(long idholding){
        try {
            if (Connection.isConnected(mContext)) {
                Call<List<ServicesDataResponse>> call = FbMtyApp.getFbMtyWebService().getHoldingUserParkingCardsTickets("bearer " + RealmManager.token(),idholding);
                call.enqueue(new Callback<List<ServicesDataResponse>>() {
                    @Override
                    public void onResponse(Call<List<ServicesDataResponse>> call, Response<List<ServicesDataResponse>> response) {

                        if (response.code() == Statics.OK){

                            mParkingsInboxCallback.onLoadServicesData(response.body());

                        }else{

                            try {
                                mParkingsInboxCallback.onErrorServicesData(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    }

                    @Override
                    public void onFailure(Call<List<ServicesDataResponse>> call, Throwable t) {

                        t.printStackTrace();
                        mParkingsInboxCallback.onErrorServicesData(t.getMessage());

                    }
                });
            }else{
                mParkingsInboxCallback.onErrorServicesData("No hay conexión a Internet.");
            }
        }catch (Exception e){
            e.printStackTrace();
            mParkingsInboxCallback.onErrorServicesData(e.getMessage());
        }
    }
}
