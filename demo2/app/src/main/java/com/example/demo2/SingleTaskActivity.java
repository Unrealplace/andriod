package com.example.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class SingleTaskActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singletask_layout);
    }

    public void nextBtnClick(View view) {
        Intent intent = new Intent(SingleTaskActivity.this,ThirdActivity.class);
        startActivity(intent);
    }
}
