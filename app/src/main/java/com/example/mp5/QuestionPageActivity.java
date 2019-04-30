package com.example.mp5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionPageActivity extends AppCompatActivity {
    public boolean isPlayer1 = true;
    private int player1Points = 0;
    private int player2Points = 0;

    //Random Number Generator
    public int getRandomNumber() {
        double randomNumber = 10 * Math.random();
        int numberAsInt = (int) randomNumber;
        return numberAsInt;
    }

    //Set the number of points for player 1
    public void setPlayer1Points(int points) {
        player1Points = points;
    }

    //Get the number of points for player 1
    public int getPlayer1Points() {
        return player2Points;
    }

    //Set the number of points for player 2
    public void setPlayer2Points(int points) {
        player2Points = points;
    }

    //Get the number of points for player 2
    public int getPlayer2Points() {
        return player2Points;
    }

    public String generateRandomPhrase() {
        String[] randomPhrases = new String[10];
        randomPhrases[0] = "recursive";
        randomPhrases[1] = "constructor";
        randomPhrases[2] = "inheritance";
        randomPhrases[3] = "polymorphism";
        randomPhrases[4] = "arraylist";
        randomPhrases[5] = "parameter";
        randomPhrases[6] = "boolean";
        randomPhrases[7] = "protected";
        randomPhrases[8] = "variable";
        randomPhrases[9] = "abstract";
        String[] hiddenPhrases = new String[10];
        hiddenPhrases[0] = "_______";
        hiddenPhrases[1] = "_________";
        hiddenPhrases[2] = "_________";
        hiddenPhrases[3] = "__________";
        hiddenPhrases[4] = "_______";
        hiddenPhrases[5] = "_______";
        hiddenPhrases[6] = "____";
        hiddenPhrases[7] = "_______";
        hiddenPhrases[8] = "______";
        hiddenPhrases[9] = "______";
        int x = (int) (Math.random()*((10)));
        String gamePhrase = hiddenPhrases[x];
        return gamePhrase;
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

        String questionLabel = randomQuestions[rng];
        String questionAPhrase = questionAOptions[rng];
        String questionBPhrase = questionBOptions[rng];
        String questionCPhrase = questionCOptions[rng];
        String questionDPhrase = questionDOptions[rng];


        TextView setQuestionLabel = (TextView) findViewById(R.id.questionLabel);
        setQuestionLabel.setText(questionLabel);

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
        setContentView(R.layout.questionpage);

        configureQuestionButtons();
    }

    public void configureQuestionButtons() {
        Button questionAButton = (Button) findViewById(R.id.questionAButton);
        questionAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuestionPageActivity.this, GamePageActivity.class));
            }
        });

        Button questionBButton = (Button) findViewById(R.id.questionBButton);
        questionBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayer1) {
                    isPlayer1 = false;
                } else {
                    isPlayer1 = true;
                }
            }
        });

        Button questionCButton = (Button) findViewById(R.id.questionCButton);
        questionCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayer1) {
                    isPlayer1 = false;
                } else {
                    isPlayer1 = true;
                }
            }
        });

        Button questionDButton = (Button) findViewById(R.id.questionDButton);
        questionDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayer1) {
                    isPlayer1 = false;
                } else {
                    isPlayer1 = true;
                }
            }
        });
    }
}
