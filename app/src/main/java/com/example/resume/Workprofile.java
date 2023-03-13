package com.example.resume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Workprofile extends BaseActivity {

    String git,link;
    EditText github,Linkedin;
    Button reset,next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workprofile);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

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

                editor.putString("git",git);
                editor.putString("link",link);
                editor.commit();

                Intent intent = new Intent(Workprofile.this, Objective.class);
                finish();
                startActivity(intent);
            }
        });

    }

}