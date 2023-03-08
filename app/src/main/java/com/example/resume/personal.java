package com.example.resume;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class personal extends BaseActivity {

    String name, email, phon, address;
    EditText edtname, edtemail, edtphon, edtaddress;
    Button reset, next;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        edtname = findViewById(R.id.edtname);
        edtaddress = findViewById(R.id.edtaddress);
        edtemail = findViewById(R.id.edtemail);
        edtphon = findViewById(R.id.edtphon);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtname.setText("");
                edtemail.setText("");
                edtaddress.setText("");
                edtphon.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = edtname.getText().toString();
                address = edtaddress.getText().toString();
                email = edtemail.getText().toString();
                phon = edtphon.getText().toString();

                Intent intent = new Intent(personal.this,education.class);
                finish();
                startActivity(intent);
            }
        });
    }

}