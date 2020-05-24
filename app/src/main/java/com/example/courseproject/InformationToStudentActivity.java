package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InformationToStudentActivity extends AppCompatActivity {

    private TextView rateText;
    private Button backButton;
    private String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_to_student);

        rateText = findViewById(R.id.rateText);
        backButton = findViewById(R.id.button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationToStudentActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        Bundle arguments = getIntent().getExtras();
        int studentCount = arguments.getInt("student_count");

        for (int i = 0; i < studentCount; i++) {
            text += arguments.getString("student_name" + i) + "  "+ arguments.getString("student_surName" + i) + " рейтинг " + arguments.getFloat("student_rate" + i) + " пропуски " + arguments.getInt("student_nb" + i) + "\n";
        }

        rateText.setText(text);
    }
}
