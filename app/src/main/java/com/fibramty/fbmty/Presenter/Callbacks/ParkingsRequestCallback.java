package com.fibramty.fbmty.Presenter.Callbacks;

import com.fibramty.fbmty.Network.Response.ServicesDescResponse;

import java.util.List;

/**
 * Created by david.barrera on 5/17/18.
 */

public interface ParkingsRequestCallback {

    void onLoadServicesParkings(List<ServicesDescResponse> servicesDescResponses);

    void onErrorServicesParkings(String msgError);

    void onSuccessSubmitTicketService(String msg);

    void onErrorSubmitTicketService(String msg);

    void onReloadServicesList();
}
