package com.example.marketfp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        // Initialize the VideoView and set the video path
        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.adv;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        // Set up MediaController for video playback controls
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        // Start the video playback
        videoView.start();

        // Set up Google button click listener
        Button btnGoogle = findViewById(R.id.btnGoogle);
        btnGoogle.setOnClickListener(v -> openGoogle());

        // Set up back button click listener
        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(v -> finish());
    }

    private void openGoogle() {
        String googleUrl = "https://www.google.com";
        Uri uri = Uri.parse(googleUrl);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
