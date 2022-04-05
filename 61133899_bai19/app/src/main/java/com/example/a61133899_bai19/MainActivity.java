package com.example.a61133899_bai19;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroupOverlay;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    private String[] listData;
    private ArrayAdapter<String> adapter;
    private Context context;
    TextView selection;
    int[] items;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        listData = context.getResources().getStringArray(R.array.ListViewActivity);
        selection=(TextView) findViewById(R.id.selection);
        setListAdapter(new MyArrAdapter(this));
    }
    protected void onListItemClick(ListView 1,View v,int positon, long id){
        super.onListItemClick(1,v,positon,id);

        selection.setText(items[positon]);
    }
}