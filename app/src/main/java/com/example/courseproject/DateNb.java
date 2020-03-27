package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DateNb extends AppCompatActivity {
    private Button backData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_nb);

        findAllView();

        backData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbaclData = new Intent(DateNb.this, MainActivity.class);
                startActivity(intentbaclData);
            }
        });
    }

    private void findAllView () {
        backData = findViewById(R.id.backDataButton);
    }
}
