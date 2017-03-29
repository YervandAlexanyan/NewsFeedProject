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
        View view=inflater.inflate(R.layout.days_fragment,container,false);
        recyclerView=(RecyclerView)view.findViewById(R.id.daysrw);
        adapter=new WeaterAdapter(setData(),getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    private List<WeaterData> setData()
    {   List<WeaterData> dataList=new ArrayList<>();
        dataList.add(new WeaterData("Երկուշաբթի",R.drawable.summer_48,"+10"));
        dataList.add(new WeaterData("Երեքշաբթի",R.drawable.chance_of_storm_48,"+5"));
        dataList.add(new WeaterData("Չորեքշաբթի",R.drawable.fog_day_48,"-3"));
        dataList.add(new WeaterData("Հինգշաբթի",R.drawable.snow,"-12"));
        dataList.add(new WeaterData("Ուրբաթ",R.drawable.fog_night_48,"-9"));
        dataList.add(new WeaterData("Շաբաթ",R.drawable.partly_cloudy_day_48,"1"));
        dataList.add(new WeaterData("Կիրակի",R.drawable.summer_48,"+7"));
        return dataList;
    }

}
