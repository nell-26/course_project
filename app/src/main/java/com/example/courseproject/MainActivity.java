package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button informationToStudens;
    private Button scheduleOfSubjects;
    private Button iformationNb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllView();

        informationToStudens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFromMainActivityToInformationOfStudentsActivity = new Intent(MainActivity.this, InformationOfStudentsActivity.class);
                startActivity(intentFromMainActivityToInformationOfStudentsActivity);
            }
        });
    }

    // шукає та прив'язує кнопки
    private void findAllView () {
        informationToStudens = findViewById(R.id.informationToStudensButton);
        scheduleOfSubjects = findViewById(R.id.scheduleOfSubjectsButton);
        iformationNb = findViewById(R.id.iformationNbButton);
    }
}
