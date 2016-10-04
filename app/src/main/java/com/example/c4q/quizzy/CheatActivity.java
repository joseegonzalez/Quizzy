package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by mathcore on 10/3/16.
 */

public class CheatActivity extends QuizActivity {

    private Question currentQuestion;
    private Question[] copyOfQuestionBank;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Button button = (Button) findViewById(R.id.cheat);
        copyOfQuestionBank = super.questionBank;
        button.setVisibility(View.GONE);
        TextView questionTV = (TextView) findViewById(R.id.question_text_view);
        Intent intent;
        intent = getIntent();
//        String myQuestion = intent.getExtras().getString("Current Question");
//        boolean myAnswer = intent.getExtras().getBoolean("Current Answer");
        int myIndex = intent.getExtras().getInt("Current Index");
        currentQuestion = copyOfQuestionBank[myIndex];
        boolean answer = currentQuestion.isAnswerTrue();




        questionTV.setText(currentQuestion.getTextResId());
        questionTV.append(" " + answer);
    }
}
