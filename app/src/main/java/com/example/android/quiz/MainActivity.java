package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton q1a1;
    RadioButton q2a2;
    RadioButton yes;
    RadioButton answer_six;
    EditText user_input_three;
    CheckBox terminus;
    CheckBox marthasville;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * This method is called when the submit answers is clicked.
     */

    public void submitAnswers(View view) {
        int score = 0;
        String message = "";
        EditText playerName = findViewById(R.id.playerName);
        String player = playerName.getText().toString();
        EditText user_input_threeField = findViewById(R.id.user_input_three);
        String userinputthree = user_input_threeField.getText().toString();
        RadioButton q1a1 = findViewById(R.id.q1a1);
        boolean isq1a1 = q1a1.isChecked();
        RadioButton q2a2 = findViewById(R.id.q2a2);
        boolean isq2a2 = q2a2.isChecked();
        CheckBox terminusCheckbox = findViewById(R.id.terminus);
        boolean CheckboxTerminus = terminusCheckbox.isChecked();
        CheckBox marthasvilleCheckbox = findViewById(R.id.marthasville);
        boolean CheckboxMarthasville = marthasvilleCheckbox.isChecked();
        CheckBox zombielandCheckbox = findViewById(R.id.zombieland);
        boolean CheckboxZombieland = zombielandCheckbox.isChecked();
        CheckBox scarlettCheckbox = findViewById(R.id.scarlett);
        boolean CheckboxScarlett = scarlettCheckbox.isChecked();
        RadioButton yes = findViewById(R.id.Yes);
        boolean isyes = yes.isChecked();
        RadioButton answer_six = findViewById(R.id.answer_six);
        boolean isanswer_six = answer_six.isChecked();

        if (isq1a1) {
            score ++;

        }
        if (isq2a2) {
            score ++;

        }
        if (userinputthree.trim().equalsIgnoreCase("true")) {
            score ++;
        }
        if (CheckboxTerminus && CheckboxMarthasville && !CheckboxZombieland && !CheckboxScarlett) {
            score ++;
        }

        if (isyes) {
            score ++;
        }
        if (isanswer_six) {
            score ++;
        }


        //A toast to provide score to use


        if (score <= 3) {
            message = "Try Again";

        } else {
            message = player + ", You got " + score + " correct answers." + " Thank you for playing.";
        }
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
    }

    /**
     * Rests scores to 0
     */
    public void resetAnswers(View view) {


        RadioGroup radio1 = (RadioGroup) findViewById(R.id.radio1);
        radio1.clearCheck();
        RadioGroup radio2 = (RadioGroup) findViewById(R.id.radio2);
        radio2.clearCheck();
        RadioGroup radio3 = (RadioGroup) findViewById(R.id.radio3);
        radio3.clearCheck();
        RadioGroup radio4 = (RadioGroup) findViewById(R.id.radio4);
        radio4.clearCheck();

        CheckBox terminusA = findViewById(R.id.terminus);
        if (terminusA.isChecked()) {
            terminusA.setChecked(false);
        }

        CheckBox marthasvilleA = findViewById(R.id.marthasville);
        if (marthasvilleA.isChecked()) {
            marthasvilleA.setChecked(false);
        }
        CheckBox zombielandA = findViewById(R.id.zombieland);
        if (zombielandA.isChecked()) {
            zombielandA.setChecked(false);
        }
        CheckBox scarlettA = findViewById(R.id.scarlett);
        if (scarlettA.isChecked()) {
            scarlettA.setChecked(false);
        }

        EditText playerEditText = findViewById(R.id.playerName);
        playerEditText.getText().clear();

        EditText user_input_threeEditText = findViewById(R.id.user_input_three);
        user_input_threeEditText.getText().clear();
    }
}