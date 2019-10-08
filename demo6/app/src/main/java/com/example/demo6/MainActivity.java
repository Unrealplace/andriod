package com.example.demo6;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"和拉拉勾的撒","和拉拉勾的撒","和拉拉勾的撒","ofndoango","ofndoangod","ongngng"};

    private List<Fruit> fruitList = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_expandable_list_item_1,data);
//
//        ListView listView = findViewById(R.id.main_listView);
//
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,"" + position,Toast.LENGTH_LONG).show();
//            }
//        });

        initFruits();

        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.item_layout,fruitList);

        ListView listView = findViewById(R.id.main_listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        listView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                Log.d("hello","scrllo" + scrollY);
            }
        });

    }

    public void initFruits() {
        for (int i = 0 ; i < 20; i++){
            Fruit fruit = new Fruit("hello world" + i,R.drawable.ic_launcher_background);
            fruitList.add(fruit);
        }
    }
}
