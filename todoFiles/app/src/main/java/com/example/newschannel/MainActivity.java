package com.example.newschannel;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final TextView hashtag = findViewById(R.id.hashtagTextView);
        final ImageView airplane = findViewById(R.id.airplane);
        final ImageView logo = findViewById(R.id.logo);
        final ImageView dolphin = findViewById(R.id.dolphin);

        final TextView newsTextView = findViewById(R.id.newsTextView);

        Animation airplaneAnimation = AnimationUtils.loadAnimation(this, R.anim.plane);
        Animation logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo);
        Animation dolphinAnimation = AnimationUtils.loadAnimation(this, R.anim.dolphin);
        Animation newsAnimation = AnimationUtils.loadAnimation(this, R.anim.news);
        Animation hashtagAnimation = AnimationUtils.loadAnimation(this, R.anim.hashtag);


        // Start the animations
        airplane.startAnimation(airplaneAnimation);
        logo.startAnimation(logoAnimation);
        dolphin.startAnimation(dolphinAnimation);
        newsTextView.startAnimation(newsAnimation);
        hashtag.startAnimation(hashtagAnimation);

        // set timer each 6 seconds stRT ANIMATION AGAIN and make image invisible



    }
}