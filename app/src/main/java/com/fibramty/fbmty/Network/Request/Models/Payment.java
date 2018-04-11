package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class Payment {

    @SerializedName("documentNumber")
    private String documentNumber;
    @SerializedName("description")
    private String description;
    @SerializedName("amount")
    private String amount;
    @SerializedName("dateValidity")
    private String dateValidity;
    @SerializedName("dateAccounting")
    private String dateAccounting;
    @SerializedName("status")
    private String status;
    @SerializedName("name")
    private String name;

    public Payment(){}

    public Payment(String documentNumber, String description, String amount, String dateValidity, String dateAccounting, String status,String name) {
        this.documentNumber = documentNumber;
        this.description = description;
        this.amount = amount;
        this.dateValidity = dateValidity;
        this.dateAccounting = dateAccounting;
        this.status = status;
        this.name = name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDateValidity() {
        return dateValidity;
    }

    public void setDateValidity(String dateValidity) {
        this.dateValidity = dateValidity;
    }

    public String getDateAccounting() {
        return dateAccounting;
    }

    public void setDateAccounting(String dateAccounting) {
        this.dateAccounting = dateAccounting;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
