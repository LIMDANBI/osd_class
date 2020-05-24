package com.example.weatherforecast;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ForecastFragment extends Fragment {

    public ForecastFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_forecast, container, false);

        String[] data = {
                "Mon 5/25 - Sunny - 31/17",
                "Tue 5/26 - Foggy - 21/8",
                "Wed 5/27 - Cloudy - 22/17",
                "Thurs 5/28 - Rainy - 18/11",
                "Fri 5/29 - Foggy - 21/10",
                "Sat 5/30 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 5/31 - Sunny - 20/7"
        };

        ListView listView = (ListView) view.findViewById(R.id.list_item);

        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_expandable_list_item_1,
                data
        );

        listView.setAdapter(forecastAdapter);


        return view;
    }

}
