package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import android.app.Activity;
import android.view.View.OnTouchListener;
import android.view.View;

import java.util.ArrayList;


public class SpannableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spannable);

        TextView textView = findViewById(R.id.tvText);
//         set text style using spannable
        Spannable spannable = new SpannableString("sayur"+" "+"bayam");
        spannable.setSpan(new ForegroundColorSpan(Color.BLUE),0,"sayur".length(),spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.RED),"sayur".length(),("sayur".length())+(" bayam".length()),spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannable);
    }
};