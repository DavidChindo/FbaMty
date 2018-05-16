package com.fibramty.fbmty.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.fibramty.fbmty.Network.Request.Models.Provider;
import com.fibramty.fbmty.Presenter.Callbacks.MaintenanceCallback;
import com.fibramty.fbmty.Presenter.MaintenancePresenter;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.MaintenanceAdapter;
import com.fibramty.fbmty.View.Dialogs.MaintenanceDialog;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class MaintenanceActivity extends AppCompatActivity implements MaintenanceCallback {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.act_maintenance_lv_services)ListView services;
    @BindView(R.id.shimmer_view_container)ShimmerFrameLayout shimmerFrameLayout;
    @BindView(R.id.no_maintenance)TextView txtMaintenance;

    MaintenancePresenter maintenancePresenter;
    List<Maintenance> mMaintenances;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);
        ButterKnife.bind(this);
        toolbar.setTitle("Mantenimiento");
        initViews();
    }

    private void initViews(){
        maintenancePresenter = new MaintenancePresenter(this,this);
        shimmerFrameLayout.startShimmerAnimation();
        maintenancePresenter.maintenances(MainActivity.holdingResponse.getId());
    }

    @OnItemClick(R.id.act_maintenance_lv_services)
    void onMaintenanceSelected(int position){
        Intent intent =  new Intent(this, MaintenanceDialog.class);
        intent.putExtra("maintenance",(new Gson()).toJson(mMaintenances.get(position)));
        startActivity(intent);
    }

    @Override
    public void onLoadMaintenance(List<Maintenance> maintenances) {

        if (maintenances != null && maintenances.size() > 0) {
            mMaintenances = maintenances;
            services.setAdapter(new MaintenanceAdapter(this, R.layout.item_maintenance, maintenances));
        }else {
            txtMaintenance.setVisibility(View.VISIBLE);
        }

        shimmerFrameLayout.stopShimmerAnimation();
        shimmerFrameLayout.setVisibility(View.GONE);
    }

    @Override
    public void onErrorMaintenance(String msgError) {
        DesignUtils.errorMessage(this,"Error",msgError);
        txtMaintenance.setVisibility(View.VISIBLE);
        shimmerFrameLayout.stopShimmerAnimation();
        shimmerFrameLayout.setVisibility(View.GONE);
    }
}
