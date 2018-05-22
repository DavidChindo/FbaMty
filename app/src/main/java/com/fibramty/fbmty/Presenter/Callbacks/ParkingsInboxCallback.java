package com.fibramty.fbmty.Presenter.Callbacks;

import com.fibramty.fbmty.Network.Response.ServicesDataResponse;

import java.util.List;

/**
 * Created by david.barrera on 5/18/18.
 */

public interface ParkingsInboxCallback {

    void onLoadServicesData(List<ServicesDataResponse> servicesDataResponses);

    void onErrorServicesData(String msg);
}
