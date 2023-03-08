package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class experience extends BaseActivity {

    String company_name,job,description,year;
    EditText edcompanyName,edjob,eddescription,edyear;
    Button reset,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        edcompanyName = findViewById(R.id.edcompanyName);
        edjob = findViewById(R.id.edjob);
        eddescription = findViewById(R.id.eddescription);
        edyear = findViewById(R.id.edyear);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edcompanyName.setText("");
                edjob.setText("");
                eddescription.setText("");
                edyear.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                company_name = edcompanyName.getText().toString();
                job = edjob.getText().toString();
                description = eddescription.getText().toString();
                year = edyear.getText().toString();

                Intent intent = new Intent(experience.this,skill.class);
                finish();
                startActivity(intent);
            }
        });
    }
}