package com.example.m3_hw_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button next;
    Button nex;
    Button ne;
    Button ski;
    Button sk;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ski = findViewById(R.id.ski);
        sk = findViewById(R.id.sk);

        next = findViewById(R.id.nex);
        nex = findViewById(R.id.next);
        ne = findViewById(R.id.ne);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container, new Fragment2()).commit();
                next.setVisibility(android.view.View.GONE);
            }
        });
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment3()).commit();
            }
        });

        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment1()).commit();
                ne.setVisibility(android.view.View.GONE);
            }
        });
        ski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment1()).commit();
            }
        });

        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment2()).commit();
                sk.setVisibility(android.view.View.GONE);
            }
        });
    }
}