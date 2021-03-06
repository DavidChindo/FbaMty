package com.fibramty.fbmty.View.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.fibramty.fbmty.Library.Statics;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Fragment.MySpaceFragment;
import com.fibramty.fbmty.View.Fragment.ProfileFragment;
import com.fibramty.fbmty.View.Fragment.ServiceFragment;
import com.fibramty.fbmty.View.Fragment.SettingsFragment;
import com.fibramty.fbmty.View.Fragment.menuTab.CharacteristicsFragment;
import com.fibramty.fbmty.View.Fragment.menuTab.ServicesFragment;
import com.google.android.gms.common.GoogleApiAvailability;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.navigation)BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        setTitle();
        setSupportActionBar(toolbar);
        onChangeTabListener();
    }

    private void onChangeTabListener(){
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                getSupportActionBar().show();
                                selectedFragment = new ServiceFragment();
                                break;
                            case R.id.action_item2:
                                getSupportActionBar().hide();
                                selectedFragment = new MySpaceFragment();
                                onNewIntent(getIntent());
                                break;
                            case R.id.action_item3:
                                getSupportActionBar().hide();
                                selectedFragment = new ProfileFragment();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, new ServiceFragment());
        transaction.addToBackStack(null);
        transaction.commit();

    }

    private void setTitle(){
        if (MainActivity.holdingResponse != null){
            toolbar.setTitle(MainActivity.holdingResponse.getName());
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
