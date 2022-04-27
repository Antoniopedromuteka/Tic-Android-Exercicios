package com.example.ex17;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.MediaController;
import android.widget.VideoView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

     /*   VideoView video = findViewById(R.id.videoView);

        Uri src = Uri.parse("https://www.youtube.com/watch?v=2O7AaV0Lc4c");

        video.setVideoURI(src);

        video.setMediaController(new MediaController(this));
    */
        CalendarView calendarView = findViewById(R.id.calendarView);


    }
}