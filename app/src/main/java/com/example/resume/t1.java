package com.example.resume;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class t1 extends BaseActivity {

    SharedPreferences preferences;
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1);

        preferences = getSharedPreferences("Data",0);

        txtName = findViewById(R.id.name);

        String n1 = preferences.getString("name","");

        txtName.setText(n1);

    }
}