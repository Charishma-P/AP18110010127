package com.example.scoreboardapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvA,tvB;
    Button a1,a2,a3,b1,b2,b3,resetbutn;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1=findViewById(R.id.A1);
        a2=findViewById(R.id.A2);
        a3=findViewById(R.id.A3);
        b1=findViewById(R.id.B1);
        b2=findViewById(R.id.B2);
        b3=findViewById(R.id.B3);
        resetbutn=findViewById(R.id.reset);

        tvA = findViewById(R.id.Acount);
        tvB = findViewById(R.id.Bcount);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tvA.setText(""+a);
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=2;
                tvA.setText(""+a);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=3;
                tvA.setText(""+a);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                tvB.setText(""+b);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b+=2;
                tvB.setText(""+b);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b+=3;
                tvB.setText(""+b);
            }
        });
        resetbutn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                b=0;
                tvB.setText(""+b);
                a=0;
                tvA.setText(""+a);
            }
        });
        if(savedInstanceState!=null) {
            String s = savedInstanceState.getString("Charishma");
            String s1 = savedInstanceState.getString("Cherry");
            tvA.setText(s);
            tvB.setText(s1);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Charishma",tvA.getText().toString());
        outState.putString("Cherry",tvB.getText().toString());
    }
}
