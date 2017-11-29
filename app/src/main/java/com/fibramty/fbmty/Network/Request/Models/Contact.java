package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Contact {

    @SerializedName("Name")
    private String name;
    @SerializedName("phone")
    private ArrayList<Phone> phones;
    @SerializedName("email")
    private String email;

    public Contact(String name, ArrayList<Phone> phones, String email) {
        this.name = name;
        this.phones = phones;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<Phone> phones) {
        this.phones = phones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
