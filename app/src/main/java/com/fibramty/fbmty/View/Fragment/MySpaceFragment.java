package com.fibramty.fbmty.View.Fragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.fibramty.fbmty.View.Adapter.MySpaceAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.galaxyofandroid.awesometablayout.AwesomeTabBar;
import ir.apend.slider.model.Slide;
import ir.apend.slider.ui.Slider;

/**
 * A simple {@link Fragment} subclass.
 */
public class MySpaceFragment extends Fragment {

    @BindView(R.id.tabBar)AwesomeTabBar tabBar;
    @BindView(R.id.pager)ViewPager pager;
    @BindView(R.id.nestedScrollView)NestedScrollView nestedScrollView;
    @BindView(R.id.slider)Slider slider;
    List<Slide> slides;
    private Activity mActivity = getActivity();

    public MySpaceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        slides = new ArrayList<>();
        setSlides();
        nestedScrollView.setFillViewport (true);
        pager.setAdapter(new MySpaceAdapter(getFragmentManager()));
        tabBar.setupWithViewPager(pager);
        pager.setCurrentItem(1);
        pager.setCurrentItem(0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_space, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    private void setSlides(){
        if (MainActivity.holdingResponse != null && MainActivity.holdingResponse.getPictures() != null
                && (MainActivity.holdingResponse.getPictures().getDetalleImages() != null && MainActivity.holdingResponse.getPictures().getDetalleImages().size() > 0)){
            for (int i = 0; i < MainActivity.holdingResponse.getPictures().getDetalleImages().size(); i++){
                 slides.add(new Slide(i,getResources().getString(R.string.url_prod)+MainActivity.holdingResponse.getPictures().getDetalleImages().get(i).getPath(),getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));
            }
        }
        slider.addSlides(slides);
    }
}
