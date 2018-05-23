package com.fibramty.fbmty.View.Fragment;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.fibramty.fbmty.Library.DesignUtils;
import com.fibramty.fbmty.Library.LogicUtils;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Activity.MaintenanceActivity;
import com.fibramty.fbmty.View.Activity.PaymentsActivity;
import com.fibramty.fbmty.View.Activity.TicketActivity;
import com.fibramty.fbmty.View.Activity.VideoActivity;
import com.fibramty.fbmty.View.Adapter.MenuAdapter;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;


public class ServiceFragment extends Fragment {

    Activity mActivity;
    @BindView(R.id.act_main_grid_menu)GridView menu;
    @BindView(R.id.fr_services_back)ImageView background;
    @BindView(R.id.fr_service_window)RelativeLayout mWindow;

    public ServiceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mActivity = getActivity();
        setBackground();
        menu.setAdapter(new MenuAdapter(mActivity,R.layout.item_grid_menu,getResources().obtainTypedArray(R.array.menu_img),
                getResources().getStringArray(R.array.menu_titles)));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_service, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnItemClick(R.id.act_main_grid_menu)
    void onOptionClick(int position){
        switch (position){
            case 0:
                startActivity(new Intent(mActivity,PaymentsActivity.class));
                break;
            case 1:

                if (MainActivity.holdingResponse.getUrlVideo() != null && !MainActivity.holdingResponse.getUrlVideo().isEmpty()) {
                    startActivity(new Intent(mActivity, VideoActivity.class));
                }else{
                    DesignUtils.errorMessage(mActivity,"Video","No existe video para este edificio");
                }

                break;
            case 2:
                startActivity(new Intent(mActivity,MaintenanceActivity.class));
                break;
            case 3:
                startActivity(new Intent(mActivity,TicketActivity.class));
                break;
        }
    }

    private void setBackground(){
        if (MainActivity.holdingResponse != null){
            Glide.with(this).load(LogicUtils.getUrlImage(mActivity,MainActivity.holdingResponse))
                    .listener(new RequestListener<String, GlideDrawable>() {
                        @Override
                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                            mWindow.setVisibility(View.VISIBLE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                            mWindow.setVisibility(View.GONE);
                            return false;
                        }
                    })
                    .error(R.drawable.img_menu_back)
                    .placeholder(R.drawable.img_menu_back)
                    .into(background);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        setBackground();
    }
}
