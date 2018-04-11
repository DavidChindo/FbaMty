package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Phone extends RealmObject {

    @SerializedName("number")
    private String number;
    @SerializedName("ext")
    private String ext;

    public Phone(){}

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
