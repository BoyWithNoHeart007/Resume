package com.example.resume;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class education extends BaseActivity {

    EditText course,school,grade,year;
    Button reset,next;
    String Course,School,Grade,Year;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        course = findViewById(R.id.course);
        school = findViewById(R.id.school);
        grade = findViewById(R.id.grade);
        year = findViewById(R.id.year);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(view -> {
            course.setText("");
            grade.setText("");
            year.setText("");
            school.setText("");
        });

        next.setOnClickListener(view -> {
            Course = course.getText().toString();
            School = school.getText().toString();
            Grade = grade.getText().toString();
            Year = year.getText().toString();

            editor.putString("course",Course);
            editor.putString("school",School);
            editor.putString("grade",Grade);
            editor.putString("year",Year);
            editor.commit();

            Intent intent = new Intent(education.this,experience.class);
            finish();
            startActivity(intent);

        });
    }
}