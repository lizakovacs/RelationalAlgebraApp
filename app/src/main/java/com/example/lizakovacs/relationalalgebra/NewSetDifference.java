package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;

// Buttons created to either go next onto the next activity or to go back into the previous activity

public class NewSetDifference extends AppCompatActivity {

    // Declaration

    private Button backbtn4;
    private Button nextbtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_set_difference);

        // Initialization

        backbtn4 = (Button) findViewById(R.id.backbtn4);
        backbtn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewUnion();
            }
        });

        nextbtn5 = (Button) findViewById(R.id.nextbtn5);
        nextbtn5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewIntersection();
            }
        });

    }

    public void openNewUnion() {
        Intent intent = new Intent(this, NewUnion.class);
        startActivity(intent);

    }

    public void openNewIntersection() {
        Intent intent = new Intent(this, NewIntersection.class);
        startActivity(intent);
    }
}
