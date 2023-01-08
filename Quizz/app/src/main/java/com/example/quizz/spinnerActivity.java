package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class spinnerActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        String[] courses = { "C", "Data structures",
                "Interview prep", "Algorithms",
                "DSA with java", "OS" };

        Spinner spino = findViewById(R.id.coursesspinner);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, courses);

        spino.setAdapter(ad);



    }
}