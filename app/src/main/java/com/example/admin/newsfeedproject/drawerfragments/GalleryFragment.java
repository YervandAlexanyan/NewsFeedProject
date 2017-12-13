package com.example.admin.newsfeedproject.drawerfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.admin.newsfeedproject.feedrecylerView.GalleryAdapter;
import com.example.admin.newsfeedproject.R;

import java.util.ArrayList;
import java.util.List;


public class GalleryFragment extends Fragment {
    private RecyclerView recyclerView;
    private GalleryAdapter adapter;
    private  SwipeRefreshLayout swipeRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gallery_fragment, container, false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout_gallery);
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
        recyclerView=(RecyclerView)view.findViewById(R.id.gallery_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        adapter=new GalleryAdapter(setData(),getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }

    private List<Integer> setData()
    {
        List<Integer> list=new ArrayList<>();
        list.add(R.drawable.photo1);
        list.add(R.drawable.photo2);
        list.add(R.drawable.photo3);
        list.add(R.drawable.photo4);
        list.add(R.drawable.photo5);;
        list.add(R.drawable.photo6);
        list.add(R.drawable.photo7);
        list.add(R.drawable.photo8);
        list.add(R.drawable.photo9);
        list.add(R.drawable.photo10);
        list.add(R.drawable.photo11);
        list.add(R.drawable.photo12);
        list.add(R.drawable.photo13);
        list.add(R.drawable.photo14);
        return list;
    }


}
