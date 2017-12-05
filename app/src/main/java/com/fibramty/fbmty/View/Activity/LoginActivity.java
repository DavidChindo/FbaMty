package com.fibramty.fbmty.View.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fibramty.fbmty.R;
import com.lespinside.simplepanorama.view.SphericalView;
import com.panoramagl.utils.PLUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.spherical_view)SphericalView sphericalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        sphericalView.setPanorama(PLUtils.getBitmap(this, R.drawable.img1), false);
        sphericalView.setAccelerometerEnabled(true);
        sphericalView.setInertiaEnabled(true);
        sphericalView.setDefaultRotationSensibility(100);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sphericalView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sphericalView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sphericalView.onDestroy();
    }

}

