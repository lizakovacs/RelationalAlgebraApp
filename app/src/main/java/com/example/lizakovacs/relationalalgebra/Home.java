package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

// Buttons created to link to other activities - 4 main buttons created in the home page including theory, summary, quiz and videos.

public class Home extends AppCompatActivity {

    // Declaration

    private Button TheoryBtn;
    private Button SummaryBtn;
    private Button QuizBtn;
    private Button VideosBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialization

        TheoryBtn = (Button) findViewById(R.id.TheoryBtn);
        TheoryBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
               openTheory();
            }
        });

        SummaryBtn = (Button) findViewById(R.id.SummaryBtn);
        SummaryBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openSummary();
            }
        });

        QuizBtn = (Button) findViewById(R.id.QuizBtn);
        QuizBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz();
            }
        });

        VideosBtn = (Button) findViewById(R.id.VideosBtn);
        VideosBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideos();
            }
        });

    }

    public void openTheory() {
        Intent intent = new Intent(this, Theory.class);
        startActivity(intent);
    }

    public void openSummary() {
        Intent intent = new Intent(this, Summary.class);
        startActivity(intent);
    }

    public void openQuiz() {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }

    public void openVideos() {
        Intent intent = new Intent(this, Videos.class);
        startActivity(intent);
    }
}
