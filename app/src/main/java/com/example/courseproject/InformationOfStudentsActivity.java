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
                Toast.makeText(InformationOfStudentsActivity.this, "" + position,Toast.LENGTH_LONG).show();
            }
        });
    }

    private void findAllView () {
        back = findViewById(R.id.backButton);
       // listView = findViewById(R.id.listOfGroup);
    }
}
