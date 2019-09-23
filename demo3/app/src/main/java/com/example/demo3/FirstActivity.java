package com.example.demo3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class FirstActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first_layout);
    }

    public void nextPage(View view) {
       actionStart(FirstActivity.this,SecondActivity.class,"hello","world");
    }
}
