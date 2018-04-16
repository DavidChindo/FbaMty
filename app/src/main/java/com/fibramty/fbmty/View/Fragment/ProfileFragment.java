package com.fibramty.fbmty.View.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.asksira.dropdownview.DropDownView;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.Prefs;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Activity.SplashActivity;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;

/**
 * A simple {@link Fragment} subclass.
 */

public class ProfileFragment extends Fragment {


    @BindView(R.id.dropdownview)com.asksira.dropdownview.DropDownView holdings;
    @BindView(R.id.fr_profile_account)TextView accountTxt;
    Prefs prefs;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        prefs = Prefs.with(getActivity());
        initViews();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    private void initViews(){
        holdings.setDropDownListItem(MainActivity.holdingResponse.getHoldingsName());
        holdings.setSelectingPosition(prefs.getInt(Statics.SELECTED_POSITION));
        holdings.setOnSelectionListener(new DropDownView.OnSelectionListener() {
            @Override
            public void onItemSelected(DropDownView view, int position) {
                if (position >= 0){
                    prefs.putInt(Statics.SELECTED_POSITION,position);
                    MainActivity.holdingResponse = MainActivity.holdingResponses.get(position);
                    DesignUtils.successMessage(getActivity(),"Edificio",MainActivity.holdingResponse.getName());
                }
            }
        });
    }

}
