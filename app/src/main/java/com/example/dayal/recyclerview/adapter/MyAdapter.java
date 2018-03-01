package com.example.dayal.recyclerview.adapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dayal.recyclerview.Model.ListItem;
import com.example.dayal.recyclerview.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private List<ListItem> list;

    public MyAdapter(Context context, List<ListItem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                  .inflate(R.layout.list_row,parent,false);
      return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        ListItem item=list.get(position);
        holder.title.setText(item.getName());
        holder.description.setText(item.getDesciption());
    }

    @Override
    public int getItemCount() {
      return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title;
        public TextView description;
        public ViewHolder(View itemView) {
            super(itemView);
            //register click event
            itemView.setOnClickListener(this);
          title=(TextView)itemView.findViewById(R.id.title);
            description=(TextView)itemView.findViewById(R.id.description);
        }

        @Override
        public void onClick(View view) {
            //get row position
            int position=getAdapterPosition();
            ListItem item=list.get(position);
            Toast.makeText(context,item.getName(),Toast.LENGTH_SHORT).show();
        }
    }
}
