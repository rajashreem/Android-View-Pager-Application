package com.example.android.viewpagerapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter{
    private String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        DayFragment dayFragment = new DayFragment();

        Bundle bundle = new Bundle();
        bundle.putString("day", days[position]);
        dayFragment.setArguments(bundle);

        return dayFragment;
    }

    @Override
    public int getCount() {
        return days.length;
    }
}
