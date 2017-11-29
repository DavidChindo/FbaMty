package com.fibramty.fbmty.Network.Request.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by david.barrera on 11/28/17.
 */

public class ActivityHolding {

    @SerializedName("Id")
    private long id;
    @SerializedName("dateStart")
    private String dateStart;
    @SerializedName("dateEnd")
    private String dateEnd;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;

    public ActivityHolding(long id, String dateStart, String dateEnd, String title, String description) {
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.title = title;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
