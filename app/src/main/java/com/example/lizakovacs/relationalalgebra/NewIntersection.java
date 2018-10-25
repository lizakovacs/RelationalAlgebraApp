package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

// Buttons created to either go next onto the next activity or to go back into the previous activity

public class NewIntersection extends AppCompatActivity {

    // Declaration

    private Button backbtn5;
    private Button nextbtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_intersection);

        // Initialization

        backbtn5 = (Button) findViewById(R.id.backbtn5);
        backbtn5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewSetDifference();
            }
        });

        nextbtn6 = (Button) findViewById(R.id.nextbtn6);
        nextbtn6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewProduct();
            }
        });

    }

    public void openNewSetDifference() {
        Intent intent = new Intent(this, NewSetDifference.class);
        startActivity(intent);

    }

    public void openNewProduct() {
        Intent intent = new Intent(this, NewProduct.class);
        startActivity(intent);
    }
}
