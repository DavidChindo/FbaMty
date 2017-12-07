package com.fibramty.fbmty.View.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.fibramty.fbmty.Network.Request.Models.Provider;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.MaintenanceAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class MaintenanceActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.act_maintenance_lv_services)ListView services;

    private ArrayList<Maintenance> maintenances;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);
        ButterKnife.bind(this);
        toolbar.setTitle("Mantenimiento");
        initViews();
    }

    private void initViews(){
        maintenances = new ArrayList<Maintenance>();
        for (int i = 0; i < 4; i++){
            Provider provider = new Provider("UMA Solutions. S.A de C.V.","(55)22-02-24-22","55-42-24-22-20","contacto@umasolutions.com.mx");
            Maintenance maintenance = new Maintenance("Manejadoras (UMA)", "El mantenimiento de estos equipos, se debe realizar de manera mensual, sin excepción. Esto debido a que su tiempo de operación son de alrededor de 11 hrs diarias. \n" +
                    "Se recomienda tener el cuarto de máquinas despejado de todo aquello que no tenga con el equipo (archiveros, cajas, basura, etc).\n" +
                    "Se debe de detallar el mantenimiento que se le realiza al equipo, incluyendo lecturas y temperaturas.", "","Mensual", provider,"$22,000.00");
            maintenances.add(maintenance);
        }

        services.setAdapter(new MaintenanceAdapter(this,R.layout.item_maintenance,maintenances));
    }

    @OnItemClick(R.id.act_maintenance_lv_services)
    void onMaintenanceSelected(int position){
        DesignUtils.snackMessage(this,"open service "+position +" title "+maintenances.get(position).getTitle());
    }
}
