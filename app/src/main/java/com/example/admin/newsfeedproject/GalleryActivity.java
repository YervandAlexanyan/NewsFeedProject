package com.example.admin.newsfeedproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class GalleryActivity extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        imageView=(ImageView)findViewById(R.id.image_item);

        Intent intent=getIntent();
        Picasso.with(getApplicationContext()).load(intent.getIntExtra("key",1)).fit().into(imageView);

    }
}
