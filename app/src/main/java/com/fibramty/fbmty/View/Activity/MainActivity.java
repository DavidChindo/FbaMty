package com.fibramty.fbmty.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.fibramty.fbmty.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar.setTitle("Servicios");
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

    }
}
