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


public class SportFragment extends Fragment {
    private RecyclerView recyclerView;
    private FeedAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.sport_fragment,container,false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout_sport);
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
        recyclerView = (RecyclerView) view.findViewById(R.id.sport_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new FeedAdapter(setData(), getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }

    private List<News> setData() {
        List<News> newsList = new ArrayList<>();
        newsList.add(new News(R.drawable.sport_photo,"The Best Sportsmen","SkyeSports","Confirmation that Jones has suffered a broken toe would be a major blow for United, who face nine games in April, starting with West Brom at Old Trafford on Saturday."));
        newsList.add(new News(R.drawable.sport_photo,"The Best Sportsmen","SkyeSports","Confirmation that Jones has suffered a broken toe would be a major blow for United, who face nine games in April, starting with West Brom at Old Trafford on Saturday."));
        newsList.add(new News(R.drawable.sport_photo,"The Best Sportsmen","SkyeSports","Confirmation that Jones has suffered a broken toe would be a major blow for United, who face nine games in April, starting with West Brom at Old Trafford on Saturday."));
        newsList.add(new News(R.drawable.sport_photo,"The Best Sportsmen","SkyeSports","Confirmation that Jones has suffered a broken toe would be a major blow for United, who face nine games in April, starting with West Brom at Old Trafford on Saturday."));
        newsList.add(new News(R.drawable.sport_photo,"The Best Sportsmen","SkyeSports","Confirmation that Jones has suffered a broken toe would be a major blow for United, who face nine games in April, starting with West Brom at Old Trafford on Saturday."));
        newsList.add(new News(R.drawable.sport_photo,"The Best Sportsmen","SkyeSports","Confirmation that Jones has suffered a broken toe would be a major blow for United, who face nine games in April, starting with West Brom at Old Trafford on Saturday."));
        newsList.add(new News(R.drawable.sport_photo,"The Best Sportsmen","SkyeSports","Confirmation that Jones has suffered a broken toe would be a major blow for United, who face nine games in April, starting with West Brom at Old Trafford on Saturday."));
        newsList.add(new News(R.drawable.sport_photo,"The Best Sportsmen","SkyeSports","Confirmation that Jones has suffered a broken toe would be a major blow for United, who face nine games in April, starting with West Brom at Old Trafford on Saturday."));
        return newsList;
    }
}
