package com.fibramty.fbmty.Network.Response;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by david.barrera on 11/29/17.
 */

public class LoginResponse extends RealmObject {

    @SerializedName("access_token")
    private String token;

    @SerializedName("token_type")
    private String tokenType;

    @SerializedName("userName")
    @PrimaryKey
    private String userName;

    @SerializedName("RFC")
    private String rfc;

    @SerializedName("Roles")
    private String roles;

    @SerializedName(".expires")
    private String expireDate;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    
}
