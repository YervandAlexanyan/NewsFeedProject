package com.example.admin.newsfeedproject.FeedRecylerView;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.newsfeedproject.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class WeaterAdapter extends RecyclerView.Adapter<WeaterAdapter.Myweaterholder> {
    private List<WeaterData> weaterDataList;
    private Context context;

    public WeaterAdapter(List<WeaterData> weaterDataList, Context context) {
        this.weaterDataList = weaterDataList;
        this.context = context;
    }

    @Override
    public Myweaterholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.weater_day_item,parent,false);
        Myweaterholder myweaterholder=new Myweaterholder(view);

        return myweaterholder;
    }

    @Override
    public void onBindViewHolder(Myweaterholder holder, int position) {
           WeaterData weaterData=weaterDataList.get(position);
           holder.dayname.setText(weaterData.getDay());
           holder.daytemp.setText(weaterData.getTemp());
        Picasso.with(context).load(weaterData.getImage()).resize(28,28).into(holder.dayimage);
    }

    @Override
    public int getItemCount() {
        return weaterDataList.size();
    }

    class Myweaterholder extends RecyclerView.ViewHolder {
        private TextView dayname, daytemp;
        private ImageView dayimage;

        public Myweaterholder(View itemView) {
            super(itemView);
            dayname = (TextView) itemView.findViewById(R.id.weekday);
            daytemp = (TextView) itemView.findViewById(R.id.day_temp);
            dayimage = (ImageView) itemView.findViewById(R.id.dayimage);
        }
    }
}
