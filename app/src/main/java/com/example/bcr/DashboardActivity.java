package com.example.bcr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Animation: Pop up slowly
        View welcomeView = findViewById(R.id.llWelcome);
        welcomeView.animate()
                .alpha(1f)
                .setDuration(2000)
                .start();

        // Reconnected buttons to actually open the new screens
        findViewById(R.id.btnFileComplaint).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, FileComplaintActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnViewComplaints).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ViewComplaintsActivity.class);
                startActivity(intent);
            }
        });
    }
}