package com.fibramty.fbmty.Network.Request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class ChatRequest {

    @SerializedName("name")
    private String name;
    @SerializedName("title")
    private String title;
    @SerializedName("message")
    private String message;
    @SerializedName("reason")
    private String reason;
    @SerializedName("idHolding")
    private long idHolding;

    public ChatRequest(String name, String title, String message, String reason, long idHolding) {
        this.name = name;
        this.title = title;
        this.message = message;
        this.reason = reason;
        this.idHolding = idHolding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public long getIdHolding() {
        return idHolding;
    }

    public void setIdHolding(long idHolding) {
        this.idHolding = idHolding;
    }
}
