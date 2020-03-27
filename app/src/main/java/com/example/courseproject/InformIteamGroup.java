package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class InformIteamGroup extends AppCompatActivity {
    private Button backSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inform_iteam_group);
    }

    private void findAllView () {
        backSchedule = findViewById(R.id.backScheduleButton);
    }
}
