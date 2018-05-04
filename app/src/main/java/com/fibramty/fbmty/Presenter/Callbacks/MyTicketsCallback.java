package com.fibramty.fbmty.Presenter.Callbacks;

import com.fibramty.fbmty.Network.Response.MyTicketResponse;

import java.util.List;

/**
 * Created by david.barrera on 4/21/18.
 */

public interface MyTicketsCallback {

     void onSuccessMyTickets(List<MyTicketResponse> ticketResponses);

     void onErrorMyTickets(String msg);

     void onSuccessCancel(String msg);

     void onErrorCancel(String msg);

     void onSuccessDelete(String msg);

     void onErrorDelete(String msg);
}
