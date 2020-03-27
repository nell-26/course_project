package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformIteamGroup extends AppCompatActivity {
    private Button backSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inform_iteam_group);

        findAllView();

        backSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBackSchedule = new Intent(InformIteamGroup.this, MainActivity.class);
                startActivity(intentBackSchedule);
            }
        });
    }

    private void findAllView () {
        backSchedule = findViewById(R.id.backScheduleButton);
    }
}
