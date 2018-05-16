package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.fibramty.fbmty.Network.Response.MyTicketResponse;
import com.fibramty.fbmty.R;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MaintenanceDialog extends Activity {

    @BindView(R.id.dialog_maintenance_txt_title)TextView txttitle;
    @BindView(R.id.dialog_maintenance_txt_frequency)TextView txtfrequency;
    @BindView(R.id.dialog_maintenance_txt_name)TextView txtname;
    @BindView(R.id.dialog_maintenance_txt_phone)TextView txtPhone;
    @BindView(R.id.dialog_maintenance_txt_mobile)TextView txtMobile;
    @BindView(R.id.dialog_maintenance_txt_email)TextView txtEmail;
    @BindView(R.id.dialog_maintenance_description)TextView txtDescription;

    private Maintenance mMaintenance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance_dialog);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String maintenanceString = bundle.getString("maintenance");
            mMaintenance = (new Gson()).fromJson(maintenanceString,Maintenance.class);
        }
        initView();
    }

    private void initView(){
        if (mMaintenance != null){
            txttitle.setText(Validators.validateString(mMaintenance.getTitle()));
            txtfrequency.setText(Validators.validateString(mMaintenance.getSchedule()));
            txtname.setText(Validators.validateString(mMaintenance.getProviderName()));
            txtPhone.setText(Validators.validateString(mMaintenance.getProviderPhone()));
            txtMobile.setText(Validators.validateString(mMaintenance.getProviderCellPhone()));
            txtEmail.setText(Validators.validateString(mMaintenance.getProviderEmail()));
            txtDescription.setText(Validators.validateString(mMaintenance.getDescription()));
        }
    }
}
