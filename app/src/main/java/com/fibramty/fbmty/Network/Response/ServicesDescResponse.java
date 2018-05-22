package com.fibramty.fbmty.Network.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 5/16/18.
 */

public class ServicesDescResponse {

    @SerializedName("Descripcion")
    private String description;
    @SerializedName("Disponibles")
    private int availables;
    @SerializedName("HoldingId")
    private long HoldingId;
    @SerializedName("Id")
    private long id;
    @SerializedName("PrecionMnto")
    private int amountPrice;
    @SerializedName("PrecioRenta")
    private int rentPrice;
    @SerializedName("TipoCajon")
    private int boxType;
    @SerializedName("TipoLugar")
    private int placeType;
    @SerializedName("TipoServicioEst")
    private int serviceEstType;
    @SerializedName("TipoTarjeta")
    private int cardType;
    @SerializedName("Total")
    private int total;
    @SerializedName("CortesiasPorUsuario")
    private int userXcourtesies;
    @SerializedName("MntosPorUsuario")
    private int userXAmounts;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailables() {
        return availables;
    }

    public void setAvailables(int availables) {
        this.availables = availables;
    }

    public long getHoldingId() {
        return HoldingId;
    }

    public void setHoldingId(long holdingId) {
        HoldingId = holdingId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAmountPrice() {
        return amountPrice;
    }

    public void setAmountPrice(int amountPrice) {
        this.amountPrice = amountPrice;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getBoxType() {
        return boxType;
    }

    public void setBoxType(int boxType) {
        this.boxType = boxType;
    }

    public int getPlaceType() {
        return placeType;
    }

    public void setPlaceType(int placeType) {
        this.placeType = placeType;
    }

    public int getServiceEstType() {
        return serviceEstType;
    }

    public void setServiceEstType(int serviceEstType) {
        this.serviceEstType = serviceEstType;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUserXcourtesies() {
        return userXcourtesies;
    }

    public void setUserXcourtesies(int userXcourtesies) {
        this.userXcourtesies = userXcourtesies;
    }

    public int getUserXAmounts() {
        return userXAmounts;
    }

    public void setUserXAmounts(int userXAmounts) {
        this.userXAmounts = userXAmounts;
    }
}
