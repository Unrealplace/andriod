package com.example.demo5;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class titleLayout extends LinearLayout implements View.OnClickListener {
    public titleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.navgationbar,this);
        Button backBtn = findViewById(R.id.title_back);
        backBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.title_back:
                Log.d("hello","hello world");
                ((Activity)getContext()).finish();
                break;

                default:
                    break;
        }
    }
}
