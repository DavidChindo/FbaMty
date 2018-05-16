package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class Maintenance {

    @SerializedName("Id")
    private long id;
    @SerializedName("HoldingId")
    private long HoldingId;
    @SerializedName("Title")
    private String title;
    @SerializedName("Description")
    private String description;
    @SerializedName("Schedule")
    private String schedule;
    @SerializedName("frequency")
    private String frequency;
    @SerializedName("Cost")
    private String cost;
    @SerializedName("ProviderName")
    private String providerName;
    @SerializedName("ProviderPhone")
    private String ProviderPhone;
    @SerializedName("ProviderCellPhone")
    private String ProviderCellPhone;
    @SerializedName("ProviderEmail")
    private String ProviderEmail;

    public Maintenance(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHoldingId() {
        return HoldingId;
    }

    public void setHoldingId(long holdingId) {
        HoldingId = holdingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderPhone() {
        return ProviderPhone;
    }

    public void setProviderPhone(String providerPhone) {
        ProviderPhone = providerPhone;
    }

    public String getProviderCellPhone() {
        return ProviderCellPhone;
    }

    public void setProviderCellPhone(String providerCellPhone) {
        ProviderCellPhone = providerCellPhone;
    }

    public String getProviderEmail() {
        return ProviderEmail;
    }

    public void setProviderEmail(String providerEmail) {
        ProviderEmail = providerEmail;
    }
}
