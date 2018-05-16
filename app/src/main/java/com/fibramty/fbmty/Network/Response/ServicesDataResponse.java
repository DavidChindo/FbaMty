package com.fibramty.fbmty.Network.Response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 5/16/18.
 */

public class ServicesDataResponse {

    @SerializedName("Estatus")
    private int status;
    @SerializedName("FechaActualizacion")
    private String updateDate;
    @SerializedName("HoldingId")
    private long HoldingId;
    @SerializedName("Id")
    private long Id;
    @SerializedName("FechaSolicitud")
    private String requestDate;
    @SerializedName("NumCortesias")
    private int courtesiesNum;
    @SerializedName("ParkingHoldingId")
    private long ParkingHoldingId;
    @SerializedName("PrecioCortesia")
    private int courtesiesPrice;
    @SerializedName("PrecioTotalCortesia")
    private long courtesiesTotalPrice;
    @SerializedName("UserId")
    private String userId;
    @SerializedName("NumMantenimientos")
    private int maintenanceNum;
    @SerializedName("PrecioMantenimiento")
    private int maintenancePrice;
    @SerializedName("PrecioTotalMantenimiento")
    private long maintenanceTotalPrice;
    @SerializedName("TipoAccion")
    private int option;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public long getHoldingId() {
        return HoldingId;
    }

    public void setHoldingId(long holdingId) {
        HoldingId = holdingId;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public int getCourtesiesNum() {
        return courtesiesNum;
    }

    public void setCourtesiesNum(int courtesiesNum) {
        this.courtesiesNum = courtesiesNum;
    }

    public long getParkingHoldingId() {
        return ParkingHoldingId;
    }

    public void setParkingHoldingId(long parkingHoldingId) {
        ParkingHoldingId = parkingHoldingId;
    }

    public int getCourtesiesPrice() {
        return courtesiesPrice;
    }

    public void setCourtesiesPrice(int courtesiesPrice) {
        this.courtesiesPrice = courtesiesPrice;
    }

    public long getCourtesiesTotalPrice() {
        return courtesiesTotalPrice;
    }

    public void setCourtesiesTotalPrice(long courtesiesTotalPrice) {
        this.courtesiesTotalPrice = courtesiesTotalPrice;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getMaintenanceNum() {
        return maintenanceNum;
    }

    public void setMaintenanceNum(int maintenanceNum) {
        this.maintenanceNum = maintenanceNum;
    }

    public int getMaintenancePrice() {
        return maintenancePrice;
    }

    public void setMaintenancePrice(int maintenancePrice) {
        this.maintenancePrice = maintenancePrice;
    }

    public long getMaintenanceTotalPrice() {
        return maintenanceTotalPrice;
    }

    public void setMaintenanceTotalPrice(long maintenanceTotalPrice) {
        this.maintenanceTotalPrice = maintenanceTotalPrice;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
}

