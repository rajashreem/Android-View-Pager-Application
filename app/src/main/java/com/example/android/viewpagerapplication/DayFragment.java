package com.example.android.viewpagerapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DayFragment extends Fragment {
    public DayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_day, container, false);

        TextView day = (TextView) rootView.findViewById(R.id.day);
        day.setText(getArguments().getString("day"));

        return rootView;
    }

}
