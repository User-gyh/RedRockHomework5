package com.example.redhomework_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView aTextView = findViewById(R.id.sign_up);
        TextView bTextView = findViewById(R.id.sina);
        TextView cTextView = findViewById(R.id.tecent);
        ImageButton aImageView = findViewById(R.id.sign_sina);
        ImageButton bImageView = findViewById(R.id.sign_tecent);

        bImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"腾讯微博登录暂未开放",Toast.LENGTH_SHORT).show();
            }
        });

        aImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"新浪微博登录暂未开放",Toast.LENGTH_SHORT).show();
            }
        });

        cTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"腾讯微博登录暂未开放",Toast.LENGTH_SHORT).show();
            }
        });


        bTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"新浪微博登录暂未开放",Toast.LENGTH_SHORT).show();
            }
        });


        aTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Register.class);
                startActivity(intent);
            }
        });


    }
}