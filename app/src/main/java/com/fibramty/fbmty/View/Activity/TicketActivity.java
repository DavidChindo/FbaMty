package com.fibramty.fbmty.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;
import android.widget.ListView;

import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Network.Request.Models.Service;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        ButterKnife.bind(this);
        toolbar.setTitle("Ticket");
        initViews();
    }

    private void initViews(){
        ticketslv.setAdapter(new ServicesAdapter(this,R.layout.item_activity,getServicesDummy()));
    }

    private RealmList<Service> getServicesDummy(){
            return MainActivity.holdingResponse != null && (MainActivity.holdingResponse.getServices() != null && MainActivity.holdingResponse.getServices().size() > 0)
                    ?  MainActivity.holdingResponse.getServices() : null;
    }

    @OnItemClick(R.id.fr_tickets_listview)
    void onTicketSelected(int position){
        Intent intent = new Intent(this, TicketDialog.class);
        intent.putExtra("ticket",((Service)ticketslv.getItemAtPosition(position)).getTitle());
        startActivity(intent);
        //DesignUtils.snackMessage(this,"Ticket seleccionado " + mTitles[position]);

    }
}
