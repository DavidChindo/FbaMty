package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Address {

    @SerializedName("street")
    private String street;
    @SerializedName("NumberInt")
    private String numberInt;
    @SerializedName("NumberExt")
    private String numberExt;
    @SerializedName("Suburb")
    private String suburb;
    @SerializedName("town")
    private String town;
    @SerializedName("state")
    private String state;
    @SerializedName("zip")
    private String zip;

    public Address(String street, String numberInt, String numberExt, String suburb, String town, String state, String zip) {
        this.street = street;
        this.numberInt = numberInt;
        this.numberExt = numberExt;
        this.suburb = suburb;
        this.town = town;
        this.state = state;
        this.zip = zip;
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
}
