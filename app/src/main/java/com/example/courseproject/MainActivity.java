package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

        createStudents();

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

    private void createStudents () {
        Container.addStudentInP31(new Student("Nastya", "Krupa", "26.11.2001", "0989516668", 4.6f, 0));
        Container.addStudentInP31(new Student("Nazar", "Dub", "00/00/0000", "00000000", 3.7f, 0));
        Container.addStudentInP31(new Student("Vitalij", "Andrejchuk", "00/00/0000", "0000000000", 3.1f, 0));
        Container.addStudentInP31(new Student("Maksym", "Boledzuk", "00/00/0000", "0000000000", 3.f, 0));
        Container.addStudentInP31(new Student("Andrij", "Borysevych", "00/00/0000", "0000000000", 4.6f, 0));
        Container.addStudentInP31(new Student("Volodia", "Genyk", "00/00/0000", "0000000000", 3f, 0));
        Container.addStudentInP31(new Student("Bogdan", "Goruk", "00/00/0000", "0000000000", 3f, 0));
        Container.addStudentInP31(new Student("Maks", "Gzaman", "00/00/0000", "0000000000", 3.6f, 0));
        Container.addStudentInP31(new Student("Misha", "Dudiak", "00/00/0000", "0000000000", 4f, 0));
        Container.addStudentInP31(new Student("Oleksij", "Zaharchyk", "00/00/0000", "0000000000", 4f, 0));
        Container.addStudentInP31(new Student("Rostic", "Kunychak", "00/00/0000", "0000000000", 2.7f, 0));
        Container.addStudentInP31(new Student("Vasia", "Mykytiuk", "00/00/0000", "0000000000", 3f, 0));
        Container.addStudentInP31(new Student("Vika", "Mykytiuk", "00/00/0000", "0000000000", 3f, 0));
        Container.addStudentInP31(new Student("Dima", "Ogorodnychuk", "00/00/0000", "0000000000", 3f, 0));
        Container.addStudentInP31(new Student("Arsen", "Palamarchuk", "00/00/0000", "0000000000", 4f, 0));
        Container.addStudentInP31(new Student("Ruslan", "Percovyc", "00/00/0000", "0000000000", 4.6f, 0));
        Container.addStudentInP31(new Student("Taras", "Smolin", "00/00/0000", "0000000000", 4.6f, 0));
        Container.addStudentInP31(new Student("Arsen", "Stasiuk", "00/00/0000", "0000000000", 4.6f, 0));
        Container.addStudentInP31(new Student("Nazar", "Stefurak", "00/00/0000", "0000000000", 4.6f, 0));
        Container.addStudentInP31(new Student("Oleg", "Tremtiachyj", "00/00/0000", "0000000000", 4.6f, 0));
        Container.addGroupInList(new Group("P-31", "shedule", Container.getStudents_P31()));
    }
}
