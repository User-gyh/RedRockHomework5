package com.example.redhomework_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button aButton = findViewById(R.id.button_name);
        ImageButton aImageButton = findViewById(R.id.button_back);

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Register.this,"注册成功，请重新登录",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Register.this,MainActivity.class);
                startActivity(intent);
            }
        });


        aImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}