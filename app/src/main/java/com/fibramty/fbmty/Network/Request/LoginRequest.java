package com.fibramty.fbmty.Network.Request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/28/17.
 */

public class LoginRequest {

    @SerializedName("usuario")
    private String username;
    @SerializedName("contrasena")
    private String password;
    @SerializedName("pushId")
    private String pushId;

    public LoginRequest(String username, String password, String pushId) {
        this.username = username;
        this.password = password;
        this.pushId = pushId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }
}
