package com.example.resume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class PersonalActivity extends BaseActivity {

    String name, email, phon, address;
    TextView texHobby;
    EditText edtname, edtemail, edtphon, edtaddress;
    CheckBox Coding,Hacking,Gaming,Reading;
    Button reset, next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;



    @SuppressLint({"MissingInflatedId", "WrongViewCast", "SetTextI18n"})
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

        reset.setOnClickListener(view -> {
            edtname.setText("");
            edtemail.setText("");
            edtaddress.setText("");
            edtphon.setText("");
        });

        next.setOnClickListener(view -> {

            name = edtname.getText().toString();
            address = edtaddress.getText().toString();
            email = edtemail.getText().toString();
            phon = edtphon.getText().toString();

            String Hobby = "";

            if (Coding.isChecked()) {
                Hobby += "Coding\n";
            }
            if (Hacking.isChecked()) {
                Hobby += "Hacking\n";
            }
            if (Gaming.isChecked()) {
                Hobby += "Gaming\n";
            }
            if (Reading.isChecked()) {
                Hobby += "Reading\n";
            }

            texHobby.setText("" + Hobby);

            if(name.isEmpty()){
                    edtname.setError("Enter name!");
            }
            else if(address.isEmpty()){

                    edtaddress.setError("Enter Address!");

            }

            else if (email.isEmpty()){
                edtemail.setError("Enter email!");
                }

            else if (!email.toLowerCase().contains("@gmail.com")) {

                edtemail.setError("Invalid Email!");

            }
            else if(( (edtphon.length() >10)) || (edtphon.length() <10)){

                edtphon.setError("Invalid Mobile Number!");
            }

                else if(Hobby.isEmpty()){

                texHobby.setError("Select hobby!");

            }else {

                intent();
            }

            editor.putString("name", name);
            editor.putString("address", address);
            editor.putString("email", email);
            editor.putString("phone", phon);
            editor.putString("hobby", Hobby);
            editor.commit();

        });
    }

    private void intent() {
        Intent intent = new Intent(PersonalActivity.this, Education.class);
        finish();
        startActivity(intent);
    }

}