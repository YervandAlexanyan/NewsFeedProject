package com.example.admin.newsfeedproject.FeedRecylerView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.newsfeedproject.R;

import java.util.ArrayList;
import java.util.List;


public class DaysFragment extends Fragment {
    private RecyclerView recyclerView;
    private WeaterAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.days_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.daysrw);
        adapter = new WeaterAdapter(setData(), getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    private List<WeaterData> setData() {
        String[] days = getResources().getStringArray(R.array.days);
        String[] gradus = getResources().getStringArray(R.array.gradus);


        List<WeaterData> dataList = new ArrayList<>();

        dataList.add(new WeaterData(days[0], R.drawable.summer_48, gradus[0]));
        dataList.add(new WeaterData(days[1], R.drawable.chance_of_storm_48, gradus[1]));
        dataList.add(new WeaterData(days[2], R.drawable.fog_day_48, gradus[2]));
        dataList.add(new WeaterData(days[3], R.drawable.snow, gradus[3]));
        dataList.add(new WeaterData(days[4], R.drawable.fog_night_48, gradus[4]));
        dataList.add(new WeaterData(days[5], R.drawable.partly_cloudy_day_48, gradus[5]));
        dataList.add(new WeaterData(days[6], R.drawable.summer_48, gradus[6]));


        return dataList;
    }


}
