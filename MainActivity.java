package com.example.todolist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listtodo;
    TodoAdapter adapter;
    List<Todo> todos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listtodo = findViewById(R.id.simple);
        todos = new ArrayList<Todo>();
        todos.add(new Todo("1", "description1", android.R.drawable.checkbox_on_background));
        todos.add(new Todo("2", "description2" , android.R.drawable.checkbox_off_background));
        todos.add(new Todo("3", "description3" , android.R.drawable.checkbox_on_background));
        todos.add(new Todo("4", "description4" , android.R.drawable.checkbox_off_background));
        todos.add(new Todo("5", "description5" , android.R.drawable.checkbox_on_background));
        todos.add(new Todo("1", "description1" , android.R.drawable.checkbox_off_background));
        todos.add(new Todo("2", "description2" ,  android.R.drawable.checkbox_on_background));
        todos.add(new Todo("3", "description3" , android.R.drawable.checkbox_off_background));
        todos.add(new Todo("4", "description4" , android.R.drawable.checkbox_on_background));
        todos.add(new Todo("5", "description5" , android.R.drawable.checkbox_off_background));
        todos.add(new Todo("1", "description1" , android.R.drawable.checkbox_on_background));
        todos.add(new Todo("2", "description2" , android.R.drawable.checkbox_off_background));
        todos.add(new Todo("3", "description3" , android.R.drawable.checkbox_on_background));
        todos.add(new Todo("4", "description4" ,android.R.drawable.checkbox_off_background));
        todos.add(new Todo("5", "description5" , android.R.drawable.checkbox_on_background));
        todos.add(new Todo("1", "description1" , android.R.drawable.checkbox_off_background));
        todos.add(new Todo("2", "description2" ,android.R.drawable.checkbox_on_background));
        todos.add(new Todo("3", "description3" ,android.R.drawable.checkbox_off_background));
        todos.add(new Todo("4", "description4" , android.R.drawable.checkbox_on_background));
        todos.add(new Todo("5", "description5" ,android.R.drawable.checkbox_off_background));
        adapter = new TodoAdapter(this, R.layout.row, todos);
        listtodo.setAdapter(adapter);
        listtodo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this , parent.getAdapter().getItem(position).toString(), Toast.LENGTH_LONG).show();
                String move = todos.get(position).toString();
                String move1 = todos.get(position).getDescription();
                int move2 = todos.get(position).getIconIndex();
               // Boolean move3 = todos.get(position).isCh();
                    TextView txtname = (TextView) findViewById(R.id.rowTitle);
                    TextView txtdesc = (TextView) findViewById(R.id.rowDesc);
                    ImageView image = (ImageView) findViewById(R.id.imageView);
                    //CheckBox cb = (CheckBox) findViewById(R.id.checkBox2);
                    Intent I = new Intent(MainActivity.this, MainActivity2.class);
                    I.putExtra("key1", move);
                    I.putExtra("key2", move1);
                    I.putExtra("key3" , move2);
                   // I.putExtra("Key4",move3);
                    startActivity(I);

            }
        });

        listtodo.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
               // final String[] actions = {"Delete"};
                AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
                ad.setTitle("Delete Item").setMessage("Are you sure you want to delete this item?")
                        .setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        todos.remove(position);
                        adapter.notifyDataSetChanged();
                    }
                }).setNegativeButton("Cancel" , null);
                AlertDialog alert = ad.create();
                alert.show();
                return true;
            }
        });


    }
}
