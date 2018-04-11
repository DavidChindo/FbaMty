package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class Provider {

    @SerializedName("Name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("mobile")
    private String mobile;
    @SerializedName("email")
    private String email;

    public Provider(){}

    public Provider(String name, String phone, String mobile, String email) {
        this.name = name;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
