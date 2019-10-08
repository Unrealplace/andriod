package com.example.demo6;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private  int contentViewId;
    private  List<Fruit> listObject;

    class ViewHolder {
        private ImageView fruitImageView;
        private TextView fruitTextView;
    }

    public FruitAdapter(Context context, int resource, List<Fruit> listObject) {
        super(context, resource, listObject);
        this.contentViewId = resource;
        this.listObject = listObject;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit model = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(contentViewId,null);
            viewHolder  = new ViewHolder();
            ImageView imageView = view.findViewById(R.id.item_img);
            TextView textView = view.findViewById(R.id.item_text);
            viewHolder.fruitImageView = imageView;
            viewHolder.fruitTextView = textView;
            view.setTag(viewHolder);
        } else  {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.fruitTextView.setText(model.getName());
        viewHolder.fruitImageView.setImageResource(model.getImageId());
        return  view;
    }

    @Override
    public int getCount() {
        return listObject.size();
    }
}
