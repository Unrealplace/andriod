package com.example.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
    }

    public void createNewActivity(View view) {
        Intent intent = new Intent(ThirdActivity.this,SingleTaskActivity.class);
        startActivity(intent);
    }

    public void disMissClick (View view) {
        finish();
    }
}
