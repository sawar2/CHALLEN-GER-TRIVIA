package com.example.mp5;
import java.util.ArrayList;
import java.util.Random;

public class GameLogic {
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




}
