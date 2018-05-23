package com.fibramty.fbmty.Dal.Objects;

import android.app.usage.StorageStats;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david.barrera on 5/18/18.
 */

public class StatusParkings {

    private String title;
    private int value;

    public StatusParkings(){}

    public StatusParkings(String title, int value) {
        this.title = title;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.title;
    }

    public static List<StatusParkings> statusParkings(){
        List<StatusParkings> statusParkings = new ArrayList<StatusParkings>();
        statusParkings.add(new StatusParkings("Todos",-1));
        statusParkings.add(new StatusParkings("Pendiente",0));
        statusParkings.add(new StatusParkings("En Atención",1));
        statusParkings.add(new StatusParkings("Autorizado",2));
        statusParkings.add(new StatusParkings("Cancelado",3));
        return statusParkings;
    }
}
