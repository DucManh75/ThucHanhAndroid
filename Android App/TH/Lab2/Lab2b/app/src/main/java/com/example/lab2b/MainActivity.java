package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
Button redbutton,bluebutton,greenbutton,graybutton;
LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redbutton = findViewById(R.id.red);
        bluebutton = findViewById(R.id.blue);
        greenbutton = findViewById(R.id.green);
        graybutton = findViewById(R.id.gray);
        layout = findViewById(R.id.LinearLayout);

        redbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.RED);
            }
        });
        bluebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.BLUE);
            }
        });
        graybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.GRAY);
            }
        });
        greenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.GREEN);
            }
        });
    }
}