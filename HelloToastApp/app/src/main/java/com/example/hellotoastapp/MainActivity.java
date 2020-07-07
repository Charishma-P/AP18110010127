package com.example.hellotoastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Bcount,Bhello;
    TextView tv;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bcount = findViewById(R.id.count);
        Bhello = findViewById(R.id.hello);
        tv = findViewById(R.id.textcount);
        Bcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //action
                a++;
                tv.setText(""+a);
            }
        });
        if(savedInstanceState!=null){
            String s = savedInstanceState.getString("cherry");
            tv.setText(s);
        }

    }

    public void display(View view) {
        String getcount = tv.getText().toString();
        Intent i = new Intent(MainActivity.this,Hello.class);
        i.putExtra("mycount", getcount);
        startActivity(i);

    }
}