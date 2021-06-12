package com.example.newmainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class interviewpage extends AppCompatActivity {
ImageView interviewimage1,interviewimage2,interviewimage3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interviewpage);
        interviewimage1 = findViewById(R.id.interviewimage1);
        interviewimage2 = findViewById(R.id.interviewimage2);

        interviewimage1.setOnClickListener((View v)-> {
            Intent intent = new Intent(this,interviewpage2.class);
            startActivity(intent);
        });

        interviewimage2.setOnClickListener((View v)-> {
            Intent intent = new Intent(this, pdfpage.class);
            intent.putExtra("unique", "4" );
            startActivity(intent);
        });

    }
}