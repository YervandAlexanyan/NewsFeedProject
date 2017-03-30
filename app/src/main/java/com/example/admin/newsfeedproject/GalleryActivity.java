package com.example.admin.newsfeedproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;
import com.squareup.picasso.Picasso;

public class GalleryActivity extends SwipeBackActivity {
private ImageView imageView,favorite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        imageView=(ImageView)findViewById(R.id.image_item);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);
        Intent intent=getIntent();
        Picasso.with(getApplicationContext()).load(intent.getIntExtra("key",1)).fit().into(imageView);
        favorite=(ImageView)findViewById(R.id.gallery_favorite);
        favorite.setOnClickListener(new View.OnClickListener() {
            private boolean toogle=false;
            @Override
            public void onClick(View v) {
                if(toogle)
                {
                    favorite.setBackgroundResource(R.drawable.ic_favorite_border_black_24dp);
                    toogle=false;
                }else
                {
                    favorite.setBackgroundResource(R.drawable.favorite_two);
                    toogle=true;
                }

            }
        });
    }
}
