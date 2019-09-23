package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void singleTopClick(View view) {
        Intent intent = new Intent(MainActivity.this,SingleTopActivity.class);
        startActivity(intent);
    }

    public void singleTaskClick(View view) {
        Intent intent = new Intent(MainActivity.this,SingleTaskActivity.class);
        startActivity(intent);
    }

    public void singleInstanceClick(View view) {
        Intent intent = new Intent(MainActivity.this,SingleInstanceActivity.class);
        startActivity(intent);
    }
}
