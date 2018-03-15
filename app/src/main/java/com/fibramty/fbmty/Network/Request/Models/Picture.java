package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Picture {


    @SerializedName("MediaId")
    private long mediaId;
    @SerializedName("HoldingId")
    private long holdingId;
    @SerializedName("Nombre")
    private String name;
    @SerializedName("Extension")
    private String extension;
    @SerializedName("TipoMedio")
    private String tipoMedio;
    @SerializedName("Holding")
    private Object holding;
    @SerializedName("Path")
    private String path;
    @SerializedName("MediaAparicion")
    private int medioAparicion;

    public Picture(long mediaId, long holdingId, String name, String extension, String tipoMedio, Object holding, String path, int medioAparicion) {
        this.mediaId = mediaId;
        this.holdingId = holdingId;
        this.name = name;
        this.extension = extension;
        this.tipoMedio = tipoMedio;
        this.holding = holding;
        this.path = path;
        this.medioAparicion = medioAparicion;
    }

    public long getMediaId() {
        return mediaId;
    }

    public void setMediaId(long mediaId) {
        this.mediaId = mediaId;
    }

    public long getHoldingId() {
        return holdingId;
    }

    public void setHoldingId(long holdingId) {
        this.holdingId = holdingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTipoMedio() {
        return tipoMedio;
    }

    public void setTipoMedio(String tipoMedio) {
        this.tipoMedio = tipoMedio;
    }

    public Object getHolding() {
        return holding;
    }

    public void setHolding(Object holding) {
        this.holding = holding;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getMedioAparicion() {
        return medioAparicion;
    }

    public void setMedioAparicion(int medioAparicion) {
        this.medioAparicion = medioAparicion;
    }
}

