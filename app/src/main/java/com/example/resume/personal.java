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

public class personal extends AppCompatActivity {

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

                Intent intent = new Intent();
                intent.putExtra("name",name);
                intent.putExtra("address",address);
                intent.putExtra("email",email);
                intent.putExtra("phon",phon);
            }
        });
    }


    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(personal.this);
        builder.setMessage("Do you want to exit back in home page?");
        builder.setTitle("Alert !");
        builder.setCancelable(false);
        AlertDialog.Builder builder1 = builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
            Toast.makeText(personal.this, "yes clicked", Toast.LENGTH_SHORT).show();
            finish();
        });
        builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
            Toast.makeText(personal.this, "No clicked", Toast.LENGTH_SHORT).show();
            dialog.cancel();
        });
        builder.setNeutralButton("cancel", (DialogInterface.OnClickListener) (dialog, which) -> {
            Toast.makeText(personal.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
            dialog.cancel();
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}