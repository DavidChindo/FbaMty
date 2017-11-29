package com.fibramty.fbmty.Network.Response;

import com.fibramty.fbmty.Network.Request.Models.Ticket;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by david.barrera on 11/29/17.
 */

public class TicketsResponse {

    @SerializedName("tickets")
    private ArrayList<Ticket> tickets;

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
}
