package com.example.newmainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfpage extends AppCompatActivity {
PDFView pdfview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfpage);
        pdfview = findViewById(R.id.pdfview);

        Bundle b = getIntent().getExtras();

        if(b!=null)
        {
            String j =(String) b.get("unique");

            if(j.equals("1"))
                pdfview.fromAsset("pdf1.pdf").load();
            else if(j.equals("2"))
                pdfview.fromAsset("pdf2.pdf").load();
            else if(j.equals("3"))
                pdfview.fromAsset("pdf3.pdf").load();
            else if(j.equals("4"))
                pdfview.fromAsset("pdf4.pdf").load();
            else if(j.equals("5"))
                pdfview.fromAsset("pdf5.pdf").load();
            else if(j.equals("6"))
                pdfview.fromAsset("pdf6.pdf").load();
            else if(j.equals("7"))
                pdfview.fromAsset("pdf7.pdf").load();
            else if(j.equals("8"))
                pdfview.fromAsset("pdf8.pdf").load();
            else if(j.equals("9"))
                pdfview.fromAsset("pdf9.pdf").load();
            else if(j.equals("10"))
                pdfview.fromAsset("pdf10.pdf").load();
            else if(j.equals("11"))
                pdfview.fromAsset("pdf11.pdf").load();
            else if(j.equals("12"))
                pdfview.fromAsset("pdf12.pdf").load();
            else if(j.equals("13"))
                pdfview.fromAsset("pdf13.pdf").load();
            else if(j.equals("14"))
                pdfview.fromAsset("pdf14.pdf").load();
            else if(j.equals("15"))
                pdfview.fromAsset("pdf15.pdf").load();
            else if(j.equals("16"))
                pdfview.fromAsset("pdf16.pdf").load();
            else if(j.equals("17"))
                pdfview.fromAsset("pdf17.pdf").load();
            else if(j.equals("18"))
                pdfview.fromAsset("pdf18.pdf").load();
            else if(j.equals("19"))
                pdfview.fromAsset("pdf19.pdf").load();
            else if(j.equals("20"))
                pdfview.fromAsset("pdf20.pdf").load();
            else if(j.equals("21"))
                pdfview.fromAsset("pdf21.pdf").load();
            else if(j.equals("22"))
                pdfview.fromAsset("pdf22.pdf").load();
            else if(j.equals("23"))
                pdfview.fromAsset("pdf23.pdf").load();
            else if(j.equals("24"))
                pdfview.fromAsset("pdf24.pdf").load();
            else if(j.equals("25"))
                pdfview.fromAsset("pdf25.pdf").load();
            else if(j.equals("26"))
                pdfview.fromAsset("pdf26.pdf").load();
            else if(j.equals("27"))
                pdfview.fromAsset("pdf27.pdf").load();
            else if(j.equals("28"))
                pdfview.fromAsset("pdf28.pdf").load();
            else if(j.equals("29"))
                pdfview.fromAsset("pdf30.pdf").load();
            else if(j.equals("30"))
                pdfview.fromAsset("pdf31.pdf").load();
            else if(j.equals("31"))
                pdfview.fromAsset("pdf29.pdf").load();
        }
    }
}