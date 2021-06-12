package com.example.newmainpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
CardView image1,image2,image3,image4;
ImageView video,amazon,udemy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        video = findViewById(R.id.video);
        amazon = findViewById(R.id.amazon);
        udemy = findViewById(R.id.udemy);

        video.setOnClickListener((View v) -> {
            String url = "https://youtu.be/hBh_CC5y8-s";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        amazon.setOnClickListener((View v) -> {
            String url = "https://www.amazon.in/s?k=java+book&ref=nb_sb_noss";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        udemy.setOnClickListener((View v) -> {
            String url = "https://www.udemy.com/share/101Wdq/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        image1.setOnClickListener((View v) -> {
            Intent intent = new Intent(this,intropage.class);
            startActivity(intent);
        });

        image2.setOnClickListener((View v) -> {
            Intent intent = new Intent(this,chapterpage.class);
            startActivity(intent);
        });

        image3.setOnClickListener((View v) -> {
            Intent intent = new Intent(this,codingpage.class);
            startActivity(intent);
        });

        image4.setOnClickListener((View v) -> {
            Intent intent = new Intent(this,interviewpage.class);
            startActivity(intent);
        });



    }
}