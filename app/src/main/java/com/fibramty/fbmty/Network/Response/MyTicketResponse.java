package com.fibramty.fbmty.Network.Response;


import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 4/21/18.
 */

public class MyTicketResponse {

    @SerializedName("Estatus")
    private int status;
    @SerializedName("FechaActualizacion")
    private String updateDate;
    @SerializedName("FechaSolicitud")
    private String requestDate;
    @SerializedName("FilePath")
    private String filePath;
    @SerializedName("HoldingId")
    private long holdingId;
    @SerializedName("Id")
    private long id;
    @SerializedName("ObservacionesAdmin")
    private String observationsAdmin;
    @SerializedName("ObservacionesUsuario")
    private String observationsUser;
    @SerializedName("ServiceId")
    private long ticket;
    @SerializedName("UserId")
    private String userId;
    @SerializedName("ServiceDesc")
    private String description;


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

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public long getHoldingId() {
        return holdingId;
    }

    public void setHoldingId(long holdingId) {
        this.holdingId = holdingId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getObservationsAdmin() {
        return observationsAdmin;
    }

    public void setObservationsAdmin(String observationsAdmin) {
        this.observationsAdmin = observationsAdmin;
    }

    public String getObservationsUser() {
        return observationsUser;
    }

    public void setObservationsUser(String observationsUser) {
        this.observationsUser = observationsUser;
    }

    public long getTicket() {
        return ticket;
    }

    public void setTicket(long ticket) {
        this.ticket = ticket;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
