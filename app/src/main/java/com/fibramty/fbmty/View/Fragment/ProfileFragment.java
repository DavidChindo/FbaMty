package com.fibramty.fbmty.View.Fragment;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.asksira.dropdownview.DropDownView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.fibramty.fbmty.Dal.RealmManager;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.LogicUtils;
import com.fibramty.fbmty.Library.Prefs;
import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.Presenter.Callbacks.ProfileCallback;
import com.fibramty.fbmty.Presenter.ProfilePresenter;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.LoginActivity;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Activity.SplashActivity;
import com.github.florent37.shapeofview.shapes.ArcView;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemSelected;

/**
 * A simple {@link Fragment} subclass.
 */

public class ProfileFragment extends Fragment implements ProfileCallback {


    @BindView(R.id.dropdownview)com.asksira.dropdownview.DropDownView holdings;
    @BindView(R.id.fr_profile_account)TextView accountTxt;
    @BindView(R.id.fr_profile_exit)ImageButton exitTxt;
    @BindView(R.id.fr_profile_img)ArcView arcView;
    Prefs prefs;
    ProgressDialog progressDialog;
    ProfilePresenter profilePresenter;

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
        profilePresenter = new ProfilePresenter(this,getActivity());
        accountTxt.setText(RealmManager.user());
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

    @OnClick(R.id.fr_profile_exit)
    void onExitClick(){
        progressDialog = ProgressDialog.show(getActivity(), null, "Cerrando Sesión...");
        progressDialog.setCancelable(false);
        profilePresenter.logOut();
    }


    @Override
    public void logoutSuccess(String msg) {
        progressDialog.dismiss();
        DesignUtils.showToast(getActivity(),msg);
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public void logoutError(String msg) {
        progressDialog.dismiss();
        DesignUtils.errorMessage(getActivity(),"Sesión",msg);
    }
}
