package com.example.a61133899_bai19;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class MyArrayAdapter extends ArrayAdapter<String> {
    private Activity context;
    public MyArrayAdapter(Activity context) {
        super(context, R.layout.item_row, items);
        this.context=context;
    }
    public View getView(int position, View contextView){
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(R.layout.item_row, null);
        TextView txtdisplay= (TextView) row.findViewById(R.id.textView1);
        ImageView imgdisplay= (ImageView) row.findViewById(R.id.imageView1);
        txtdisplay.setText(items[position]);
        if (items[position].length()>=5) {
            imgdisplay.setImageResource(R.drawable.ic_launcher_background);
        }else {
            imgdisplay.setImageResource(R.drawable.ic_launcher_foreground);
        }
        return row;

    }
}
    }
