package com.example.resume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.resume.databinding.ActivityHomeactivityBinding;

public class Homeactivity extends BaseActivity {

        ActivityHomeactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeactivityBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.create.setOnClickListener(view1 -> {

            finish();
            Intent intent = new Intent(Homeactivity.this, PersonalActivity.class);
            startActivity(intent);


        });

        binding.exit.setOnClickListener(view12 -> finish());
    }

}