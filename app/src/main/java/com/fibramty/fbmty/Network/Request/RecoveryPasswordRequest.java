package com.fibramty.fbmty.Network.Request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class RecoveryPasswordRequest {

    @SerializedName("email")
    private String email;

    public RecoveryPasswordRequest(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
