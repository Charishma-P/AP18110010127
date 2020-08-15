package com.example.flyryder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView tv1 = findViewById(R.id.instruction);
        TextView tv2 = findViewById(R.id.rules);
        TextView tv3 = findViewById(R.id.help);
        tv1.setText("1.Fight with gravity and deal with  X and Y axis and then kill the beast.");
        tv2.setText("1.Shoot a beast and score a point.\n2.Miss shooting a beast and loose the game.");
        tv3.setText("1.Focus on the gravity and the beast.");
    }
}