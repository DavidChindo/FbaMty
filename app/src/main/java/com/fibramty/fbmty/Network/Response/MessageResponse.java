package com.fibramty.fbmty.Network.Response;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by david.barrera on 5/22/18.
 */

public class MessageResponse extends RealmObject {

    @SerializedName("Id")
    @PrimaryKey
    private long id;

    @SerializedName("HoldingId")
    private long holdingId;

    @SerializedName("UserId")
    private String userId;

    @SerializedName("isResponse")
    private boolean isResponse;

    @SerializedName("FechaEnviado")
    private String sentDate;

    @SerializedName("Visto")
    private boolean viewed;

    @SerializedName("Message")
    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHoldingId() {
        return holdingId;
    }

    public void setHoldingId(long holdingId) {
        this.holdingId = holdingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isResponse() {
        return isResponse;
    }

    public void setResponse(boolean response) {
        isResponse = response;
    }

    public String getSentDate() {
        return sentDate;
    }

    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

