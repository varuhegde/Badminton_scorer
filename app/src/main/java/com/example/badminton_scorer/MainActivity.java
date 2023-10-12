package com.example.badminton_scorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



                Button nextButton = findViewById(R.id.button2);
                nextButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Create an Intent to start the next activity
                        Intent intent = new Intent(MainActivity.this, GameStart.class);
                        startActivity(intent);



            }
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView1);

        bottomNavigationView.setSelectedItemId(R.id.homeId);


        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.homeId) {
                // Code for handling the "homeId" case
            } else if (itemId == R.id.historyId) {
                startActivity(new Intent(getApplicationContext(), History.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
            } else if (itemId == R.id.settingId) {
                startActivity(new Intent(getApplicationContext(), Settings.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
            }
            return false;
        });

            }
}