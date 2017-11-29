package com.fibramty.fbmty.Network.Request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class PaymentRequest {

    @SerializedName("month")
    private String month;
    @SerializedName("year")
    private String year;
    @SerializedName("idHolding")
    private long idHolding;

    public PaymentRequest(String month, String year, long idHolding) {
        this.month = month;
        this.year = year;
        this.idHolding = idHolding;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public long getIdHolding() {
        return idHolding;
    }

    public void setIdHolding(long idHolding) {
        this.idHolding = idHolding;
    }
}
