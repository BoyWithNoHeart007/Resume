package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class workprofile extends BaseActivity {

    String git,link;
    EditText github,Linkedin;
    Button reset,next;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workprofile);

        github = findViewById(R.id.github);
        Linkedin = findViewById(R.id.Linkedin);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                github.setText("");
                Linkedin.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                git = github.getText().toString();
                link = Linkedin.getText().toString();

                Intent intent = new Intent(workprofile.this,objective.class);
                finish();
                startActivity(intent);
            }
        });

    }

}