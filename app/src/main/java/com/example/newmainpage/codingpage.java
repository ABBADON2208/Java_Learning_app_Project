package com.example.newmainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class codingpage extends AppCompatActivity {
ImageView codingimage1,codingimage2,codingimage3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codingpage);
        codingimage1 = findViewById(R.id.codingimage1);
        codingimage2 = findViewById(R.id.codingimage2);
        codingimage3 = findViewById(R.id.codingimage3);

        codingimage1.setOnClickListener((View v)-> {
            Intent intent = new Intent(this, pdfpage.class);
            intent.putExtra("unique", "1" );
            startActivity(intent);
        });
        codingimage2.setOnClickListener((View v)-> {
            Intent intent = new Intent(this, pdfpage.class);
            intent.putExtra("unique", "2" );
            startActivity(intent);
        });
        codingimage3.setOnClickListener((View v)-> {
            Intent intent = new Intent(this, pdfpage.class);
            intent.putExtra("unique", "3" );
            startActivity(intent);
        });

    }
}