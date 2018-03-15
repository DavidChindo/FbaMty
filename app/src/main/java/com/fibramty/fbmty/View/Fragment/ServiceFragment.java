package com.fibramty.fbmty.View.Fragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MaintenanceActivity;
import com.fibramty.fbmty.View.Activity.PaymentsActivity;
import com.fibramty.fbmty.View.Activity.TicketActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class ServiceFragment extends Fragment {

    Activity mActivity;
    public ServiceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mActivity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_service, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.ln_cont_payments)
    void onOpenPaymentsClick(){
        startActivity(new Intent(mActivity,PaymentsActivity.class));
    }

    @OnClick(R.id.ln_cont_maintenance)
    void onOpenMaintenanceClick(){
        startActivity(new Intent(mActivity,MaintenanceActivity.class));
    }

    @OnClick(R.id.ln_cont_ticket)
    void onOpenTicket(){
        startActivity(new Intent(mActivity,TicketActivity.class));
    }
}
