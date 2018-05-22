package com.fibramty.fbmty.Presenter;

import android.content.Context;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Response.ServicesDescResponse;
import com.fibramty.fbmty.Presenter.Callbacks.ParkingsRequestCallback;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 5/17/18.
 */

public class ParkingsRequestPresentet {

    private final ParkingsRequestCallback mParkingsRequestCallback;
    private Context mContext;

    public ParkingsRequestPresentet(ParkingsRequestCallback parkingsRequestCallback, Context context) {
        this.mParkingsRequestCallback = parkingsRequestCallback;
        this.mContext = context;
    }

    public void cajonesEstByUserAndHolding(long idHolding){
        try {
            if (Connection.isConnected(mContext)){
                Call<List<ServicesDescResponse>> call = FbMtyApp.getFbMtyWebService().cajonesEstByUserAndHolding("bearer " + RealmManager.token(),idHolding);
                call.enqueue(new Callback<List<ServicesDescResponse>>() {
                    @Override
                    public void onResponse(Call<List<ServicesDescResponse>> call, Response<List<ServicesDescResponse>> response) {
                        if (response.code() == Statics.OK){
                            mParkingsRequestCallback.onLoadServicesParkings(response.body());
                        }else {
                            try {
                                mParkingsRequestCallback.onErrorServicesParkings(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<List<ServicesDescResponse>> call, Throwable t) {
                        t.printStackTrace();
                        mParkingsRequestCallback.onErrorServicesParkings(t.getMessage());
                    }
                });
            }else{
                mParkingsRequestCallback.onErrorServicesParkings("No hay conexión a Internet.");
            }
        }catch (Exception e){
            e.printStackTrace();
            mParkingsRequestCallback.onErrorServicesParkings(e.getMessage());
        }
    }

    public void tarjetasEstByUserAndHolding(long idHolding){
        try {
            if (Connection.isConnected(mContext)){
                Call<List<ServicesDescResponse>> call = FbMtyApp.getFbMtyWebService().tarjetasEstByUserAndHolding("bearer " + RealmManager.token(),idHolding);
                call.enqueue(new Callback<List<ServicesDescResponse>>() {
                    @Override
                    public void onResponse(Call<List<ServicesDescResponse>> call, Response<List<ServicesDescResponse>> response) {
                        if (response.code() == Statics.OK){
                            mParkingsRequestCallback.onLoadServicesParkings(response.body());
                        }else {
                            try {
                                mParkingsRequestCallback.onErrorServicesParkings(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<List<ServicesDescResponse>> call, Throwable t) {
                        t.printStackTrace();
                        mParkingsRequestCallback.onErrorServicesParkings(t.getMessage());
                    }
                });
            }else{
                mParkingsRequestCallback.onErrorServicesParkings("No hay conexión a Internet.");
            }
        }catch (Exception e){
            e.printStackTrace();
            mParkingsRequestCallback.onErrorServicesParkings(e.getMessage());
        }
    }

    public void CortesiasEstByUserAndHolding(long idHolding){
        try {
            if (Connection.isConnected(mContext)){
                Call<List<ServicesDescResponse>> call = FbMtyApp.getFbMtyWebService().CortesiasEstByUserAndHolding("bearer " + RealmManager.token(),idHolding);
                call.enqueue(new Callback<List<ServicesDescResponse>>() {
                    @Override
                    public void onResponse(Call<List<ServicesDescResponse>> call, Response<List<ServicesDescResponse>> response) {
                        if (response.code() == Statics.OK){
                            mParkingsRequestCallback.onLoadServicesParkings(response.body());
                        }else {
                            try {
                                mParkingsRequestCallback.onErrorServicesParkings(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<List<ServicesDescResponse>> call, Throwable t) {
                        t.printStackTrace();
                        mParkingsRequestCallback.onErrorServicesParkings(t.getMessage());
                    }
                });
            }else{
                mParkingsRequestCallback.onErrorServicesParkings("No hay conexión a Internet.");
            }
        }catch (Exception e){
            e.printStackTrace();
            mParkingsRequestCallback.onErrorServicesParkings(e.getMessage());
        }
    }


    public void sentCajonesEst(long idHolding,long id, int numCortesias, int numMntos, int precioCortesia, int precioMnto, int tipoAccion){
        try {
            if (Connection.isConnected(mContext)){
                Call<Long> call = FbMtyApp.getFbMtyWebService().sendCajonesEstTickets("bearer "+RealmManager.token(),idHolding,id,numCortesias,numMntos,precioCortesia,precioMnto,tipoAccion);
                call.enqueue(new Callback<Long>() {
                    @Override
                    public void onResponse(Call<Long> call, Response<Long> response) {
                        if (response.code() == Statics.OK){
                            mParkingsRequestCallback.onSuccessSubmitTicketService("Su Ticket "+ response.body()+" se ha enviado, se notificará por correo el estatus o bien desde su bandeja de ticket");
                        }else{
                            try {
                                mParkingsRequestCallback.onReloadServicesList();
                                mParkingsRequestCallback.onErrorSubmitTicketService(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<Long> call, Throwable t) {
                        t.printStackTrace();
                        mParkingsRequestCallback.onErrorSubmitTicketService(t.getMessage());
                    }
                });
            }else {
                mParkingsRequestCallback.onErrorSubmitTicketService("No hay conexión a Internet");
            }
        }catch (Exception e){
            e.printStackTrace();
            mParkingsRequestCallback.onErrorSubmitTicketService(e.getMessage());
        }
    }

    public void sendTarjetasEstTickets(long idHolding,long id, int numCortesias, int priceCortesias){
        try {
            if (Connection.isConnected(mContext)){
                Call<Long> call = FbMtyApp.getFbMtyWebService().sendTarjetasEstTickets("bearer "+RealmManager.token(),idHolding,id,numCortesias,priceCortesias);
                call.enqueue(new Callback<Long>() {
                    @Override
                    public void onResponse(Call<Long> call, Response<Long> response) {
                        if (response.code() == Statics.OK){
                            mParkingsRequestCallback.onReloadServicesList();
                            mParkingsRequestCallback.onSuccessSubmitTicketService("Su Ticket "+ response.body()+" se ha enviado, se notificará por correo el estatus o bien desde su bandeja de ticket");
                        }else{
                            try {
                                mParkingsRequestCallback.onErrorSubmitTicketService(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<Long> call, Throwable t) {
                        t.printStackTrace();
                        mParkingsRequestCallback.onErrorSubmitTicketService(t.getMessage());
                    }
                });
            }else {
                mParkingsRequestCallback.onErrorSubmitTicketService("No hay conexión a Internet");
            }
        }catch (Exception e){
            e.printStackTrace();
            mParkingsRequestCallback.onErrorSubmitTicketService(e.getMessage());
        }
    }

    public void sendCortesiasEstTickets(long idHolding,long id, int numCortesias, int priceCortesias){

        try {
            if (Connection.isConnected(mContext)){
                Call<Long> call = FbMtyApp.getFbMtyWebService().sendCortesiasEstTickets("bearer "+RealmManager.token(),idHolding,id,numCortesias,priceCortesias);
                call.enqueue(new Callback<Long>() {
                    @Override
                    public void onResponse(Call<Long> call, Response<Long> response) {
                        if (response.code() == Statics.OK){
                            mParkingsRequestCallback.onSuccessSubmitTicketService("Su Ticket "+ response.body()+" se ha enviado, se notificará por correo el estatus o bien desde su bandeja de ticket");
                        }else{
                            try {
                                mParkingsRequestCallback.onReloadServicesList();
                                mParkingsRequestCallback.onErrorSubmitTicketService(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<Long> call, Throwable t) {
                        t.printStackTrace();
                        mParkingsRequestCallback.onErrorSubmitTicketService(t.getMessage());
                    }
                });
            }else {
                mParkingsRequestCallback.onErrorSubmitTicketService("No hay conexión a Internet");
            }
        }catch (Exception e){
            e.printStackTrace();
            mParkingsRequestCallback.onErrorSubmitTicketService(e.getMessage());
        }
    }
}
