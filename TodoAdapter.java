package com.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TodoAdapter extends ArrayAdapter<Todo> {

    Context con;
    int res = R.layout.row;
    List<Todo> items;

    public TodoAdapter(@NonNull Context context, int resource, @NonNull List<Todo> todos) {
        super(context, resource, todos);
        con = context;
        res = resource;
        items = todos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;
        LayoutInflater lafn = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row = lafn.inflate(res , parent , false);
        TextView title = row.findViewById(R.id.rowTitle);
        title.setText(items.get(position).getName());
        TextView title1 = row.findViewById(R.id.rowDesc);
        title1.setText(items.get(position).getDescription());
        ImageView image = row.findViewById(R.id.imageView);
        image.setImageResource(items.get(position).getIconIndex());
        //CheckBox check = row.findViewById(R.id.checkBox2);
        //check.setChecked(items.get(position).isCh());
        return row;
    }
}
