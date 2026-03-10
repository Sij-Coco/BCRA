package com.example.bcr;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FileComplaintActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_complaint);

        findViewById(R.id.btnBack).setOnClickListener(v -> finish());

        findViewById(R.id.btnSubmit).setOnClickListener(v -> {
            Toast.makeText(this, "Complaint Submitted to Unresolved List!", Toast.LENGTH_LONG).show();
            finish();
        });
    }
}