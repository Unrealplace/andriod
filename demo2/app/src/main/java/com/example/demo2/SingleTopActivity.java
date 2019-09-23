package com.example.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

import androidx.annotation.Nullable;

public class SingleTopActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singletop_layout);
        Window window = getWindow();
        View view  = window.getDecorView();
        view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }

    public void singleBack(View view) {
        Intent intent = new Intent(SingleTopActivity.this,SecondActivity.class);
        startActivity(intent);
    }
}
