package com.example.resume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersonalActivity extends BaseActivity {

    String name, email, phon, address;
    TextView texHobby;
    EditText edtname, edtemail, edtphon, edtaddress,Coding,Hacking,Gaming,Reading;
    Button reset, next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;



    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        edtname = findViewById(R.id.edtname);
        edtaddress = findViewById(R.id.edtaddress);
        edtemail = findViewById(R.id.edtemail);
        edtphon = findViewById(R.id.edtphon);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);
        Coding = findViewById(R.id.Coding);
        Hacking = findViewById(R.id.Hacking);
        Gaming = findViewById(R.id.Gaming);
        Reading = findViewById(R.id.Reading);
        texHobby = findViewById(R.id.texHobby);

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

                String Hobby= "";

                if(Coding.isClickable()){
                    Hobby += "Coding/n";
                }
                if(Hacking.isClickable()){
                    Hobby += "Hacking/n";
                }
                if(Gaming.isClickable()){
                    Hobby += "Gaming/n";
                }
                if(Reading.isClickable()){
                    Hobby += "Reading/n";
                }

                texHobby.setText(""+Hobby);

                editor.putString("name",name);
                editor.putString("address",address);
                editor.putString("email",email);
                editor.putString("phone",phon);
                editor.putString("hobby",Hobby);
                editor.commit();

                Intent intent = new Intent(PersonalActivity.this,education.class);
                finish();
                startActivity(intent);
            }
        });
    }

}