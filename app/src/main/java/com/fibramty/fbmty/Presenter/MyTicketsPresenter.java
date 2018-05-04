package com.fibramty.fbmty.Presenter;

import android.content.Context;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.ActionTicketRequest;
import com.fibramty.fbmty.Network.Response.MyTicketResponse;
import com.fibramty.fbmty.Presenter.Callbacks.MyTicketsCallback;
import com.fibramty.fbmty.R;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 4/21/18.
 */

public class MyTicketsPresenter {

    private final MyTicketsCallback myTicketsCallback;
    private Context mContext;

    public MyTicketsPresenter(Context context, MyTicketsCallback myTicketsCallback){
        this.myTicketsCallback= myTicketsCallback;
        this.mContext = context;
    }

    public void myTickets(Long idHolding){
        try {
            if (Connection.isConnected(mContext)){
                Call<List<MyTicketResponse>> call = FbMtyApp.getFbMtyWebService().myTickets("bearer " + RealmManager.token(),idHolding);
                call.enqueue(new Callback<List<MyTicketResponse>>() {
                    @Override
                    public void onResponse(Call<List<MyTicketResponse>> call, Response<List<MyTicketResponse>> response) {
                        if (response.code() == Statics.OK){
                            myTicketsCallback.onSuccessMyTickets(response.body());
                        }else{
                            try {
                                myTicketsCallback.onErrorMyTickets(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<List<MyTicketResponse>> call, Throwable t) {
                        t.printStackTrace();
                        myTicketsCallback.onErrorMyTickets(t.getMessage());
                    }
                });
            }else {
                myTicketsCallback.onErrorMyTickets("No hay conexión a Internet");
            }
        }catch (Exception e){
            e.printStackTrace();
            myTicketsCallback.onErrorMyTickets(e.getMessage());
        }
    }

    public void cancelMyTicket(ActionTicketRequest actionTicketRequest){
        if (Connection.isConnected(mContext)) {
            try {
                long idHolding = actionTicketRequest.getHoldingId();
                long id = actionTicketRequest.getId();
                Call<ResponseBody> call = FbMtyApp.getFbMtyWebService().cancelTicket("bearer "+RealmManager.token(),idHolding,id);
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        if (response.code() == Statics.OK){
                            myTicketsCallback.onSuccessCancel("Se ha cancelado correctamente el ticket");
                        }else{
                            try {
                                myTicketsCallback.onErrorCancel(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        t.printStackTrace();
                        myTicketsCallback.onErrorCancel(t.getMessage());
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                myTicketsCallback.onErrorCancel(e.getMessage());
            }
        }else{
            myTicketsCallback.onErrorCancel(mContext.getString(R.string.network_error));
        }
    }

    public void deleteMyTicket(ActionTicketRequest actionTicketRequest){
        if (Connection.isConnected(mContext)){
            try {
                long idHolding = actionTicketRequest.getHoldingId();
                long id = actionTicketRequest.getId();
                Call<ResponseBody> call = FbMtyApp.getFbMtyWebService().deleteTicket("bearer "+RealmManager.token(),idHolding,id);
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        if (response.code() == Statics.OK){
                            myTicketsCallback.onSuccessDelete("Se ha eliminado correctamente el ticket");
                        }else{
                            try {
                                myTicketsCallback.onErrorDelete(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        t.printStackTrace();
                        myTicketsCallback.onErrorDelete(t.getMessage());
                    }
                });
            }catch (Exception e){
                e.printStackTrace();
                myTicketsCallback.onErrorDelete(e.getMessage());
            }
        }else{
            myTicketsCallback.onErrorDelete(mContext.getString(R.string.network_error));
        }
    }
}
