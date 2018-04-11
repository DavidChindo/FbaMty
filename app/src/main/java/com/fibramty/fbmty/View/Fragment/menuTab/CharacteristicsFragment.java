package com.fibramty.fbmty.View.Fragment.menuTab;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.Network.Request.Models.ActivityHolding;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Adapter.ActivityAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.RealmList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CharacteristicsFragment extends Fragment {

    @BindView(R.id.fr_characteristics_activities)ListView activitiesLv;
    @BindView(R.id.fr_characteristics_date)TextView dateTxt;
    @BindView(R.id.fr_characteristics_architect)TextView architectTxt;
    @BindView(R.id.fr_characteristics_floor)TextView floorTxt;
    @BindView(R.id.fr_characteristics_parking_box)TextView parkingBoxTxt;
    @BindView(R.id.fr_characteristics_name_admon)TextView nameAdmonTxt;
    @BindView(R.id.fr_characteristics_email_admon)TextView emailAdmonTxt;
    @BindView(R.id.fr_characteristics_phone_admon)TextView phoneAdmonTxt;

    public CharacteristicsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setFields();
        activitiesLv.setAdapter(new ActivityAdapter(getActivity(),R.layout.item_activity,getActivities()));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_characteristics, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    private RealmList<ActivityHolding> getActivities(){

        if (MainActivity.holdingResponse != null && (MainActivity.holdingResponse.getActivities() != null &&
                MainActivity.holdingResponse.getActivities().size() > 0)){
            return MainActivity.holdingResponse.getActivities();
        }else {
            RealmList<ActivityHolding> activityHoldings = new RealmList<ActivityHolding>();
            activityHoldings.add(new ActivityHolding(1, "02 Dic. 2018", "10 Dic. 2018", "", "Ampliación de jardines del ala oeste y" +
                    "remodelación de terraza, con cubierta deck", 1));
            activityHoldings.add(new ActivityHolding(2, "12 Dic. 2018", "20 Dic. 2018", "", "Remodelación del primer piso ", 1));
            activityHoldings.add(new ActivityHolding(3, "22 Dic. 2018", "22 Dic. 2018", "", "Revisión del sistema electrico", 1));
            return activityHoldings;
        }
    }

    private void setFields(){
        if (MainActivity.holdingResponse != null){
            dateTxt.setText(Validators.validateString(MainActivity.holdingResponse.getYearConstruction()));
            architectTxt.setText(Validators.validateString(MainActivity.holdingResponse.getArchitect()));
            floorTxt.setText(Validators.validateString(String.valueOf(MainActivity.holdingResponse.getOfficeQty())));
            parkingBoxTxt.setText(Validators.validateString(String.valueOf(MainActivity.holdingResponse.getParkingBoxes())));
            nameAdmonTxt.setText(Validators.validateString(MainActivity.holdingResponse.getAdministrator()));
            emailAdmonTxt.setText(Validators.validateString(MainActivity.holdingResponse.getAdmonEmail()));
            phoneAdmonTxt.setText(Validators.validateString(MainActivity.holdingResponse.getAdmonPhoneNumber()));
        }
    }
}
