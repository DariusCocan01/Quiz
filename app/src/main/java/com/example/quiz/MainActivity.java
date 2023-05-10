package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView question1, question2, question3, question4, mistakes;
    private RadioGroup answerGroup1, answerGroup2, answerGroup3, answerGroup4;
    private RadioButton answer1a, answer1b, answer1c, answer1d, answer2a, answer2b, answer2c, answer2d,
            answer3a, answer3b, answer3c, answer3d, answer4a, answer4b, answer4c, answer4d;
    private Button submitButton;
    private int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1 = findViewById(R.id.textView1);
        question2 = findViewById(R.id.textView4);

        question3 = findViewById(R.id.textView3);
        answerGroup1 = findViewById(R.id.answerGroup1);
        answerGroup2 = findViewById(R.id.answerGroup2);
        answerGroup3 = findViewById(R.id.answerGroup3);


        answer1a = findViewById(R.id.answer1a);
        answer1b = findViewById(R.id.answer1b);
        answer1c = findViewById(R.id.answer1c);
        answer1d = findViewById(R.id.answer1d);
        answer2a = findViewById(R.id.answer2a);
        answer2b = findViewById(R.id.answer2b);
        answer2c = findViewById(R.id.answer2c);
        answer2d = findViewById(R.id.answer2d);
        answer3a = findViewById(R.id.answer3a);
        answer3b = findViewById(R.id.answer3b);
        answer3c = findViewById(R.id.answer3c);
        answer3d = findViewById(R.id.answer3d);

        mistakes = findViewById(R.id.textView);

        submitButton = findViewById(R.id.button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check answer for question 1
                int selectedId1 = answerGroup1.getCheckedRadioButtonId();
                if (selectedId1 == answer1b.getId()) {
                    score++;
                }else{
                    mistakes.setText(mistakes.getText().toString()+"The capital of France is Paris\n");
                }

                // Check answer for question 2
                int selectedId2 = answerGroup2.getCheckedRadioButtonId();
                if (selectedId2 == answer2a.getId()) {
                    score++;
                }else{
                    mistakes.setText(mistakes.getText().toString()+"The capital of Italy is Rome\n");
                }

                // Check answer for question 3
                int selectedId3 = answerGroup3.getCheckedRadioButtonId();
                if (selectedId3 == answer3c.getId()) {
                    score++;
                }
                else{
                    mistakes.setText(mistakes.getText().toString()+"The capital of Spain is Madrid\n");
                }




                // Display result in toast
                Toast.makeText(MainActivity.this, "Your score is: " + score + "/3", Toast.LENGTH_SHORT).show();

                // Reset score
                score = 0;
            }
        });
    }
}