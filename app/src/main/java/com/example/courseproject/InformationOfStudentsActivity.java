package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class InformationOfStudentsActivity extends AppCompatActivity {
    private Button back;

    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_of_students);

        findAllView();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBack = new Intent(InformationOfStudentsActivity.this, MainActivity.class);
                startActivity(intentBack);
            }
        });

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Container.getGroupNames());

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(InformationOfStudentsActivity.this, InformationToStudentActivity.class);
                Group group = Container.getGroupByName(Container.getGroupNames().get(position));

                ArrayList<Student> students = group.getStudents();

                int index = 0;

                for (Student temp : students) {
                    intent.putExtra("student_name" + index, temp.getName());
                    intent.putExtra("student_rate" + index, temp.getRate());
                    intent.putExtra("student_surName" + index, temp.getSurName());
                    index++;
                }
                intent.putExtra("student_count", index);

                startActivity(intent);
            }
        });
    }

    private void findAllView () {
        back = findViewById(R.id.backButton);
        listView = findViewById(R.id.listOfGroup);
    }
}

