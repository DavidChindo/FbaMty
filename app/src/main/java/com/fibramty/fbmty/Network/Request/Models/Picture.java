package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/28/17.
 */

public class Picture {

    @SerializedName("Id")
    private long id;
    @SerializedName("size")
    private int size;
    @SerializedName("url")
    private String url;
    @SerializedName("order")
    private int order;
    @SerializedName("description")
    private String description;

    public Picture(long id, int size, String url, int order, String description) {
        this.id = id;
        this.size = size;
        this.url = url;
        this.order = order;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

