package com.example.demo7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView msgListView;
    private EditText inputText;
    private Button send;
    private MsgAdapter msgAdapter;
    private List<Message> msgList = new ArrayList<Message>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        msgListView = findViewById(R.id.msg_list_view);

        send = findViewById(R.id.send);

        inputText = findViewById(R.id.input_text);

        msgAdapter = new MsgAdapter(MainActivity.this,R.layout.msg_item,msgList);

        msgListView.setAdapter(msgAdapter);

        // 发送按钮点击事件
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String content = inputText.getText().toString();
                if (!content.equals("") && content.length() > 0){
                    Message message = new Message(content,Message.TYPE_SENT);
                    msgList.add(message);
                    msgAdapter.notifyDataSetChanged();
                    msgListView.setSelection(msgList.size());
                    inputText.setText("");
                }
            }
        });

    }

    public void initData(){
        Message msg1 = new Message("Hello guy.", Message.TYPE_RECEIVED); msgList.add(msg1);
        Message msg2 = new Message("Hello. Who is that?", Message.TYPE_SENT); msgList.add(msg2);
        Message msg3 = new Message("This is Tom. Nice talking to you. ", Message.TYPE_RECEIVED); msgList.add(msg3);

    }
}
