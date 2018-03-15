package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Address {

    @SerializedName("IdHolding")
    private long idHolding;
    @SerializedName("Street")
    private String street;
    @SerializedName("NumberInt")
    private String numberInt;
    @SerializedName("NumberExt")
    private String numberExt;
    @SerializedName("Suburb")
    private String suburb;
    @SerializedName("Town")
    private String town;
    @SerializedName("State")
    private String state;
    @SerializedName("ZIP")
    private String zip;
    @SerializedName("IdState")
    private long idState;
    @SerializedName("Holding")
    private Object holding;


    public Address(long idHolding, String street, String numberInt, String numberExt, String suburb, String town, String state, String zip, long idState, Object holding) {
        this.idHolding = idHolding;
        this.street = street;
        this.numberInt = numberInt;
        this.numberExt = numberExt;
        this.suburb = suburb;
        this.town = town;
        this.state = state;
        this.zip = zip;
        this.idState = idState;
        this.holding = holding;
    }

    public long getIdHolding() {
        return idHolding;
    }

    public void setIdHolding(long idHolding) {
        this.idHolding = idHolding;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumberInt() {
        return numberInt;
    }

    public void setNumberInt(String numberInt) {
        this.numberInt = numberInt;
    }

    public String getNumberExt() {
        return numberExt;
    }

    public void setNumberExt(String numberExt) {
        this.numberExt = numberExt;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public long getIdState() {
        return idState;
    }

    public void setIdState(long idState) {
        this.idState = idState;
    }

    public Object getHolding() {
        return holding;
    }

    public void setHolding(Object holding) {
        this.holding = holding;
    }
}
