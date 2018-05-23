package com.fibramty.fbmty.View.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Fragment.menuTab.CharacteristicsFragment;
import com.fibramty.fbmty.View.Fragment.menuTab.DownloadsFragment;
import com.fibramty.fbmty.View.Fragment.menuTab.LocationFragment;
import com.fibramty.fbmty.View.Fragment.menuTab.ServicesFragment;

import java.util.ArrayList;
import java.util.List;

import in.galaxyofandroid.awesometablayout.AwesomeTabBarAdapter;

/**
 * Created by david.barrera on 1/21/18.
 */

public class MySpaceAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public MySpaceAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

}
