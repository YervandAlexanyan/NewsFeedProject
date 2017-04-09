package com.example.admin.newsfeedproject.FeedFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;

import com.example.admin.newsfeedproject.FeedRecylerView.FeedAdapter;
import com.example.admin.newsfeedproject.FeedRecylerView.News;
import com.example.admin.newsfeedproject.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class PoliticalFragment extends Fragment {
    private RecyclerView recyclerView;
    private FeedAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.political_fragment, container, false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
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

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new FeedAdapter(setData(), getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }


    private List<News> setData() {
        List<News> newsList = new ArrayList<>();
        String[] urls = getResources().getStringArray(R.array.politicalurls);
        String[] names = getResources().getStringArray(R.array.politicalnames);
        String[] sources = getResources().getStringArray(R.array.politacalsources);
        String[] titles = getResources().getStringArray(R.array.politicaltitles);


        newsList.add(new News(urls[0], R.drawable.news1, names[0], sources[0], titles[0],false));
        newsList.add(new News(urls[1], R.drawable.news2, names[1], sources[1], titles[1],false));
        newsList.add(new News(urls[2], R.drawable.news3, names[2], sources[2], titles[2],false));
        newsList.add(new News(urls[3], R.drawable.news4, names[3], sources[3], titles[3],false));
        newsList.add(new News(urls[4], R.drawable.news5, names[4], sources[4], titles[4],false));
        newsList.add(new News(urls[5], R.drawable.news6, names[5], sources[5], titles[5],false));
        newsList.add(new News(urls[6], R.drawable.news7, names[6], sources[6], titles[6],false));
        newsList.add(new News(urls[7], R.drawable.news8, names[7], sources[7], titles[7],false));


        long seed = System.nanoTime();
        Collections.shuffle(newsList, new Random(seed));
        return newsList;
    }


}
