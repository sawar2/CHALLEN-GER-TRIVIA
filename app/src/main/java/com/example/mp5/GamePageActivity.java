package com.example.mp5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;

public class GamePageActivity extends AppCompatActivity {

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
        generateRandomPhrase();
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
                char[] currentArray = guessArray;
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
    }
}
