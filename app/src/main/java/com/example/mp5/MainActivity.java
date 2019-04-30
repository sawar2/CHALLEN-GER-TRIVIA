package com.example.mp5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int getRandomNumber() {
        double randomNumber = 10 * Math.random();
        int numberAsInt = (int) randomNumber;
        return numberAsInt;
    }

    public void generateRandomQuestion() {
        int rng = getRandomNumber();

        String[] randomQuestions = new String[10];
        randomQuestions[0] = "Who does Geoffrey Challen look like?";
        randomQuestions[1] = "How many people can get an A in CS125?";
        randomQuestions[2] = "What is the IDE that is used in CS125?";
        randomQuestions[3] = "Which of these is an implementation of a list?";
        randomQuestions[4] = "What is the difference between type int and type Integer?";
        randomQuestions[5] = "How many bits are assigned to hold an int?";
        randomQuestions[6] = "Which of these is true of objects";
        randomQuestions[7] = "Which of these is NOT a sorting algorithm";
        randomQuestions[8] = "What is the function of a getter?";
        randomQuestions[9] = "What is the function of a setter";


        String[] questionAOptions = new String[10];

        questionAOptions[0] = "Caillou";
        questionAOptions[1] = "An unlimited number";
        questionAOptions[2] = "Android Studio";
        questionAOptions[3] = "ArrayList";
        questionAOptions[4] = "Integer is an object while int is not";
        questionAOptions[5] = "32";
        questionAOptions[6] = "You can model real world things by storing state and behavior together";
        questionAOptions[7] = "ChallenSort";
        questionAOptions[8] = "Returning a particular value for a variable";
        questionAOptions[9] = "Setting a variable to a particular value";

        String[] questionBOptions = new String[10];

        questionBOptions[0] = "Arthur";
        questionBOptions[1] = "0";
        questionBOptions[2] = "NetBeans";
        questionBOptions[3] = "ChallenList";
        questionBOptions[4] = "Integer can be cast to a String while int cannot";
        questionBOptions[5] = "0";
        questionBOptions[6] = "Objects require less data";
        questionBOptions[7] = "BubbleSort";
        questionBOptions[8] = "Setting a variable to a particular value";
        questionBOptions[9] = "Returning a variable for a particular value";

        String[] questionCOptions = new String[10];

        questionCOptions[0] = "Spongebob";
        questionCOptions[1] = "50%";
        questionCOptions[2] = "XCode";
        questionCOptions[3] = "IllinoisList";
        questionCOptions[4] = "int can have methods called on it";
        questionCOptions[5] = "64";
        questionCOptions[6] = "Objects do not require the 'new' keyword";
        questionCOptions[7] = "MergeSort";
        questionCOptions[8] = "Multiplying two integers together";
        questionCOptions[9] = "Adding two integers together";

        String[] questionDOptions = new String[10];

        questionDOptions[0] = "Sofia the First";
        questionDOptions[1] = "25%";
        questionDOptions[2] = "Geoff Studio";
        questionDOptions[3] = "TabList";
        questionDOptions[4] = "Integer is a primitive type and int is not";
        questionDOptions[5] = "16";
        questionDOptions[6] = "Objects are the only way to build useful things";
        questionDOptions[7] = "QuickSort";
        questionDOptions[8] = "Searching through a graph";
        questionDOptions[9] = "Recursively searching a tree";

        String questionAPhrase = questionAOptions[rng];
        String questionBPhrase = questionBOptions[rng];
        String questionCPhrase = questionCOptions[rng];
        String questionDPhrase = questionDOptions[rng];

        TextView setQuestionA = (TextView) findViewById(R.id.questionAButton);
        setQuestionA.setText(questionAPhrase);

        TextView setQuestionB = (TextView) findViewById(R.id.questionBButton);
        setQuestionB.setText(questionBPhrase);

        TextView setQuestionC = (TextView) findViewById(R.id.questionCButton);
        setQuestionC.setText(questionCPhrase);

        TextView setQuestionD = (TextView) findViewById(R.id.questionDButton);
        setQuestionD.setText(questionDPhrase);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);

        configureStartButton();
    }

    public void configureStartButton() {
        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QuestionPageActivity.class));
                generateRandomQuestion();
            }
        });
    }
}
