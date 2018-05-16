package com.fibramty.fbmty.Presenter.Callbacks;

import com.fibramty.fbmty.Network.Request.Models.Maintenance;

import java.util.List;

/**
 * Created by david.barrera on 5/16/18.
 */

public interface MaintenanceCallback {

    void onLoadMaintenance(List<Maintenance> maintenances);

    void onErrorMaintenance(String msgError);
}
