package com.fibramty.fbmty.Presenter.Callbacks;

import com.fibramty.fbmty.Network.Response.MessageResponse;

import io.realm.RealmList;

/**
 * Created by david.barrera on 4/11/18.
 */

public interface ChatCallback {

    void onLoadMessages(RealmList<MessageResponse> messages);

    void onErrrorMessages(String msg);

    void onSuccessSentMessage(boolean isSent);

    void onErrorSentMessage(String msg);

    void onValid(boolean isValid,String msg);

}
