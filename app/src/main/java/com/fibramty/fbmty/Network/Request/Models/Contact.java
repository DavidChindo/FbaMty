package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Contact extends RealmObject {

    @SerializedName("Name")
    private String name;
    @SerializedName("phone")
    private RealmList<Phone> phones;
    @SerializedName("email")
    private String email;

    public Contact(){}

    public Contact(String name, RealmList<Phone> phones, String email) {
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

    public RealmList<Phone> getPhones() {
        return phones;
    }

    public void setPhones(RealmList<Phone> phones) {
        this.phones = phones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
