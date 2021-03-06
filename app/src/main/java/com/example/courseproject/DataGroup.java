package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataGroup extends AppCompatActivity {
    private Button backNb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_group);

        findAllView();

        backNb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBackNb = new Intent(DataGroup.this, MainActivity.class);
                startActivity(intentBackNb);
            }
        });
    }

    private void findAllView () {
        backNb = findViewById(R.id.backNbButton);
    }
}
