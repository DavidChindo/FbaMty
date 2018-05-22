package com.fibramty.fbmty.Presenter;

import android.content.Context;
import android.widget.EditText;

import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.FbMtyApp;
import com.fibramty.fbmty.Library.Connection;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.Network.Response.MessageResponse;
import com.fibramty.fbmty.Presenter.Callbacks.ChatCallback;
import com.fibramty.fbmty.R;

import java.io.IOException;
import java.util.List;

import io.realm.RealmList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by david.barrera on 4/11/18.
 */

public class ChatPresenter {

    private final ChatCallback mChatCallback;
    private Context mContext;

    public ChatPresenter(Context context, ChatCallback chatCallback){
        this.mChatCallback= chatCallback;
        this.mContext = context;
    }

    public void valid(EditText field){
        boolean isValid = true;
        String msg = "";
        if (Validators.validateEdt(field.getText().toString())) {
            isValid &= true;
        }else {
            msg = mContext.getString(R.string.validate_field, "Mensaje");
            isValid &= false;
        }
        mChatCallback.onValid(isValid,msg);
    }

    public void chatSent(String msg,long idHolding){
        try {
            if (Connection.isConnected(mContext)){
                Call<Boolean> call = FbMtyApp.getFbMtyWebService().sentMessage("bearer "+ RealmManager.token(),idHolding,msg);
                call.enqueue(new Callback<Boolean>() {
                    @Override
                    public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                        if (response.code() == Statics.OK){
                            mChatCallback.onSuccessSentMessage(response.body());
                        }else{
                            try {
                                mChatCallback.onErrorSentMessage(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<Boolean> call, Throwable t) {
                        t.printStackTrace();
                        mChatCallback.onErrorSentMessage(t.getMessage());
                    }
                });
            }else{
                mChatCallback.onErrorSentMessage("No hay conexión a Internet.");
            }
        }catch (Exception e){
            e.printStackTrace();
            mChatCallback.onErrorSentMessage(e.getMessage());
        }
    }

    public void messages(long idHolding){
        try {
            if (Connection.isConnected(mContext)){
                Call<RealmList<MessageResponse>> call = FbMtyApp.getFbMtyWebService().messages("bearer "+RealmManager.token(),idHolding);
                call.enqueue(new Callback<RealmList<MessageResponse>>() {
                    @Override
                    public void onResponse(Call<RealmList<MessageResponse>> call, Response<RealmList<MessageResponse>> response) {
                        if (response.code() == Statics.OK){
                            mChatCallback.onLoadMessages(response.body());
                        }else{
                            try {
                                mChatCallback.onErrrorMessages(response.errorBody().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<RealmList<MessageResponse>> call, Throwable t) {
                        t.printStackTrace();
                        mChatCallback.onErrrorMessages(t.getMessage());
                    }
                });
            }else{
                mChatCallback.onErrrorMessages("No hay conexión a Internet.");
            }
        }catch (Exception e){
            e.printStackTrace();
            mChatCallback.onErrrorMessages(e.getMessage());
        }
    }
}
