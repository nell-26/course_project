package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button informationToStudents;
    private Button scheduleOfSubjects;
    private Button iformationNb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllView();

        informationToStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFromMainActivityToInformationOfStudentsActivity = new Intent(MainActivity.this, InformationOfStudentsActivity.class);
                startActivity(intentFromMainActivityToInformationOfStudentsActivity);
            }
        });

        findAllView();

        scheduleOfSubjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentScheduleOfSubject = new Intent(MainActivity.this, ScheduleOfItems.class);
                startActivity(intentScheduleOfSubject);
            }
        });

        findAllView();

        iformationNb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDataNb = new Intent(MainActivity.this, DateNb.class);
                startActivity(intentDataNb);
            }
        });
    }

    // шукає та прив'язує кнопки
    private void findAllView () {
        informationToStudents = findViewById(R.id.informationToStudentsButton);
        scheduleOfSubjects = findViewById(R.id.scheduleOfSubjectsButton);
        iformationNb = findViewById(R.id.iformationNbButton);
    }
}
