package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class refrence extends BaseActivity {

    EditText comname,comlink;
    String coname,colink;
    Button reset,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrence);

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


                Intent intent = new Intent(refrence.this,template.class);
                finish();
                startActivity(intent);
            }
        });
    }
}