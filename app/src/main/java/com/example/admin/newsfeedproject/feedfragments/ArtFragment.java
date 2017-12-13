package com.example.admin.newsfeedproject.feedfragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.newsfeedproject.feedrecylerView.FeedAdapter;
import com.example.admin.newsfeedproject.feedrecylerView.News;
import com.example.admin.newsfeedproject.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArtFragment extends Fragment {
    private RecyclerView recyclerView;
    private FeedAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.art_fragment, container, false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout_art);
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
        recyclerView = (RecyclerView) view.findViewById(R.id.art_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new FeedAdapter(setData(), getContext());
        recyclerView.setAdapter(adapter);
        return view;

    }

    private List<News> setData() {
        List<News> newsList = new ArrayList<>();
        String[] urls = getResources().getStringArray(R.array.arturls);
        String[] names = getResources().getStringArray(R.array.artnames);
        String[] sources = getResources().getStringArray(R.array.artsources);
        String[] titles = getResources().getStringArray(R.array.arttitles);


        newsList.add(new News(urls[0], R.drawable.artnews1, names[0], sources[0], titles[0]));
        newsList.add(new News(urls[1], R.drawable.artnews2, names[1], sources[1], titles[1]));
        newsList.add(new News(urls[2], R.drawable.artnews3, names[2], sources[2], titles[2]));
        newsList.add(new News(urls[3], R.drawable.artnews4, names[3], sources[3], titles[3]));
        newsList.add(new News(urls[4], R.drawable.artnews5, names[4], sources[4], titles[4]));
        newsList.add(new News(urls[5], R.drawable.artnews6, names[5], sources[5], titles[5]));
        newsList.add(new News(urls[6], R.drawable.artnews7, names[6], sources[6], titles[6]));
        newsList.add(new News(urls[7], R.drawable.artnews8, names[7], sources[7], titles[7]));
        long seed = System.nanoTime();
        Collections.shuffle(newsList, new Random(seed));
        return newsList;
    }
}
