package com.fibramty.fbmty.View.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Fragment.menuTab.CharacteristicsFragment;
import com.fibramty.fbmty.View.Fragment.menuTab.DownloadsFragment;
import com.fibramty.fbmty.View.Fragment.menuTab.LocationFragment;
import com.fibramty.fbmty.View.Fragment.menuTab.ServicesFragment;

import java.util.ArrayList;

import in.galaxyofandroid.awesometablayout.AwesomeTabBarAdapter;

/**
 * Created by david.barrera on 1/21/18.
 */

public class MySpaceAdapter extends AwesomeTabBarAdapter {
    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> titles = new ArrayList<>();
    int[] colors = {R.color.colorWhite, R.color.colorWhite, R.color.colorWhite, R.color.colorWhite};
    int[] textColors = {R.color.colorAccent, R.color.colorAccent, R.color.colorAccent, R.color.colorAccent};

    public MySpaceAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        fragments.add(new CharacteristicsFragment());
        fragments.add(new ServicesFragment());
        fragments.add(new DownloadsFragment());
        fragments.add(new LocationFragment());

        titles.add("CARACTERÍSTICAS");
        titles.add("SERVICIOS");
        titles.add("DESCARGAS");
        titles.add("UBICACIÓN");
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getColorResource(int position) {
        return colors[position];
    }

    @Override
    public int getTextColorResource(int position) {
        return textColors[position];
    }

    @Override
    public int getIconResource(int i) {
        return 0;
    }

}
