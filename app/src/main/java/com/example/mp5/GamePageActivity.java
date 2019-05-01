package com.example.mp5;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;

public class GamePageActivity extends MainActivity {

    public boolean gameHasNotStarted = true;
    public Integer player1Points = 0;
    public Integer player2Points = 0;
    private String correctPhraseLabel;
    private String getPhraseLabel;
    private char[] correctArray;
    private char[] guessArray;

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

    public void generateRandomPhrase() {
        int rng = getRandomNumber();

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

        hiddenPhrases[0] = "_________";
        hiddenPhrases[1] = "___________";
        hiddenPhrases[2] = "___________";
        hiddenPhrases[3] = "____________";
        hiddenPhrases[4] = "_________";
        hiddenPhrases[5] = "_________";
        hiddenPhrases[6] = "_______";
        hiddenPhrases[7] = "_________";
        hiddenPhrases[8] = "________";
        hiddenPhrases[9] = "________";

        String phraseLabel = hiddenPhrases[rng];
        getPhraseLabel = phraseLabel;
        correctPhraseLabel = randomPhrases[rng];
        correctArray = correctPhraseLabel.toCharArray();
        guessArray = getPhraseLabel.toCharArray();

        TextView setPhraseLabel = (TextView) findViewById(R.id.phraseLabel);
        setPhraseLabel.setText(phraseLabel);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamepage);
        if (gameHasNotStarted) {
            generateRandomPhrase();
            gameHasNotStarted = false;
        }

        configureLetterButtons();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        gameHasNotStarted = false;

    }

    public void configureLetterButtons() {
        final Button letterAButton = (Button) findViewById(R.id.letterA);
        final MediaPlayer wrong = MediaPlayer.create(this, R.raw.wrong);
        final MediaPlayer right = MediaPlayer.create(this, R.raw.right);
        letterAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'a';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterAButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }

                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });


        final Button letterBButton = (Button) findViewById(R.id.letterB);
        letterBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'b';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterBButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }

                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });


        final Button letterCButton = (Button) findViewById(R.id.letterC);
        letterCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'c';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterCButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterDButton = (Button) findViewById(R.id.letterD);
        letterDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'd';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterDButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterEButton = (Button) findViewById(R.id.letterE);
        letterEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'e';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterEButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterFButton = (Button) findViewById(R.id.letterF);
        letterFButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'f';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterFButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterGButton = (Button) findViewById(R.id.letterG);
        letterGButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'g';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterGButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterHButton = (Button) findViewById(R.id.letterH);
        letterHButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'h';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterHButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterIButton = (Button) findViewById(R.id.letterI);
        letterIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'i';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterIButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterJButton = (Button) findViewById(R.id.letterJ);
        letterJButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'j';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterJButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    if (getPlayer1()) {
                        wrong.start();
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterKButton = (Button) findViewById(R.id.letterK);
        letterKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'k';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterKButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterLButton = (Button) findViewById(R.id.letterL);
        letterLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'l';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterLButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterMButton = (Button) findViewById(R.id.letterM);
        letterMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'm';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterMButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterNButton = (Button) findViewById(R.id.letterN);
        letterNButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'n';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterNButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterOButton = (Button) findViewById(R.id.letterO);
        letterOButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'o';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterOButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterPButton = (Button) findViewById(R.id.letterP);
        letterPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'p';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterPButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterQButton = (Button) findViewById(R.id.letterQ);
        letterQButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'q';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterQButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterRButton = (Button) findViewById(R.id.letterR);
        letterRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'r';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterRButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterSButton = (Button) findViewById(R.id.letterS);
        letterSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 's';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterSButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterTButton = (Button) findViewById(R.id.letterT);
        letterTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 't';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterTButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterUButton = (Button) findViewById(R.id.letterU);
        letterUButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'u';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterUButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterVButton = (Button) findViewById(R.id.letterV);
        letterVButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'v';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterVButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterWButton = (Button) findViewById(R.id.letterW);
        letterWButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'w';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterWButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterXButton = (Button) findViewById(R.id.letterX);
        letterXButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'x';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterXButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterYButton = (Button) findViewById(R.id.letterY);
        letterYButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'y';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterYButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });

        final Button letterZButton = (Button) findViewById(R.id.letterZ);
        letterZButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'z';
                char[] currentArray = new char[guessArray.length];
                currentArray = Arrays.copyOf(guessArray, guessArray.length);
                for (int i = 0; i < correctArray.length; i++) {
                    if (guessedChar == correctArray[i]) {
                        guessArray[i] = correctArray[i];
                    }
                }
                String newHiddenPhrase = new String(guessArray);
                TextView setPhraseLabelAfterClick = (TextView) findViewById(R.id.phraseLabel);
                setPhraseLabelAfterClick.setText(newHiddenPhrase);
                letterZButton.setVisibility(View.GONE);
                if (Arrays.equals(guessArray, currentArray)) {
                    wrong.start();
                    if (getPlayer1()) {
                        setPlayer1(false);
                    } else {
                        setPlayer1(true);
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    right.start();
                    if (getPlayer1()) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
                if (Arrays.equals(guessArray, correctArray)) {
                    startActivity(new Intent(GamePageActivity.this, WinPageActivity.class));
                }
            }
        });
    }
}
