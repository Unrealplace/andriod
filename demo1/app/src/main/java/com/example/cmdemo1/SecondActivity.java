package com.example.cmdemo1;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Button btn = findViewById(R.id.second_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hello","second_onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hello","second_onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hello","second_onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hello","second_onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hello","second_onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hello","second_onRestart");

    }
}
