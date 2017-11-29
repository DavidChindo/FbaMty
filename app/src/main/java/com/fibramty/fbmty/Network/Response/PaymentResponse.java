package com.fibramty.fbmty.Network.Response;

import com.fibramty.fbmty.Network.Request.Models.Payment;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by david.barrera on 11/29/17.
 */

public class PaymentResponse {

    @SerializedName("payments")
    private ArrayList<Payment> payments;

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }
}
