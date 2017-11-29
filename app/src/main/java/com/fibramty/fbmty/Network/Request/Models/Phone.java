package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Phone {

    @SerializedName("number")
    private String number;
    @SerializedName("ext")
    private String ext;

    public Phone(String number, String ext) {
        this.number = number;
        this.ext = ext;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
}
