package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class infoActivity extends AppCompatActivity {
    private Button backButtton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        backButtton = findViewById(R.id.backButtonInfo);


        backButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(infoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
