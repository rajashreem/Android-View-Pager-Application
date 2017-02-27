package com.example.android.viewpagerapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter{

    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new DayFragment();
    }

    @Override
    public int getCount() {
        return 1;
    }
}
