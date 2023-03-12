package com.example.whowanttobemillionaire;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    RadioButton btn_one, btn_two, btn_three, btn_four;
    TextView tv_question,moneys;


    private final question question = new question();
    private String answer;
    public Integer counter =0;

    Random random;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();


        btn_one = findViewById(R.id.choice1);
        btn_one.setOnClickListener(this);
        btn_two = findViewById(R.id.choice2);
        btn_two.setOnClickListener(this);
        btn_three = findViewById(R.id.choice3);
        btn_three.setOnClickListener(this);
        btn_four = findViewById(R.id.choice4);
        btn_four.setOnClickListener(this);


        tv_question = findViewById(R.id.questiondisplay);
        moneys = findViewById(R.id.money);

        NextQuestion(counter);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    //get button id and answer,use if statement to check the answer correct or not
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.choice1:
                if(btn_one.getText() == answer){
                    Toast.makeText(MainActivity.this, "This is CORRECT answer,You earned: $"+question.getMoney(counter), Toast.LENGTH_SHORT).show();
                    NextQuestion(counter);
                    unchecked();
                }else{
                    GameOver();
                }

                break;

            case R.id.choice2:
                if(btn_two.getText() == answer){
                    Toast.makeText(MainActivity.this, "This is CORRECT answer,You earned: $"+question.getMoney(counter), Toast.LENGTH_SHORT).show();
                    NextQuestion(counter);
                    unchecked();
                }else{
                    GameOver();
                }

                break;

            case R.id.choice3:
                if(btn_three.getText() == answer){
                    Toast.makeText(MainActivity.this, "This is CORRECT answer,You earned: $"+question.getMoney(counter), Toast.LENGTH_SHORT).show();
                    NextQuestion(counter);
                    unchecked();
                }else{
                    GameOver();
                }

                break;

            case R.id.choice4:
                if(btn_four.getText() == answer){
                    Toast.makeText(MainActivity.this, "This is CORRECT answer,You earned: $"+question.getMoney(counter), Toast.LENGTH_SHORT).show();
                    NextQuestion(counter);
                    unchecked();
                }else{
                    GameOver();
                }

                break;
        }
    }
//function when user had wrong answer
    private void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alertDialogBuilder.show();

    }
//function to display next question
    private void NextQuestion(int num){
        tv_question.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice1(num));
        btn_two.setText(question.getchoice2(num));
        btn_three.setText(question.getchoice3(num));
        btn_four.setText(question.getchoice4(num));
        counter+=1;
        moneys.setText(question.getMoney(counter-1));
        answer = question.getCorrectAnswer(num);
//break the game and show winning information
        if (counter==11){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("CONGRATULATION!!! YOU ARE THE MILLIONAIRE")
                    .setCancelable(false)
                    .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        }
                    });
            alertDialogBuilder.show();

        }
    }
//uncheck the radio button
    public void unchecked()
    {
        btn_one.setChecked(false);
        btn_two.setChecked(false);
        btn_three.setChecked(false);
        btn_four.setChecked(false);
    }
}