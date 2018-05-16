package com.fibramty.fbmty.View.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Adapter.ParkingsAdapter;
import com.fibramty.fbmty.View.Fragment.ParkingsInbox;
import com.fibramty.fbmty.View.Fragment.ParkingsRequest;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ParkingsActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.viewpager)ViewPager  viewPager;
    @BindView(R.id.tabs)TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parkings);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ParkingsAdapter adapter = new ParkingsAdapter(getSupportFragmentManager());
        adapter.addFragment(new ParkingsRequest(), "ONE");
        adapter.addFragment(new ParkingsInbox(), "TWO");
        viewPager.setAdapter(adapter);
    }
}
