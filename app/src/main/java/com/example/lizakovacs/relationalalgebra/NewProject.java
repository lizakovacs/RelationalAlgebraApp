package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;

// Buttons created to either go next onto the next activity or to go back into the previous activity

public class NewProject extends AppCompatActivity {

    // Declaration

    private Button backbtn2;
    private Button nextbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_project);

        // Initialization

        backbtn2 = (Button) findViewById(R.id.backbtn2);
        backbtn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewSelect();
            }
        });

        nextbtn3 = (Button) findViewById(R.id.nextbtn3);
        nextbtn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewUnion();
            }
        });
    }

    public void openNewSelect() {
        Intent intent = new Intent(this, NewSelect.class);
        startActivity(intent);

    }

    public void openNewUnion() {
        Intent intent = new Intent(this, NewUnion.class);
        startActivity(intent);
    }
}
