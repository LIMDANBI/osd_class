package com.example.weatherforecast;

import android.app.Activity;
import android.content.Intent;
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

        final ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_expandable_list_item_1,
                data
        );

        listView.setAdapter(forecastAdapter);  // ListView의 아이템 하나가 클릭되는 것을 감지하는 Listener객체 설정

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String forecast = forecastAdapter.getItem(position);
                Toast.makeText(getActivity(), forecast, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("data", forecast);
                startActivity(intent);  // intent 객체에 기술된 activity 시작

            }
        });

        return view;
    }

}
