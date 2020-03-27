package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformGroup extends AppCompatActivity {
    private Button backGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inform_group);

        findAllView();

        backGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformGroup.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void findAllView () {
        backGroup = findViewById(R.id.backGroupButton);
    }
}
