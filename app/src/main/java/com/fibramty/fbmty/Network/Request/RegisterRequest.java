package com.fibramty.fbmty.Network.Request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 4/10/18.
 */

public class RegisterRequest {

    @SerializedName("Email")
    private String email;

    @SerializedName("Password")
    private String password;

    @SerializedName("ConfirmPassword")
    private String confirmPassword;

    @SerializedName("RFC")
    private String rfc;

    @SerializedName("NoCliente")
    private String noClient;

    public RegisterRequest(String email, String password, String confirmPassword, String rfc, String noClient) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.rfc = rfc;
        this.noClient = noClient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNoClient() {
        return noClient;
    }

    public void setNoClient(String noClient) {
        this.noClient = noClient;
    }
}
