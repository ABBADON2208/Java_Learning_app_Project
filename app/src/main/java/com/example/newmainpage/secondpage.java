package com.example.newmainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondpage extends AppCompatActivity {
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        answer = findViewById(R.id.answer);

        String text;
        Intent ii = getIntent();
        Bundle b = ii.getExtras();

        if(b!=null)
        {
            text = (String) b.get("allquestionanswer");
            answer.setText(text);
        }
    }
}