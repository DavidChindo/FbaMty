package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/29/17.
 */

public class Payment {

    @SerializedName("DOC_NO")
    private String documentNumber;
    @SerializedName("ITEM_TEXT")
    private String description;
    @SerializedName("AMT_DOCCUR")
    private String amount;
    @SerializedName("CURRENCY")
    private String currency;
    @SerializedName("POSTING_DATE")
    private String dateValidity;
    @SerializedName("CLR_DOC_NO")
    private String status;
    @SerializedName("DOC_TYPE")
    private String name;

    public Payment(){}

    public Payment(String documentNumber, String description, String amount, String dateValidity, String status,String name) {
        this.documentNumber = documentNumber;
        this.description = description;
        this.amount = amount;
        this.dateValidity = dateValidity;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
