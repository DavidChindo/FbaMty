package com.fibramty.fbmty.Network.Response;

import com.fibramty.fbmty.Network.Request.Models.Picture;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by david.barrera on 3/11/18.
 */

public class PicturesResponse extends RealmObject {

    @SerializedName("baseMediaPath")
    private RealmList<Picture> baseMediaPath;

    @SerializedName("busquedaImages")
    private RealmList<Picture> busquedaImages;

    @SerializedName("comercialImages")
    private RealmList<Picture> comercialImages;

    @SerializedName("detalleImages")
    private RealmList<Picture> detalleImages;

    @SerializedName("footerImages")
    private RealmList<Picture> footerImages;

    @SerializedName("videoImages")
    private RealmList<Picture> videoImages;

    @SerializedName("planosImages")
    private RealmList<Picture> planosImages;

    @SerializedName("zipOtros")
    private RealmList<Picture> zipOtros;

    public RealmList<Picture> getBaseMediaPath() {
        return baseMediaPath;
    }

    public void setBaseMediaPath(RealmList<Picture> baseMediaPath) {
        this.baseMediaPath = baseMediaPath;
    }

    public RealmList<Picture> getBusquedaImages() {
        return busquedaImages;
    }

    public void setBusquedaImages(RealmList<Picture> busquedaImages) {
        this.busquedaImages = busquedaImages;
    }

    public RealmList<Picture> getComercialImages() {
        return comercialImages;
    }

    public void setComercialImages(RealmList<Picture> comercialImages) {
        this.comercialImages = comercialImages;
    }

    public RealmList<Picture> getDetalleImages() {
        return detalleImages;
    }

    public void setDetalleImages(RealmList<Picture> detalleImages) {
        this.detalleImages = detalleImages;
    }

    public RealmList<Picture> getFooterImages() {
        return footerImages;
    }

    public void setFooterImages(RealmList<Picture> footerImages) {
        this.footerImages = footerImages;
    }

    public RealmList<Picture> getVideoImages() {
        return videoImages;
    }

    public void setVideoImages(RealmList<Picture> videoImages) {
        this.videoImages = videoImages;
    }

    public RealmList<Picture> getPlanosImages() {
        return planosImages;
    }

    public void setPlanosImages(RealmList<Picture> planosImages) {
        this.planosImages = planosImages;
    }

    public RealmList<Picture> getZipOtros() {
        return zipOtros;
    }

    public void setZipOtros(RealmList<Picture> zipOtros) {
        this.zipOtros = zipOtros;
    }
}
