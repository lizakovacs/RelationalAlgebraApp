package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsQuiz extends AppCompatActivity {

    // Declaration

    private TextView mFinalScore;
    private Button retry;
    private Button homebtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_quiz);

        // Initialization

        mFinalScore = (TextView) findViewById(R.id.endscore);
        retry = (Button) findViewById(R.id.retry);
        homebtn2 = (Button) findViewById(R.id.homebtn2);

        // Score is retrieved from the last activity by creating a bundle object where we can set it to get intents and extras
        Bundle bundle = getIntent().getExtras();

        // Creating an integer variable named score then passing in the key that was created in the quiz activity
        int score = bundle.getInt("endScore");

        // Using concatentation we pass in the score variable to set our text method
       mFinalScore.setText("You scored " + score + " out of " + QuestionLibrary.mQuestions.length);

       // Listener created for the retry button so when clicked it returns to the beginning of the quiz
       retry.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(ResultsQuiz.this, Quiz.class));
           }
       });

        // Listener created for the home button so when clicked it returns to the hme activity
        homebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultsQuiz.this, Home.class));
            }
        });
    }
}
