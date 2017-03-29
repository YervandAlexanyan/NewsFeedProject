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

public class ArtFragment  extends Fragment{
    private RecyclerView recyclerView;
    private FeedAdapter adapter;
    private SwipeRefreshLayout swipeRefreshLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.art_fragment,container,false);
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
        return  view;

    }
    private List<News> setData() {
        List<News> newsList = new ArrayList<>();
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        newsList.add(new News(R.drawable.art_pic,"The new Styles Presentaion","TheGuardian","In 1662 the French noblewoman Madame de La Fayette, published anonymously what is thought to be France’s first modern novel, La Princesse de Montpensier. Drawing on her knowledge of history and experience of Louis XIV’s court, de La Fayette penned a short, complicated tale of love, adultery, jealousy and betrayal "));
        return newsList;
    }
}
