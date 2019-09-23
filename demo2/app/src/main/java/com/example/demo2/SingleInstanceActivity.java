package com.example.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class SingleInstanceActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleinstance_layout);

    }

    public  void singleInstanceBtnClick (View view) {
        Intent intent = new Intent(SingleInstanceActivity.this,ThirdActivity.class);
        startActivity(intent);
    }
}
