package com.fibramty.fbmty.View.Fragment.menuTab;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.fibramty.fbmty.Network.Request.Models.ActivityHolding;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.ActivityAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CharacteristicsFragment extends Fragment {

    @BindView(R.id.fr_characteristics_activities)ListView activitiesLv;

    public CharacteristicsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        activitiesLv.setAdapter(new ActivityAdapter(getActivity(),R.layout.item_activity,getActivitiesDummy()));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_characteristics, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    private ArrayList<ActivityHolding> getActivitiesDummy(){
        ArrayList<ActivityHolding> activityHoldings = new ArrayList<ActivityHolding>();
        activityHoldings.add(new ActivityHolding(1,"02 Dic. 2018","10 Dic. 2018","","Ampliación de jardines del ala oeste y" +
                "remodelación de terraza, con cubierta deck",1));
        activityHoldings.add(new ActivityHolding(2,"12 Dic. 2018","20 Dic. 2018","","Remodelación del primer piso ",1));
        activityHoldings.add(new ActivityHolding(3,"22 Dic. 2018","22 Dic. 2018","","Revisión del sistema electrico",1));
        return activityHoldings;
    }
}
