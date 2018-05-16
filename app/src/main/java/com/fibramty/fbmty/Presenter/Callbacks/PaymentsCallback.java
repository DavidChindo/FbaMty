package com.fibramty.fbmty.Presenter.Callbacks;

import com.fibramty.fbmty.Network.Request.Models.Payment;

import java.util.List;

/**
 * Created by david.barrera on 4/16/18.
 */

public interface PaymentsCallback {

    void onPaymentsSuccess(List<Payment> payments, boolean isFilter);

    void onPaymentsError(String msg);
}
