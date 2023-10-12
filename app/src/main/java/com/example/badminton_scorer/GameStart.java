package com.example.badminton_scorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
public class GameStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);

        ImageView imageView = findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the second activity
                Intent intent = new Intent(GameStart.this, MainActivity.class);
                startActivity(intent);
            }

        });
        Spinner gameSetSpinner = findViewById(R.id.spinner);

        // Create an ArrayAdapter using the string array resource
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.game_sets,
                android.R.layout.simple_spinner_item
        );

        // Set the dropdown layout style
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set the ArrayAdapter on the Spinner
        gameSetSpinner.setAdapter(adapter);

        // Set an item selection listener to handle user selection
        gameSetSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedGameSet = parent.getItemAtPosition(position).toString();
                Toast.makeText(GameStart.this, "Selected Game Set: " + selectedGameSet, Toast.LENGTH_SHORT).show();
            }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // Handle the case where nothing is selected (if needed)
                }
            });


        Spinner gamePointsSpinner = findViewById(R.id.spinner2);

        // Define the options for the Spinner
        String[] gamePointsOptions = {"15 points", "25 points"};

        // Create an ArrayAdapter for the Spinner
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gamePointsOptions);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set the ArrayAdapter for the Spinner
        gamePointsSpinner.setAdapter(adapter1);

        // Handle item selection
        gamePointsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedOption = gamePointsOptions[position];
                // You can use the selectedOption here, for example:
                int points = 15; // Default to 15 points
                if (selectedOption.equals("25 points")) {
                    points = 25;
                }
                // Use 'points' in your game logic.
                Toast.makeText(getApplicationContext(), "Selected: " + points + " points", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing here
            }
        });
            }

        }
