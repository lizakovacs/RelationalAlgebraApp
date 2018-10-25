package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// This class contains the logic for the quiz

public class Quiz extends AppCompatActivity {

    private QuestionLibrary QuestionBook = new QuestionLibrary();

    // Declaration

    private TextView ScoreView;
    private TextView QuestionView;
    private Button ButtonAnswer1;
    private Button ButtonAnswer2;
    private Button ButtonAnswer3;
    private Button ButtonAnswer4;
    private Button quitbtn;

    private String Answer;

    // Score and QuestionNumber declared and initialized setting the integers to 0

    private int Score = 0;
    private int QuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Initialization

        ScoreView = (TextView) findViewById(R.id.score);
        QuestionView =(TextView) findViewById(R.id.question);
        ButtonAnswer1 = (Button) findViewById(R.id.choice1);
        ButtonAnswer2 = (Button) findViewById(R.id.choice2);
        ButtonAnswer3 = (Button) findViewById(R.id.choice3);
        ButtonAnswer4 = (Button) findViewById(R.id.choice4);
        quitbtn = (Button) findViewById(R.id.quitbtn);

        // Question updated to the first one in the question library so the default one is not shown

        updateQuestion();

        // Listener created to handle the clicks when the buttons are pressed - applies to all buttons as shown below

        ButtonAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // If the text equals the answer then the score is updated by + 1 - applies to all buttons as shown below

                if (ButtonAnswer1.getText() == Answer) {
                    Score++;
                    updateScore(Score);

                    // Perform a check before question is updated otherwise the app crashes - applies to all buttons as shown below
                    // If statement determines if we are on the last question and if we are then start the results activity class

                    if (QuestionNumber == QuestionLibrary.mQuestions.length) {

                        // Score is passed to the next activity using intents and bundles
                        Intent i = new Intent(Quiz.this, ResultsQuiz.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("endScore", Score);
                        i.putExtras(bundle);

                        // Current Acitivity closes
                        Quiz.this.finish();

                        // New Activity started
                        startActivity(i);
                    } else {

                        // If it is not the last question then a new question is updated by calling the updateQuestion method
                        updateQuestion();
                    }
                } else {

                    // If the answer is wrong the same check needs to be performed to check if we are on the last question
                    if (QuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(Quiz.this, ResultsQuiz.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("endScore", Score);
                        i.putExtras(bundle);
                        Quiz.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
            });

        ButtonAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (ButtonAnswer2.getText() == Answer){
                    Score++;
                    updateScore(Score);

                    //Perform check before you update the question
                    if (QuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(Quiz.this, ResultsQuiz.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("endScore", Score);
                        i.putExtras(bundle);
                        Quiz.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                } else {
                    if (QuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(Quiz.this, ResultsQuiz.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("endScore", Score);
                        i.putExtras(bundle);
                        Quiz.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

        ButtonAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (ButtonAnswer3.getText() == Answer){
                    Score++;
                    updateScore(Score);

                    if (QuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(Quiz.this, ResultsQuiz.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("endScore", Score);
                        i.putExtras(bundle);
                        Quiz.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                } else {
                    if (QuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(Quiz.this, ResultsQuiz.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("endScore", Score);
                        i.putExtras(bundle);
                        Quiz.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

        ButtonAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ButtonAnswer4.getText() == Answer) {
                    Score++;
                    updateScore(Score);

                    if (QuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(Quiz.this, ResultsQuiz.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("endScore", Score);
                        i.putExtras(bundle);
                        Quiz.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                } else {
                    if (QuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(Quiz.this, ResultsQuiz.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("endScore", Score);
                        i.putExtras(bundle);
                        Quiz.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

        // Listener created for the quit button so that when clicked it directs back to the home screen

        quitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quiz.this, Home.class));
            }
        });
    }


// Method created to update the question once its called

    private void updateQuestion(){
        QuestionView.setText(QuestionBook.getQuestion(QuestionNumber));
        ButtonAnswer1.setText(QuestionBook.getChoice1(QuestionNumber));
        ButtonAnswer2.setText(QuestionBook.getChoice2(QuestionNumber));
        ButtonAnswer3.setText(QuestionBook.getChoice3(QuestionNumber));
        ButtonAnswer4.setText(QuestionBook.getChoice4(QuestionNumber));

        Answer = QuestionBook.getCorrectAnswer(QuestionNumber);
        QuestionNumber++;
    }

// Method created to update the score once its called

    private void updateScore(int point){
        ScoreView.setText("" + Score);
    }

}
