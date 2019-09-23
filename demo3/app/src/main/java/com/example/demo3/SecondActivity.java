package com.example.demo3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent intent = getIntent();

        Log.d("params",intent.getStringExtra("key1") + " " + intent.getStringExtra("key2"));
    }

    public void  dissMiss (View view) {
        ActivityCollector.finishAll();
    }
}
