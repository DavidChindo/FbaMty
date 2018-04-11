package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Office extends RealmObject {

    @SerializedName("Id")
    private long id;
    @SerializedName("totalArea")
    private String totalArea;
    @SerializedName("priceSquareMeter")
    private String priceSquareMeter;
    @SerializedName("priceOffice")
    private String priceOffice;
    @SerializedName("type")
    private String type;

    public Office(){}

    public Office(long id, String totalArea, String priceSquareMeter, String priceOffice, String type) {
        this.id = id;
        this.totalArea = totalArea;
        this.priceSquareMeter = priceSquareMeter;
        this.priceOffice = priceOffice;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea;
    }

    public String getPriceSquareMeter() {
        return priceSquareMeter;
    }

    public void setPriceSquareMeter(String priceSquareMeter) {
        this.priceSquareMeter = priceSquareMeter;
    }

    public String getPriceOffice() {
        return priceOffice;
    }

    public void setPriceOffice(String priceOffice) {
        this.priceOffice = priceOffice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}