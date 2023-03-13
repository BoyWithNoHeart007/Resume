package com.example.resume;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {


    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to exit back in main page??");
        builder.setTitle("Alert !");
        builder.setCancelable(false);

        AlertDialog.Builder builder1 = builder.setPositiveButton("Yes", (dialog, which) -> finish());
        builder.setNegativeButton("NO", (dialog, which) -> dialog.cancel());
        builder.setNeutralButton("Cancel", (dialog, which) -> dialog.cancel());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }

}
