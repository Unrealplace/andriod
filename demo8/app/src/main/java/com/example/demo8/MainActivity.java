package com.example.demo8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.left_btn);
        btn.setOnClickListener(this);

        // 在活动中调用 fragment 的 方法
        LeftFragment  leftFragment = (LeftFragment) getSupportFragmentManager().findFragmentById(R.id.left_fragment);
        leftFragment.updateFragmentFromActivity("hello world");
    }

    public void updateActivityFromFragment(String updateMessage) {
        Toast.makeText(this,updateMessage,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

        int vId = v.getId();
        switch (vId) {
            case R.id.left_btn:

                // 切换一个fragment ， 并加入返回栈中
                AnotherFragment anotherFragment = new AnotherFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.right_layout,anotherFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
                default:
                    break;
        }
    }
}
