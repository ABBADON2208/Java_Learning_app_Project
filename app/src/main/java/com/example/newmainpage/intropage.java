package com.example.newmainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class intropage extends AppCompatActivity {
    private TextView introductiontext1,introductiontext4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intropage);
        introductiontext1 = (TextView)findViewById(R.id.introductiontext1);
        introductiontext4 = (TextView) findViewById(R.id.introductiontext4);
        introductiontext1.setTextColor(Color.GREEN);

        String text = "    // A Java program to print \"Hello World\" \n\n" +
                "    public class GFG {\n" +
                "    public static void main(String args[])\n" +
                "    {\n" +
                "        System.out.println(\"Hello World\");\n" +
                "    }\n" +
                "    }"+ "\n\n   Hello World //OUTPUT";
        SpannableString ss = new SpannableString(text);
        ForegroundColorSpan textgreen = new ForegroundColorSpan(Color.parseColor("#FFFDF004"));
        BackgroundColorSpan textgreenback = new BackgroundColorSpan(Color.BLUE);
        ss.setSpan(textgreen,0,47, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        ss.setSpan(textgreenback,178,198,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        introductiontext4.setText(ss);

    }
}