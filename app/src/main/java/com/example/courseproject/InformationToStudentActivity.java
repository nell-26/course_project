package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InformationToStudentActivity extends AppCompatActivity {

    private TextView rateText;
    private String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_to_student);

        rateText = findViewById(R.id.rateText);


        Bundle arguments = getIntent().getExtras();
        int studentCount = arguments.getInt("student_count");

        for (int i = 0; i < studentCount; i++) {
            text += arguments.getString("student_name" + i) + "  "+ arguments.getString("student_surName" + i) + " " + arguments.getFloat("student_rate" + i) + "\n";
        }

        rateText.setText(text);
    }
}
