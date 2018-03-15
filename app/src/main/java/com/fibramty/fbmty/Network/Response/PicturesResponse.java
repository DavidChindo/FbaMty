package com.fibramty.fbmty.Network.Response;

import com.fibramty.fbmty.Network.Request.Models.Picture;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by david.barrera on 3/11/18.
 */

public class PicturesResponse {

    @SerializedName("baseMediaPath")
    private List<Picture> baseMediaPath;

    @SerializedName("busquedaImages")
    private List<Picture> busquedaImages;

    @SerializedName("comercialImages")
    private List<Picture> comercialImages;

    @SerializedName("detalleImages")
    private List<Picture> detalleImages;

    @SerializedName("footerImages")
    private List<Picture> footerImages;

    @SerializedName("videoImages")
    private List<Picture> videoImages;

    @SerializedName("planosImages")
    private List<Picture> planosImages;

    public List<Picture> getBaseMediaPath() {
        return baseMediaPath;
    }

    public void setBaseMediaPath(List<Picture> baseMediaPath) {
        this.baseMediaPath = baseMediaPath;
    }

    public List<Picture> getBusquedaImages() {
        return busquedaImages;
    }

    public void setBusquedaImages(List<Picture> busquedaImages) {
        this.busquedaImages = busquedaImages;
    }

    public List<Picture> getComercialImages() {
        return comercialImages;
    }

    public void setComercialImages(List<Picture> comercialImages) {
        this.comercialImages = comercialImages;
    }

    public List<Picture> getDetalleImages() {
        return detalleImages;
    }

    public void setDetalleImages(List<Picture> detalleImages) {
        this.detalleImages = detalleImages;
    }

    public List<Picture> getFooterImages() {
        return footerImages;
    }

    public void setFooterImages(List<Picture> footerImages) {
        this.footerImages = footerImages;
    }

    public List<Picture> getVideoImages() {
        return videoImages;
    }

    public void setVideoImages(List<Picture> videoImages) {
        this.videoImages = videoImages;
    }

    public List<Picture> getPlanosImages() {
        return planosImages;
    }

    public void setPlanosImages(List<Picture> planosImages) {
        this.planosImages = planosImages;
    }
}
