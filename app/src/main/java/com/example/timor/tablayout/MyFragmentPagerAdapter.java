package com.example.timor.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Timor on 2017/2/5.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;
    private String[] titles;


    public MyFragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> fragmentList, String[] titles) {
        super(fragmentManager);
        this.fragmentList = fragmentList;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
