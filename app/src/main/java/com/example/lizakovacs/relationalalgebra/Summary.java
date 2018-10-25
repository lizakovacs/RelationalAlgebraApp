package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Buttons created to either back on the home page or directly to the quiz

public class Summary extends AppCompatActivity {

    // Declaration

    private Button homebtn3;
    private Button quizbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Initialization

        homebtn3 = (Button) findViewById(R.id.homebtn3);
        homebtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        quizbtn2 = (Button) findViewById(R.id.quizbtn2);
        quizbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz();
            }
        });

    }

    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);

    }

    public void openQuiz() {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
}
