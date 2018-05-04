package com.fibramty.fbmty.Network.Request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 5/2/18.
 */

public class ActionTicketRequest {

    @SerializedName("holdingId")
    private Long holdingId;
    @SerializedName("Id")
    private Long id;

    public ActionTicketRequest(Long holdingId, Long id) {
        this.holdingId = holdingId;
        this.id = id;
    }

    public Long getHoldingId() {
        return holdingId;
    }

    public void setHoldingId(Long holdingId) {
        this.holdingId = holdingId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
