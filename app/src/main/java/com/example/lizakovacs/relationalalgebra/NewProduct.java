package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


// Buttons created to either go next onto the next activity or to go back into the previous activity

public class NewProduct extends AppCompatActivity {

    // Declaration

    private Button backbtn6;
    private Button nextbtn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product);

        // Initialization

        backbtn6 = (Button) findViewById(R.id.backbtn6);
        backbtn6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewIntersection();
            }
        });

        nextbtn7 = (Button) findViewById(R.id.nextbtn7);
        nextbtn7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewJoin();
            }
        });

    }

    public void openNewIntersection() {
        Intent intent = new Intent(this, NewIntersection.class);
        startActivity(intent);

    }

    public void openNewJoin() {
        Intent intent = new Intent(this, NewJoin.class);
        startActivity(intent);
    }
}
