package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



/**
 * Created by mathcore on 9/28/16.
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Submit Button Pushed";
    private Button submitButton;
    EditText userView;
    public static final String USER = "User";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userView = (EditText) findViewById(R.id.name_edit_text);
        submitButton = (Button) findViewById(R.id.submit_btn);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d(TAG,"User clicked submit");
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra(USER, userView.getText().toString());

                startActivity(intent);
            }
        });
    }


    public class EXTRA_MESSAGE {
    }
}
