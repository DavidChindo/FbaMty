package com.fibramty.fbmty.View.Activity;

import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.fibramty.fbmty.Network.Request.Models.Maintenance;
import com.fibramty.fbmty.Network.Response.ServicesDescResponse;
import com.fibramty.fbmty.Presenter.Callbacks.ParkingsInboxCallback;
import com.fibramty.fbmty.Presenter.Callbacks.ParkingsRequestCallback;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.ParkingsAdapter;
import com.fibramty.fbmty.View.Fragment.ParkingsInbox;
import com.fibramty.fbmty.View.Fragment.ParkingsRequest;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ParkingsActivity extends AppCompatActivity implements ParkingsRequestCallback{

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.viewpager)ViewPager  viewPager;
    @BindView(R.id.tabs)TabLayout tabLayout;

    public static ViewPager mViewPager;

    int idService = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parkings);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            idService = bundle.getInt("idService");
        }

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        mViewPager = viewPager;
    }

    private void setupViewPager(ViewPager viewPager) {
        ParkingsAdapter adapter = new ParkingsAdapter(getSupportFragmentManager());
        Bundle bundle = new Bundle();
        bundle.putInt("idService",idService);
        ParkingsRequest parkingsRequest = new ParkingsRequest();
        ParkingsInbox parkingsInbox = new ParkingsInbox();
        parkingsRequest.setArguments(bundle);
        parkingsInbox.setArguments(bundle);
        adapter.addFragment(parkingsRequest, "SOLICITUD");
        adapter.addFragment(parkingsInbox, "BANDEJA");
        viewPager.setAdapter(adapter);
    }

    public void setTitle(@StringRes int titleId){
        getSupportActionBar().setTitle(getString(titleId));
    }

    @Override
    public void onLoadServicesParkings(List<ServicesDescResponse> servicesDescResponses) {

    }

    @Override
    public void onErrorServicesParkings(String msgError) {

    }

    @Override
    public void onSuccessSubmitTicketService(String msg) {

    }

    @Override
    public void onErrorSubmitTicketService(String msg) {

    }

    @Override
    public void onReloadServicesList() {
        viewPager.setCurrentItem(1);
    }
}
