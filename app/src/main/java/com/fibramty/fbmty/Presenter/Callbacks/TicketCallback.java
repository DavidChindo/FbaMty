package com.fibramty.fbmty.Presenter.Callbacks;

/**
 * Created by david.barrera on 5/2/18.
 */

public interface TicketCallback {

     void onSentTicketSuccess(String msg);

     void onSentTicketError(String msg);
}
