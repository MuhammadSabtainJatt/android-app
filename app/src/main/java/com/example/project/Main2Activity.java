package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.signupText).setOnClickListener(v ->{
            Intent intent = new Intent(Main2Activity.this, MainActivity.class);

        startActivity(intent);

        });
        findViewById(R.id.submitButton).setOnClickListener(v ->{
            Intent intent = new Intent(Main2Activity.this, MainActivity.class);

        startActivity(intent);

        });
    }
}