package com.example.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Experience extends BaseActivity {

    String company_name,job,description,year;
    EditText edcompanyName,edjob,eddescription,edyear;
    Button reset,next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        edcompanyName = findViewById(R.id.edcompanyName);
        edjob = findViewById(R.id.edjob);
        eddescription = findViewById(R.id.eddescription);
        edyear = findViewById(R.id.edyear);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(view -> {
            edcompanyName.setText("");
            edjob.setText("");
            eddescription.setText("");
            edyear.setText("");
        });

        next.setOnClickListener(view -> {
            company_name = edcompanyName.getText().toString();
            job = edjob.getText().toString();
            description = eddescription.getText().toString();
            year = edyear.getText().toString();

            if(company_name.isEmpty()){
                edcompanyName.setError("Enter Company name!");
            } else if (job.isEmpty()) {
                edjob.setError("Enter job");
            } else if (description.isEmpty()) {
                eddescription.setError("Enter Description");
            } else if (year.isEmpty()) {
                edyear.setError("Enter year");
            }else {
                intent();
            }

            editor.putString("cname",company_name);
            editor.putString("job",job);
            editor.putString("desc",description);
            editor.putString("yeare",year);
            editor.commit();

        });
    }
    private void intent(){
        Intent intent = new Intent(Experience.this, Skill.class);
        finish();
        startActivity(intent);
    }
}