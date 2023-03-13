package com.example.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Refrence extends BaseActivity {

    EditText comname,comlink;
    String coname,colink;
    Button reset,next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrence);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        comname = findViewById(R.id.comname);
        comlink = findViewById(R.id.comlink);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                comname.setText("");
                comlink.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                coname = comname.getText().toString();
                colink = comlink.getText().toString();

                editor.putString("coname",coname);
                editor.putString("colink",colink);
                editor.commit();


                Intent intent = new Intent(Refrence.this, Template.class);
                finish();
                startActivity(intent);
            }
        });
    }
}