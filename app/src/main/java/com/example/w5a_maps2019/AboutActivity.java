package com.example.w5a_maps2019;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.*;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class AboutActivity extends AppCompatActivity {
    String tag="ActivityManager";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Log.i(tag, "About activity started.");


    }
}
