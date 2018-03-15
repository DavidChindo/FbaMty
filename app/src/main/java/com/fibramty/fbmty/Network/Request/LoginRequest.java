package com.fibramty.fbmty.Network.Request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/28/17.
 */

public class LoginRequest {

    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("pushId")
    private String pushId;
    @SerializedName("grant_type")
    private String grantType;

    public LoginRequest(String username, String password, String pushId, String grantType) {
        this.username = username;
        this.password = password;
        this.pushId = pushId;
        this.grantType = grantType;
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

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
}
