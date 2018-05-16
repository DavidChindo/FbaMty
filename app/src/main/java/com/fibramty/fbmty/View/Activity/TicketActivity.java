package com.fibramty.fbmty.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Network.Request.Models.Service;
import com.fibramty.fbmty.Network.Request.Models.Ticket;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.ServicesAdapter;
import com.fibramty.fbmty.View.Adapter.TicketAdapter;
import com.fibramty.fbmty.View.Dialogs.TicketDialog;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;
import io.realm.RealmList;

public class TicketActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.fr_tickets_listview)ListView ticketslv;
    @BindView(R.id.no_tickets)TextView noTickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        ButterKnife.bind(this);
        toolbar.setTitle("Tickets");
        initViews();
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    private void initViews(){
        if (getServicesDummy() != null) {
            ticketslv.setAdapter(new ServicesAdapter(this, R.layout.item_activity, getServicesDummy()));
            ticketslv.setVisibility(View.VISIBLE);
            noTickets.setVisibility(View.GONE);
        }else{
            ticketslv.setVisibility(View.GONE);
            noTickets.setVisibility(View.VISIBLE);
        }
    }

    private RealmList<Service> getServicesDummy(){
            return MainActivity.holdingResponse != null &&
                    (MainActivity.holdingResponse.getServices() != null && MainActivity.holdingResponse.getServices().size() > 0)
                    ?  MainActivity.holdingResponse.getServices() : null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ticket_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.act_ticket_myticket:
                startActivity(new Intent(TicketActivity.this,MyTicketsActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @OnItemClick(R.id.fr_tickets_listview)
    void onTicketSelected(int position){
        Intent intent = new Intent(this, TicketDialog.class);
        intent.putExtra("ticket",((Service)ticketslv.getItemAtPosition(position)).getTitle());
        intent.putExtra("serviceId",((Service)ticketslv.getItemAtPosition(position)).getId());
        intent.putExtra("holdingId",MainActivity.holdingResponse.getId());
        startActivity(intent);
    }
}
