package com.example.demo6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"和拉拉勾的撒","和拉拉勾的撒","和拉拉勾的撒","ofndoango","ofndoangod","ongngng"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.item_layout,data);

        ListView listView = findViewById(R.id.main_listView);

        listView.setAdapter(adapter);

    }
}
