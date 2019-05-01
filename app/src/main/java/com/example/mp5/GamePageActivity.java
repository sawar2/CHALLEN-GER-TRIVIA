package com.example.mp5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;

public class GamePageActivity extends AppCompatActivity {

    public boolean gameHasNotStarted = true;
    public int player1Points = 0;
    public int player2Points = 0;
    private String correctPhraseLabel;
    private String getPhraseLabel;
    public boolean isPlayer1 = true;

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

        String phraseLabel = hiddenPhrases[rng];
        getPhraseLabel = phraseLabel;
        correctPhraseLabel = randomPhrases[rng];

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

    public void configureLetterButtons() {
        final Button letterAButton = (Button) findViewById(R.id.letterA);
        letterAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'a';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });


        final Button letterBButton = (Button) findViewById(R.id.letterB);
        letterBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'b';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });


        final Button letterCButton = (Button) findViewById(R.id.letterC);
        letterCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'c';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterDButton = (Button) findViewById(R.id.letterD);
        letterDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'd';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterEButton = (Button) findViewById(R.id.letterE);
        letterEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'e';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterFButton = (Button) findViewById(R.id.letterF);
        letterFButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'f';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterGButton = (Button) findViewById(R.id.letterG);
        letterGButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'g';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterHButton = (Button) findViewById(R.id.letterH);
        letterHButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'h';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterIButton = (Button) findViewById(R.id.letterI);
        letterIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'i';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterJButton = (Button) findViewById(R.id.letterJ);
        letterJButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'j';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterKButton = (Button) findViewById(R.id.letterK);
        letterKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'k';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterLButton = (Button) findViewById(R.id.letterL);
        letterLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'l';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterMButton = (Button) findViewById(R.id.letterM);
        letterMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'm';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterNButton = (Button) findViewById(R.id.letterN);
        letterNButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'n';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });

        final Button letterOButton = (Button) findViewById(R.id.letterO);
        letterOButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char guessedChar = 'o';
                char[] correctArray = correctPhraseLabel.toCharArray();
                char[] guessArray = getPhraseLabel.toCharArray();
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
                    if (isPlayer1) {
                        isPlayer1 = false;
                    } else {
                        isPlayer1 = true;
                    }
                    startActivity(new Intent(GamePageActivity.this, QuestionPageActivity.class));
                } else {
                    if (isPlayer1) {
                        player1Points++;

                    } else {
                        player2Points++;
                    }
                }
            }
        });
    }
}
