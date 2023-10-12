package com.example.badminton_scorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView1);

        bottomNavigationView.setSelectedItemId(R.id.homeId);


        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
        if (itemId == R.id.homeId) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            finish();
        } else if (itemId == R.id.historyId) {
            startActivity(new Intent(getApplicationContext(), History.class));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            finish();
        } else if (itemId == R.id.settingId) {
            // Handle the settingId case
        }


            return false;
        });
    }
}