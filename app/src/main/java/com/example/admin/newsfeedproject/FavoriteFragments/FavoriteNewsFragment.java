package com.example.admin.newsfeedproject.FavoriteFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.newsfeedproject.FeedRecylerView.FeedAdapter;
import com.example.admin.newsfeedproject.R;


public class FavoriteNewsFragment extends Fragment{
    private RecyclerView recyclerView;
    private FeedAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.favorite_news_fragment,container,false);
        recyclerView=(RecyclerView)view.findViewById(R.id.favorite_news_recylerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        adapter=new FeedAdapter(setData(),getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }

}
