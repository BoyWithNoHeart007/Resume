package com.example.resume;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(() -> {

            finish();
            startActivity(new Intent(MainActivity.this, Homeactivity.class));

        },1000);
    }

}