package com.fibramty.fbmty.Network.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class LoginResponse {

    @SerializedName("tokenAccess")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
