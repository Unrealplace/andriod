package com.example.demo3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    public static void actionStart(Context context, Class cls, String data1, String data2) {
        Intent intent = new Intent(context,cls);
        intent.putExtra("key1",data1);
        intent.putExtra("key2",data2);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        Log.d("BaseActivity-destory",getClass().getSimpleName());

    }
}
