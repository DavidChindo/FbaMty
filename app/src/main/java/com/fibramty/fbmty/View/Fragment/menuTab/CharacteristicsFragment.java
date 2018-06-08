package com.fibramty.fbmty.View.Fragment.menuTab;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class CharacteristicsFragment extends Fragment {

    @BindView(R.id.fr_characteristics_date)TextView dateTxt;
    @BindView(R.id.fr_characteristics_architect)TextView architectTxt;
    @BindView(R.id.fr_characteristics_floor)TextView areaTotalTxt;
    @BindView(R.id.fr_characteristics_parking_box)TextView parkingBoxTxt;
    @BindView(R.id.fr_characteristics_name_admon)TextView nameAdmonTxt;
    @BindView(R.id.fr_characteristics_email_admon)TextView emailAdmonTxt;
    @BindView(R.id.fr_characteristics_phone_admon)TextView phoneAdmonTxt;

    public CharacteristicsFragment() {
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("a","onViee");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_characteristics, container, false);
        ButterKnife.bind(this,view);

        return view;
    }

    private void setFields(){
        if (MainActivity.holdingResponse != null){
            dateTxt.setText(Validators.validateString(MainActivity.holdingResponse.getYearConstruction()));
            architectTxt.setText(Validators.validateString(MainActivity.holdingResponse.getArchitect()));
            areaTotalTxt.setText(Validators.validateString(String.valueOf(MainActivity.holdingResponse.getAreaTotal())));
            parkingBoxTxt.setText(Validators.validateString(String.valueOf(MainActivity.holdingResponse.getParkingBoxes())));
            nameAdmonTxt.setText(Validators.validateString(MainActivity.holdingResponse.getAdministrator()));
            emailAdmonTxt.setText(Validators.validateString(MainActivity.holdingResponse.getAdmonEmail()));
            phoneAdmonTxt.setText(Validators.validateString(MainActivity.holdingResponse.getAdmonPhoneNumber()));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        setFields();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setFields();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
