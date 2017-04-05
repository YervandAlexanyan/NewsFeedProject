package com.example.admin.newsfeedproject.FeedRecylerView;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.admin.newsfeedproject.GalleryActivity;
import com.example.admin.newsfeedproject.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.Mygalleryholder> {

    private List<Integer> gallerydatalist;
    private Context context;

    public GalleryAdapter(List<Integer> gallerydatalist, Context context) {
        this.gallerydatalist = gallerydatalist;
        this.context = context;
    }

    @Override
    public Mygalleryholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_view_item,parent,false);
        Mygalleryholder mygalleryholder=new Mygalleryholder(view);
        return mygalleryholder;
    }

    @Override
    public void onBindViewHolder(Mygalleryholder holder, final int position) {

        Picasso.with(context).load(gallerydatalist.get(position)).fit().into(holder.galleryitem);
        holder.galleryitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, GalleryActivity.class);
                intent.putExtra("key",gallerydatalist.get(position));
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return gallerydatalist.size();
    }

    class Mygalleryholder extends RecyclerView.ViewHolder
    {      private ImageView galleryitem;

        public ImageView getGalleryitem() {
            return galleryitem;
        }

        public Mygalleryholder(View itemView) {
            super(itemView);
            galleryitem=(ImageView)itemView.findViewById(R.id.gallery_item);
        }
    }
}
