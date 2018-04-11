package com.fibramty.fbmty.View.Fragment.menuTab;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.fibramty.fbmty.Network.Request.Models.ActivityHolding;
import com.fibramty.fbmty.Network.Request.Models.Service;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Adapter.ActivityAdapter;
import com.fibramty.fbmty.View.Adapter.ServicesAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ServicesFragment extends Fragment {

    @BindView(R.id.fr_services_listview)ListView serviceslv;

    public ServicesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        serviceslv.setAdapter(new ServicesAdapter(getActivity(),R.layout.item_activity,getServicesDummy()));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_services, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    private ArrayList<Service> getServicesDummy(){
            ArrayList<Service> services = new ArrayList<Service>();
            services.add(new Service(1, "Registro de visitas", "Varios", "", "0", ""));
            services.add(new Service(2, "Cajones de estacionamiento", "Varios", "", "0", ""));
            services.add(new Service(3, "Tags de estacionamiento", "Varios", "", "0", ""));
            services.add(new Service(4, "Check-In automatico", "Varios", "", "0", ""));
            return services;
    }
}
