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

import com.example.admin.newsfeedproject.FeedRecylerView.FeedAdapter;
import com.example.admin.newsfeedproject.FeedRecylerView.News;
import com.example.admin.newsfeedproject.R;

import java.util.ArrayList;
import java.util.List;


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
        newsList.add(new News(R.drawable.feedgalleryhead, "News for all humans", "BBC NEWS","News for all humans, BBC NEWS,The executive order also cuts the Environmental Protection Agency's budget. Regulations on oil, gas and coal production are to be reviewed"));
        newsList.add(new News(R.drawable.feedgalleryhead, "News for all humans", "BBC NEWS","News for all humans, BBC NEWS,The executive order also cuts the Environmental Protection Agency's budget. Regulations on oil, gas and coal production are to be reviewed"));
        newsList.add(new News(R.drawable.feedgalleryhead, "News for all humans", "BBC NEWS","News for all humans, BBC NEWS,The executive order also cuts the Environmental Protection Agency's budget. Regulations on oil, gas and coal production are to be reviewed"));
        newsList.add(new News(R.drawable.feedgalleryhead, "News for all humans", "BBC NEWS","News for all humans, BBC NEWS,The executive order also cuts the Environmental Protection Agency's budget. Regulations on oil, gas and coal production are to be reviewed"));
        newsList.add(new News(R.drawable.feedgalleryhead, "News for all humans", "BBC NEWS","News for all humans, BBC NEWS,The executive order also cuts the Environmental Protection Agency's budget. Regulations on oil, gas and coal production are to be reviewed"));
        newsList.add(new News(R.drawable.feedgalleryhead, "News for all humans", "BBC NEWS","News for all humans, BBC NEWS,The executive order also cuts the Environmental Protection Agency's budget. Regulations on oil, gas and coal production are to be reviewed"));
        newsList.add(new News(R.drawable.feedgalleryhead, "News for all humans", "BBC NEWS","News for all humans, BBC NEWS,The executive order also cuts the Environmental Protection Agency's budget. Regulations on oil, gas and coal production are to be reviewed"));
        newsList.add(new News(R.drawable.feedgalleryhead, "News for all humans", "BBC NEWS","News for all humans, BBC NEWS,The executive order also cuts the Environmental Protection Agency's budget. Regulations on oil, gas and coal production are to be reviewed"));
        newsList.add(new News(R.drawable.feedgalleryhead, "News for all humans", "BBC NEWS","News for all humans, BBC NEWS,The executive order also cuts the Environmental Protection Agency's budget. Regulations on oil, gas and coal production are to be reviewed"));


        return newsList;
    }
}
