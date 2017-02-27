package com.example.android.viewpagerapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter{

    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        DayFragment dayFragment = new DayFragment();

        Bundle bundle = new Bundle();
        bundle.putString("day", "I don't know which day it is today");
        dayFragment.setArguments(bundle);

        return dayFragment;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
