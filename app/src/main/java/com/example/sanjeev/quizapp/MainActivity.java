package com.example.sanjeev.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView question_view;
    Button submit_button, next_question;
    RadioGroup options_group;
    RadioButton option1, option2, option3, option4;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
        question_view = findViewById(R.id.question_view);
        submit_button = findViewById(R.id.calculate_score);
        next_question = findViewById(R.id.next_question);
        options_group = findViewById(R.id.options_view);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        submit_button.setOnClickListener(this);
        next_question.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == submit_button){
            Toast.makeText(this, "Your Quiz Score is " + String.valueOf(score), Toast.LENGTH_LONG).show();
        }
        else{
            //Toast.makeText(this, "Your Quiz Score is " + String.valueOf(score), Toast.LENGTH_LONG).show();
            // Update View

        }
    }
}
