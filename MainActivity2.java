package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
   private Button bk;
   private TextView txt , txt1;
   private ImageView img;
   private String txt2 , txt3 , photo;
   private Boolean cheb1;
   private  CheckBox cheb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bk = (Button) findViewById(R.id.button);
        txt = (TextView) findViewById(R.id.textView3);
        txt1 = (TextView) findViewById(R.id.textView4);
        img = (ImageView) findViewById(R.id.imageView2);
        //cheb = (CheckBox) findViewById(R.id.checkBox);
        Intent intent = getIntent();
        txt2= getIntent().getStringExtra("key1");
        txt3= getIntent().getStringExtra("key2");
        photo = getIntent().getStringExtra("key3");

        //cheb1 =getIntent().getBooleanExtra("key4", false);
       // Log.d(String.valueOf(cheb1), "onCreate: ");
        //cheb.setChecked(cheb1);
        txt.setText(txt2);
        txt1.setText(txt3);
        //
        //
        img.setImageResource(getIntent().getIntExtra("key3" , 0));
        bk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}