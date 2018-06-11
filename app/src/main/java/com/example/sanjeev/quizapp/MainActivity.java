package com.example.sanjeev.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText answerView1, answerView2;
    RadioButton[] optionRadioButtons;
    int[] optionRadioButtonIDs = {R.id.option1_question3, R.id.option2_question3, R.id.option3_question3, R.id.option4_question3,
            R.id.option1_question4, R.id.option2_question4, R.id.option3_question4, R.id.option4_question4,
            R.id.option1_question5, R.id.option2_question5, R.id.option3_question5, R.id.option4_question5,
            R.id.option1_question6, R.id.option2_question6, R.id.option3_question6, R.id.option4_question6};
    CheckBox[] optionCheckBoxes;
    int[] optionCheckBoxesIDs = {R.id.option1_question7, R.id.option2_question7, R.id.option3_question7, R.id.option4_question7,
            R.id.option1_question8, R.id.option2_question8, R.id.option3_question8, R.id.option4_question8,
            R.id.option1_question9, R.id.option2_question9, R.id.option3_question9, R.id.option4_question9,
            R.id.option1_question0, R.id.option2_question0, R.id.option3_question0, R.id.option4_question0};
    int totalScore;                 // Total Score of the Quiz
    String quizCompleteMessage;     // Custom Toast message to be displayed after completing the quiz
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Binding Views with Variables
        answerView1 = findViewById(R.id.answer1);
        answerView2 = findViewById(R.id.answer2);
        submit = findViewById(R.id.submitButton);

        optionRadioButtons = new RadioButton[16];
        for (int i = 0; i < 16; i++)
            optionRadioButtons[i] = findViewById(optionRadioButtonIDs[i]);

        optionCheckBoxes = new CheckBox[16];
        for (int i = 0; i < 16; i++)
            optionCheckBoxes[i] = findViewById(optionCheckBoxesIDs[i]);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        totalScore = 0;
        /*
         * Question Number => 1
         * OS computer abbreviation usually means ?
         *
         * Answer
         * Operating System
         */
        if (answerView1.getText().toString().toLowerCase().equals("operating system"))
            totalScore += 1;
        /*
         * Question Number => 2
         * What does CPU stand for ?
         *
         * Answer
         * Central Processing Unit
         */
        if (answerView2.getText().toString().toLowerCase().equals("central processing unit"))
            totalScore += 1;
        /*
         * Question Number => 3
         * Which device can be used to store charge ?
         *
         * Answer
         * Capacitor (Option Number 3)
         */
        if (optionRadioButtons[2].isChecked())
            totalScore += 1;
        /*
         * Question Number => 4
         * Modem stands for
         *
         * Answer
         * Modulator Demodulator (Option Number 1)
         */
        if (optionRadioButtons[4].isChecked())
            totalScore += 1;
        /*
         * Question Number => 5
         * In digital circuit, what is 1 AND 1 ?
         *
         * Answer
         * 1 (Option Number 2)
         */
        if (optionRadioButtons[9].isChecked())
            totalScore += 1;
        /*
         * Question Number => 6
         * A computer on network that requests file from another computer ?
         *
         * Answer
         * Client (Option Number => 3)
         */
        if (optionRadioButtons[14].isChecked())
            totalScore += 1;
        /*
         * Question Number => 7
         * Which of the following is/are Mobile Companies ?
         *
         * Answer
         * Option 1 and 3
         */
        if (optionCheckBoxes[0].isChecked()
                && !optionCheckBoxes[1].isChecked()
                && optionCheckBoxes[2].isChecked()
                && !optionCheckBoxes[3].isChecked())
            totalScore += 1;
        /*
         * Question Number => 8
         * Which of the following is/are Google product/s ?
         *
         * Answer
         * Option 1 and 2
         */
        if (optionCheckBoxes[4].isChecked()
                && optionCheckBoxes[5].isChecked()
                && !optionCheckBoxes[6].isChecked()
                && !optionCheckBoxes[7].isChecked())
            totalScore += 1;
        /*
         * Question Number => 9
         * Which of the following metal/s is/are not ductile ?
         *
         * Answer
         * Option Number 2 and 4
         */
        if (!optionCheckBoxes[8].isChecked()
                && optionCheckBoxes[9].isChecked()
                && !optionCheckBoxes[10].isChecked()
                && optionCheckBoxes[11].isChecked())
            totalScore += 1;
        /*
         * Question Number => 10
         * Which of the following is/are not a part of Internet ?
         *
         * Answer
         * Option Number 2 and 3
         */
        if (!optionCheckBoxes[12].isChecked()
                && optionCheckBoxes[13].isChecked()
                && optionCheckBoxes[14].isChecked()
                && !optionCheckBoxes[15].isChecked())
            totalScore += 1;

        if (totalScore == 10)
            quizCompleteMessage = "Perfect ! Your Score is 10/10";
        else if (totalScore < 10 && totalScore > 5)
            quizCompleteMessage = "You are close ! Your Score is " + totalScore + "/10";
        else
            quizCompleteMessage = "Never Give Up ! Your Score is " + totalScore + "/10";

        Toast.makeText(this, quizCompleteMessage, Toast.LENGTH_LONG).show();
    }
}
