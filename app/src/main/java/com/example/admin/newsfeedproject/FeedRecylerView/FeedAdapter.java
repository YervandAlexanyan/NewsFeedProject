package com.example.admin.newsfeedproject.FeedRecylerView;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.admin.newsfeedproject.R;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.NewsViewHolder> {
    private List<News> newsList;
    private Context context;
    private List<News> favoriteList;


    public FeedAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
        this.favoriteList=new ArrayList<>();
    }


    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
        NewsViewHolder newsViewHolder = new NewsViewHolder(view);

        return newsViewHolder;
    }


    @Override
    public void onBindViewHolder(final NewsViewHolder holder, final int position) {
        final News news = newsList.get(position);

        Picasso.with(context).load(news.getImage()).fit().into(holder.photo);
        holder.name.setText(news.getName());
        holder.title.setText(news.getTitle());
        holder.source.setText(news.getSource());


        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(news.getUrl()));
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView photo;
        private TextView name, title, source;
        private ImageView favorite;
        private RelativeLayout relativeLayout;
        private boolean toggle = false;

        public NewsViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.name);
            title = (TextView) itemView.findViewById(R.id.title);
            source = (TextView) itemView.findViewById(R.id.source);
            favorite = (ImageView) itemView.findViewById(R.id.favortie);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relative_layout);
            favorite.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

            if (toggle) {
                favorite.setBackgroundResource(R.drawable.ic_favorite_border_black_24dp);

                toggle = false;


            } else {
                favorite.setBackgroundResource(R.drawable.favorite_two);

                toggle = true;


            }
        }
    }


}
