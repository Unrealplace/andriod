package com.example.cmdemo1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_btn1).setOnClickListener(this);
        findViewById(R.id.main_btn2).setOnClickListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hello","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hello","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hello","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hello","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hello","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hello","onRestart");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Log.d("main",v.getId()+"");
        int id = v.getId();
        switch (id) {
            case R.id.main_btn1:
            {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
                break;
            case R.id.main_btn2:
            {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);

            }
                break;
                default:
                    break;
        }
    }
}
