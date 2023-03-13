package com.example.resume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Template extends BaseActivity {

    ImageView temp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);

        temp1 = findViewById(R.id.temp1);

        temp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Template.this, T1.class);
                finish();
                startActivity(intent);
            }
        });
    }
}