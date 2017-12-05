package com.fibramty.fbmty.Network.Request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class MaintenanceTicketRequest {

    @SerializedName("idHolding")
    private long idHolding;

    public MaintenanceTicketRequest(long idHolding) {
        this.idHolding = idHolding;
    }

    public long getIdHolding() {
        return idHolding;
    }

    public void setIdHolding(long idHolding) {
        this.idHolding = idHolding;
    }
}
