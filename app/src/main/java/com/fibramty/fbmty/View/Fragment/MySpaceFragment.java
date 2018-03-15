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
import com.fibramty.fbmty.View.Adapter.MySpaceAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.galaxyofandroid.awesometablayout.AwesomeTabBar;

/**
 * A simple {@link Fragment} subclass.
 */
public class MySpaceFragment extends Fragment {

    @BindView(R.id.tabBar)AwesomeTabBar tabBar;
    @BindView(R.id.pager)ViewPager pager;
    @BindView(R.id.nestedScrollView)NestedScrollView nestedScrollView;

    private Activity mActivity = getActivity();

    public MySpaceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        nestedScrollView.setFillViewport (true);
        pager.setAdapter(new MySpaceAdapter(getFragmentManager()));
        tabBar.setupWithViewPager(pager);
        pager.setCurrentItem(1);
        pager.setCurrentItem(0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_space, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

}
