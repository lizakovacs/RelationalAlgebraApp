package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

// Buttons created to either go next onto the next activity or go back home

public class Theory extends AppCompatActivity {

    // Declaration

    private Button homebtn;
    private Button nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);

        // Initialization

        homebtn = (Button) findViewById(R.id.homebtn);
        homebtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        nextbtn = (Button) findViewById(R.id.nextbtn);
        nextbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewSelect();
            }
        });


    }

    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openNewSelect() {
        Intent intent = new Intent(this, NewSelect.class);
        startActivity(intent);
}
}
