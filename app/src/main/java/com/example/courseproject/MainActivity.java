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

        if(Container.isGroupExist) {

        } else {
            createStudents();
            Container.isGroupExist = true;
        }


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
                Intent intentDataNb = new Intent(MainActivity.this, infoActivity.class);
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
        Container.addStudentInP31(new Student("Анастасія", "Крупа", "26.11.2001", "0989516668", 4.9f, 0));
        Container.addStudentInP31(new Student("Назар", "Дуб", "00/00/0000", "00000000", 4.4f, 0));
        Container.addStudentInP31(new Student("Віталій ", "Андрейчук", "00/00/0000", "0000000000", 3f, 0));
        Container.addStudentInP31(new Student("Максим", "Боледзюк", "00/00/0000", "0000000000", 3.9f, 0));
        Container.addStudentInP31(new Student("Андрій", "Борисевич", "00/00/0000", "0000000000", 4.9f, 0));
        Container.addStudentInP31(new Student("Володя", "Геник", "00/00/0000", "0000000000", 4f, 0));
        Container.addStudentInP31(new Student("Богдан", "Горук", "00/00/0000", "0000000000", 4f, 0));
        Container.addStudentInP31(new Student("Максим", "Джаман", "00/00/0000", "0000000000", 3.1f, 0));
        Container.addStudentInP31(new Student("Михайло", "Дудяк", "00/00/0000", "0000000000", 2.9f, 0));
        Container.addStudentInP31(new Student("Олексій", "Захарчук", "00/00/0000", "0000000000", 4f, 0));
        Container.addStudentInP31(new Student("Ростислав", "Куничак", "00/00/0000", "0000000000", 2.7f, 0));
        Container.addStudentInP31(new Student("Василь", "Микитюк", "00/00/0000", "0000000000", 4.5f, 0));
        Container.addStudentInP31(new Student("Вікторія", "Микитюк", "00/00/0000", "0000000000", 3f, 0));
        Container.addStudentInP31(new Student("Дмитро", "Огорожничук", "00/00/0000", "0000000000", 4f, 0));
        Container.addStudentInP31(new Student("Арсен", "Паламарчук", "00/00/0000", "0000000000", 4.2f, 0));
        Container.addStudentInP31(new Student("Руслан", "Перцович", "00/00/0000", "0000000000", 4.6f, 0));
        Container.addStudentInP31(new Student("Тарас", "Смолін", "00/00/0000", "0000000000", 3.3f, 0));
        Container.addStudentInP31(new Student("Арсен", "Стасюк", "00/00/0000", "0000000000", 2.9f, 0));
        Container.addStudentInP31(new Student("Назар", "Стефурак", "00/00/0000", "0000000000", 2.9f, 0));
        Container.addStudentInP31(new Student("Олег", "Тремтячий", "00/00/0000", "0000000000", 2.8f, 0));
        Container.addGroupInList(new Group("P-31", "shedule", Container.getStudents_P31()));

        Container.addStudentInP32(new Student("Василь", "Лесюк", "00.00.0000", "0000000000", 4.5f, 0));
        Container.addStudentInP32(new Student("Олександр", "Гладуник", "00.00.0000", "0000000000", 4.3f, 0));
        Container.addStudentInP32(new Student("Сергій", "Палійчук", "00.00.0000", "0000000000", 4.4f, 0));
        Container.addStudentInP32(new Student("Василь", "Василишин", "00.00.0000", "0000000000", 4.4f, 0));
        Container.addStudentInP32(new Student("Вікторія", "Саваріна", "00.00.0000", "0000000000", 4f, 0));
        Container.addStudentInP32(new Student("Віталія", "Іллюк", "00.00.0000", "0000000000", 3.9f, 0));
        Container.addStudentInP32(new Student("Іван", "Дем`янчук", "00.00.0000", "0000000000", 3.9f, 0));
        Container.addStudentInP32(new Student("Роман", "Гобілецький", "00.00.0000", "0000000000", 3.9f, 0));
        Container.addStudentInP32(new Student("Дмитро", "Лінкевич", "00.00.0000", "0000000000", 3.8f, 0));
        Container.addStudentInP32(new Student("Тепчук", "Тетяна", "00.00.0000", "0000000000", 3.7f, 0));
        Container.addStudentInP32(new Student("Роман", "Жарко", "00.00.0000", "0000000000", 3.7f, 0));
        Container.addStudentInP32(new Student("Станіслав", "Будзяновський", "00.00.0000", "0000000000", 3.5f, 0));
        Container.addStudentInP32(new Student("Тарас", "Яворницький", "00.00.0000", "0000000000", 3.5f, 0));
        Container.addStudentInP32(new Student("Ростислав", "Фелицук", "00.00.0000", "0000000000", 3f, 0));
        Container.addStudentInP32(new Student("Максим", "Депутат", "00.00.0000", "0000000000", 3.1f, 0));
        Container.addGroupInList(new Group("P-32", "shedule", Container.getStudents_P32()));
    }
}

