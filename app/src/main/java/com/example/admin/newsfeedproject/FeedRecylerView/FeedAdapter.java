package com.example.admin.newsfeedproject.FeedRecylerView;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.newsfeedproject.MainActivity;
import com.example.admin.newsfeedproject.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.NewsViewHolder> {
    private List<News> newsList;
    private Context context;

    public FeedAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
        NewsViewHolder newsViewHolder = new NewsViewHolder(view);
        return newsViewHolder;
    }

    @Override
    public void onBindViewHolder(final NewsViewHolder holder, int position) {
        final News news = newsList.get(position);
        Picasso.with(context).load(news.getImage()).resize(130, 130).into(holder.photo);
        holder.name.setText(news.getName());
        holder.title.setText(news.getTitle());
        holder.source.setText(news.getSource());
        holder.name.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(news.getUrl()));
                context.startActivity(intent);
            }
        });
        holder.favorite.setOnClickListener(new View.OnClickListener() {
            private boolean toggle=false;
            @Override
            public void onClick(View v) {
                if(toggle)
                {
                    holder.favorite.setBackgroundResource(R.drawable.ic_favorite_border_black_24dp);
                    toggle=false;
                }else
                {
                    holder.favorite.setBackgroundResource(R.drawable.favorite_two);
                    toggle=true;
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {

        private ImageView photo;
        private TextView name, title,source;
        private ImageView favorite;


        public NewsViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.name);
            title = (TextView) itemView.findViewById(R.id.title);
            source=(TextView)itemView.findViewById(R.id.source);
            favorite=(ImageView)itemView.findViewById(R.id.favortie);
        }
    }
}
