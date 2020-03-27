package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class InformGroup extends AppCompatActivity {
    private Button backGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inform_group);
    }

    private void findAllView () {
        backGroup = findViewById(R.id.backGroupButton);
    }
}
