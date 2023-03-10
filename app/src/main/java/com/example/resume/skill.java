package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class skill extends AppCompatActivity {

    Button reset,next;
    EditText skill1,skill2,skill3,skill4;
    String skil1,skil2,skil3,skil4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        skill1 = findViewById(R.id.skill1);
        skill2 = findViewById(R.id.skill2);
        skill3 = findViewById(R.id.skill3);
        skill4 = findViewById(R.id.skill4);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skill1.setText("");
                skill2.setText("");
                skill3.setText("");
                skill4.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                skil1 = skill1.getText().toString();
                skil2 = skill2.getText().toString();
                skil3 = skill3.getText().toString();
                skil4 = skill4.getText().toString();

                Intent intent = new Intent(skill.this,workprofile.class);
                finish();
                startActivity(intent);
            }
        });

    }
}