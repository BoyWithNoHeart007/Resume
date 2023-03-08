package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class education extends BaseActivity {

    EditText edcourse1,edcourse2,edcourse3,edschool1,edschool2,edschool3,edgrade1,edgrade2,edgrade3,edyear1,edyear2,edyear3;
    Button reset,next;
    String course1,school1,grade1,year1,course2,school2,grade2,year2,course3,school3,grade3,year3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        edcourse1 = findViewById(R.id.edcourse1);
        edschool1 = findViewById(R.id.edschool1);
        edgrade1 = findViewById(R.id.edgrade1);
        edyear1 = findViewById(R.id.edyear1);
        edcourse2 = findViewById(R.id.edcourse2);
        edschool2 = findViewById(R.id.edschool2);
        edgrade2 = findViewById(R.id.edgrade2);
        edyear2 = findViewById(R.id.edyear2);
        edcourse3 = findViewById(R.id.edcourse3);
        edschool3 = findViewById(R.id.edschool3);
        edgrade3 = findViewById(R.id.edgrade3);
        edyear3 = findViewById(R.id.edyear3);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edcourse1.setText("");
                edcourse2.setText("");
                edcourse3.setText("");
                edgrade1.setText("");
                edgrade2.setText("");
                edgrade3.setText("");
                edyear1.setText("");
                edyear2.setText("");
                edyear3.setText("");
                edschool1.setText("");
                edschool2.setText("");
                edschool3.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                course1 = edcourse1.getText().toString();
                school1 = edschool1.getText().toString();
                grade1 = edgrade1.getText().toString();
                year1 = edyear1.getText().toString();
                course2 = edcourse2.getText().toString();
                school2 = edschool2.getText().toString();
                grade2 = edgrade2.getText().toString();
                year2 = edyear2.getText().toString();
                course3 = edcourse3.getText().toString();
                school3 = edschool3.getText().toString();
                grade3 = edgrade3.getText().toString();
                year3 = edyear3.getText().toString();

                Intent intent = new Intent(education.this,experience.class);
                finish();
                startActivity(intent);

            }
        });
    }
}