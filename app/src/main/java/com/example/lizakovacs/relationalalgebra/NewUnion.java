package com.example.lizakovacs.relationalalgebra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewUnion extends AppCompatActivity {

    private Button backbtn3;
    private Button nextbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_union);

        backbtn3 = (Button) findViewById(R.id.backbtn3);
        backbtn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewProject();
            }
        });

        nextbtn4 = (Button) findViewById(R.id.nextbtn4);
        nextbtn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewSetDifference();
            }
        });

    }

    public void openNewProject() {
        Intent intent = new Intent(this, NewProject.class);
        startActivity(intent);

    }

    public void openNewSetDifference() {
        Intent intent = new Intent(this, NewSetDifference.class);
        startActivity(intent);
    }
}
