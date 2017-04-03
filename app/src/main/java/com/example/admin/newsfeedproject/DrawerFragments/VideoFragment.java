package com.example.admin.newsfeedproject.DrawerFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v4.widget.SwipeRefreshLayout;
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
    private SwipeRefreshLayout swipeRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.video_fragment, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.videorview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new VideoAdapter(setData(),getContext());
        recyclerView.setAdapter(adapter);
        swipeRefreshLayout=(SwipeRefreshLayout)view.findViewById(R.id.video_swipe_refreshlayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                }, 2000);
            }
        });


        return view;
    }

    private List<String> setData() {
        String[] videourls=getResources().getStringArray(R.array.videourls);
        List<String> list = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            list.add(videourls[i]);
        }


        return list;
    }


}
