package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Coordinate extends RealmObject {

    @SerializedName("IdHolding")
    private long idHolding;
    /*@SerializedName("Holding")
    private Object holding;*/
    @SerializedName("Latitude")
    private double latitude;
    @SerializedName("Longitude")
    private double longitude;

    public Coordinate(){}

    public long getIdHolding() {
        return idHolding;
    }

    public void setIdHolding(long idHolding) {
        this.idHolding = idHolding;
    }

   /* public Object getHolding() {
        return holding;
    }

    public void setHolding(Object holding) {
        this.holding = holding;
    }*/

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
