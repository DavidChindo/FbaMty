package com.fibramty.fbmty.Network.Response;

import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by david.barrera on 11/29/17.
 */

public class MaintenanceResponse {

    @SerializedName("maintenance")
    private ArrayList<Maintenance> maintenances;

    public ArrayList<Maintenance> getMaintenances() {
        return maintenances;
    }

    public void setMaintenances(ArrayList<Maintenance> maintenances) {
        this.maintenances = maintenances;
    }
}
