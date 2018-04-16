package com.fibramty.fbmty.View.Fragment.menuTab;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.fibramty.fbmty.Network.Request.Models.ActivityHolding;
import com.fibramty.fbmty.Network.Request.Models.Service;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Adapter.ActivityAdapter;
import com.fibramty.fbmty.View.Adapter.ServicesAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.RealmList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ServicesFragment extends Fragment {

    @BindView(R.id.fr_services_listview)ListView serviceslv;
    @BindView(R.id.no_services)TextView noData;

    public ServicesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getServicesDummy() != null) {
            serviceslv.setAdapter(new ServicesAdapter(getActivity(), R.layout.item_activity, getServicesDummy()));
            serviceslv.setVisibility(View.VISIBLE);
            noData.setVisibility(View.GONE);
        }else{
            serviceslv.setVisibility(View.GONE);
            noData.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_services, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    private RealmList<Service> getServicesDummy(){
    return MainActivity.holdingResponse.getServicesAdmin() != null && MainActivity.holdingResponse.getServicesAdmin().size() > 0
        ? MainActivity.holdingResponse.getServicesAdmin() : null;
    }
}
