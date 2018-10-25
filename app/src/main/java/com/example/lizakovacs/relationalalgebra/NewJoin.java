package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Buttons created to either go next onto the next activity or to go back into the previous activity

public class NewJoin extends AppCompatActivity {

    // Declaration

    private Button backbtn7;
    private Button quizbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_join);

        // Initialization

        backbtn7 = (Button) findViewById(R.id.backbtn7);
        backbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewProduct();
            }
        });

        quizbtn3 = (Button) findViewById(R.id.quizbtn3);
        quizbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz();
            }
        });

    }

    public void openNewProduct() {
        Intent intent = new Intent(this, NewProduct.class);
        startActivity(intent);

    }

    public void openQuiz() {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
}
