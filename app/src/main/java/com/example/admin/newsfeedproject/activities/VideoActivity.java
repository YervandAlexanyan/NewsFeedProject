package com.example.admin.newsfeedproject.activities;

import android.content.Intent;

import android.os.Bundle;

import android.widget.Toast;

import com.example.admin.newsfeedproject.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;




public class VideoActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{




    private YouTubePlayerView youTubeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

           youTubeView=(YouTubePlayerView)findViewById(R.id.youtube_view);
          youTubeView.initialize(String.valueOf(R.string.key),this);


    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        Intent intent=getIntent();
        youTubePlayer.loadVideo(intent.getStringExtra("key"));
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Error" + youTubeInitializationResult.toString(), Toast.LENGTH_LONG)
                .show();
    }
}
