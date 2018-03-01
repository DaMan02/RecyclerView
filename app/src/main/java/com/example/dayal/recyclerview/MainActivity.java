package com.example.dayal.recyclerview;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dayal.recyclerview.Model.ListItem;
import com.example.dayal.recyclerview.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem>  listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems=new ArrayList<>();
        for(int i=0;i<20;i++){
            ListItem item=new ListItem("Item "+(i+1),"description");
            listItems.add(item);

        }

        adapter=new MyAdapter(this,listItems);
         recyclerView.setAdapter(adapter);
    }
}
