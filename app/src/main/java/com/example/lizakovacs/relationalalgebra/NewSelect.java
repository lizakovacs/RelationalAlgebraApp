package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

// Buttons created to either go next onto the next activity or to go back into the previous activity

public class NewSelect extends AppCompatActivity {

    // Declaration

    private Button backbtn;
    private Button nextbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_select);

        // Initialization

        backbtn = (Button) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheory();
            }
        });

        nextbtn2 = (Button) findViewById(R.id.nextbtn2);
        nextbtn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
              openNewProject();
            }
        });

    }

    public void openTheory() {
        Intent intent = new Intent(this, Theory.class);
        startActivity(intent);
    }

    public void openNewProject() {
        Intent intent = new Intent(this, NewProject.class);
        startActivity(intent);
    }
}
