package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the SignUp TextView
        TextView signupText = findViewById(R.id.signupText);


        findViewById(R.id.signupText).setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);

            startActivity(intent);

        }); findViewById(R.id.submitButton).setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, toolbar.class);

            startActivity(intent);

        });
    }
}
