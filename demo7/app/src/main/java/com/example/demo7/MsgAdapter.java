package com.example.demo7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MsgAdapter extends ArrayAdapter<Message> {
    private int resourceId;
    private ViewHolder viewHolder;

    class ViewHolder {
        private LinearLayout leftLayout;
        private LinearLayout rightLayout;
        private TextView leftText;
        private TextView rightText;

        private void configureView(Message message){

            if (message.getType() == Message.TYPE_RECEIVED) {
                leftLayout.setVisibility(View.VISIBLE);
                rightLayout.setVisibility(View.GONE);
                leftText.setText(message.getContent());
            } else  {
                leftLayout.setVisibility(View.GONE);
                rightLayout.setVisibility(View.VISIBLE);
                rightText.setText(message.getContent());
            }
        }
    }

    public MsgAdapter(Context context, int resource, List<Message> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Message message = getItem(position);
        View view;
        if (convertView == null) {
          view = LayoutInflater.from(getContext()).inflate(resourceId,null);
          viewHolder = new ViewHolder();
          viewHolder.leftLayout = view.findViewById(R.id.left_layout);
          viewHolder.rightLayout = view.findViewById(R.id.right_layout);
          viewHolder.leftText = view.findViewById(R.id.left_msg);
          viewHolder.rightText = view.findViewById(R.id.right_msg);
          view.setTag(viewHolder);
        } else  {
          view = convertView;
          viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.configureView(message);

        return view;
    }
}
