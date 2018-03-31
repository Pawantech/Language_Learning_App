package com.example.android.miwok;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
// Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
                startActivity(numbersIntent);
            }
        });
        // Find the View that shows the colors category
        TextView color = (TextView) findViewById(R.id.colors);
// Set a click listener on that View
        color.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Colors.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        TextView familyClick = (TextView) findViewById(R.id.family);
// Set a click listener on that View
        familyClick.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Family.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phraseClick = (TextView) findViewById(R.id.phrases);
// Set a click listener on that View
        phraseClick.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,Phrases.class);
                startActivity(numbersIntent);
            }
        });
    }

}
