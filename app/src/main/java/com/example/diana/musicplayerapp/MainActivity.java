package com.example.diana.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView ArabicAlbum = (TextView) findViewById(R.id.Arabic);

        // Set a click listener on that View
        ArabicAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers cat"egory is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, ArabicAlbum.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        TextView EnglishAlbum = (TextView) findViewById(R.id.English);

        // Set a click listener on that View
        EnglishAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, EnglishAlbum.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });


    }
}
