package com.fibramty.fbmty.View.Dialogs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.fibramty.fbmty.R;

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
        initView();
    }

    private void initView(){
        if (Statics.maintenance != null){
            mMaintenance = Statics.maintenance;
            txttitle.setText(mMaintenance.getTitle());
            txtfrequency.setText(mMaintenance.getFrequency());
            txtname.setText(mMaintenance.getProvider().getName());
            txtPhone.setText(mMaintenance.getProvider().getPhone());
            txtMobile.setText(mMaintenance.getProvider().getMobile());
            txtEmail.setText(mMaintenance.getProvider().getEmail());
            txtDescription.setText(mMaintenance.getDescription());
        }
    }
}
