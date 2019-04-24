package com.example.mp5;
import java.util.ArrayList;
import java.util.Random;

public class GameLogic {
    private int player1Points = 0;
    private String[] arrayOfPhrases = String[10];


    public void phraseInitialization() {
        arrayOfPhrases[0] = "red";
        arrayOfPhrases[1] = "orange";
        arrayOfPhrases[2] = "yellow";
        arrayOfPhrases[3] = "green";
        arrayOfPhrases[4] = "blue";
        arrayOfPhrases[5] = "indigo";
        arrayOfPhrases[6] = "violet";
        arrayOfPhrases[7] = "purple";
        arrayOfPhrases[8] = "pink";
        arrayOfPhrases[9] = "gray";
    }

    public int getRandomNumber() {
        double randomNumber = 10 * Math.random();
        int numberAsInt = (int) randomNumber;
        return numberAsInt;
    }

    public int setPlayer1Points() {
        int player1Points += 1;
    }

    public void getPlayer1Points() {
        return player1Points;
    }

}
