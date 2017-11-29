package com.fibramty.fbmty.Network.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class ChatResponse {

    @SerializedName("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
