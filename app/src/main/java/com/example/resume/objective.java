package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class objective extends BaseActivity {

    EditText objective;
    Button next,reset;
    String obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objective);

        objective = findViewById(R.id.objective);
        next = findViewById(R.id.next);
        reset = findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                objective.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                obj = objective.getText().toString();

                Intent intent = new Intent(objective.this,refrence.class);
                finish();
                startActivity(intent);
            }
        });
    }
}