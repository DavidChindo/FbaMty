package com.fibramty.fbmty.Presenter;

import android.content.Context;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.LogicUtils;
import com.fibramty.fbmty.Presenter.Callbacks.TicketCallback;
import com.fibramty.fbmty.R;

import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 5/2/18.
 */

public class TicketPresenter {


    private final TicketCallback mTicketCallback;
    private Context mContext;

    public TicketPresenter(Context context, TicketCallback ticketCallback){
        this.mTicketCallback= ticketCallback;
        this.mContext = context;
    }

    public void uploadTicket(ArrayList<String> files,String description, String serviceId, String holdingId){
        if (Connection.isConnected(mContext)){
            try {
                MediaType TYPE_MULTIPART = MediaType.parse("multipart/form-data");
                MultipartBody.Part body = null;

                String nameZip = UUID.randomUUID().toString();
                String path = zip(files, nameZip);
                final File file = new File(path);
                if (file.exists()) {
                    //final RequestBody requestFile = RequestBody.create(MediaType.parse("zip/*"), file);
                    final RequestBody requestFile = RequestBody.create(TYPE_MULTIPART, file);
                    body = MultipartBody.Part.createFormData("file", nameZip+".zip", requestFile);
                }

                RequestBody mServiceId = RequestBody.create(TYPE_MULTIPART,serviceId);
                RequestBody mHoldingid = RequestBody.create(TYPE_MULTIPART,holdingId);
                RequestBody mDescription = RequestBody.create(TYPE_MULTIPART,description);

                if (file.exists()) {
                    Call<Long> call = FbMtyApp.getFbMtyWebService().sendTicket("bearer " + RealmManager.token(), body,
                            mServiceId , mHoldingid, mDescription);
                    call.enqueue(new Callback<Long>() {
                        @Override
                        public void onResponse(Call<Long> call, Response<Long> response) {
                            if (response.code() == 200) {
                                mTicketCallback.onSentTicketSuccess("Se ha enviado correctamente el ticket número : "+response.body());
                            } else {
                                mTicketCallback.onSentTicketError(response.message());
                            }
                        }

                        @Override
                        public void onFailure(Call<Long> call, Throwable t) {
                            t.printStackTrace();
                            mTicketCallback.onSentTicketError(t.getMessage());
                        }
                    });
                }
            }catch (Exception e){
                e.printStackTrace();
                mTicketCallback.onSentTicketError(e.getMessage());
            }
        }else{
            mTicketCallback.onSentTicketError(mContext.getString(R.string.network_error));
        }
    }

    private String zip(ArrayList<String> filesm, String numRequisition){
        return  LogicUtils.compressZip(mContext,numRequisition,filesm);
    }
}
