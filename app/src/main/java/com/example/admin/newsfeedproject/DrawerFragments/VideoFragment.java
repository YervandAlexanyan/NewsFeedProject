package com.example.admin.newsfeedproject.DrawerFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.admin.newsfeedproject.FeedRecylerView.VideoAdapter;
import com.example.admin.newsfeedproject.R;

import java.util.ArrayList;
import java.util.List;


public class VideoFragment extends Fragment {


    private RecyclerView recyclerView;
    private VideoAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.video_fragment, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.videorview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new VideoAdapter(setData(),getContext());
        recyclerView.setAdapter(adapter);


        return view;
    }

    private List<String> setData() {
        List<String> list = new ArrayList<>();
        list.add("JGwWNGJdvx8");
        list.add("6Mgqbai3fKo");
        list.add("i9AHJkHqkpw");
        list.add("papuvlVeZg8");
        list.add("KHHxrNSlfQ8");

        return list;
    }


}
