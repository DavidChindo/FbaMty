package com.fibramty.fbmty.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import com.fibramty.fbmty.Network.Response.HoldingResponse;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.MenuAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.act_main_grid_menu)GridView menu;
    public static HoldingResponse holdingResponse;
    public static List<HoldingResponse> holdingResponses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        menu.setAdapter(new MenuAdapter(this,R.layout.item_grid_menu,getResources().obtainTypedArray(R.array.menu_img),
                getResources().getStringArray(R.array.menu_titles)));
    }

    @OnClick(R.id.ln_cont_payments)
    void onOpenPaymentsClick(){
        startActivity(new Intent(this,PaymentsActivity.class));
    }

    @OnClick(R.id.ln_cont_maintenance)
    void onOpenMaintenanceClick(){
        startActivity(new Intent(this,MaintenanceActivity.class));
    }

    @OnClick(R.id.ln_cont_ticket)
    void onOpenTicket(){
        startActivity(new Intent(this,TicketActivity.class));
    }
}
