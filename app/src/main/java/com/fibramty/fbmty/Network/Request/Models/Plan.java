package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Plan {

    @SerializedName("Id")
    private long id;
    @SerializedName("url")
    private String url;
    @SerializedName("type")
    private String type;

    public Plan(long id, String url, String type) {
        this.id = id;
        this.url = url;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
