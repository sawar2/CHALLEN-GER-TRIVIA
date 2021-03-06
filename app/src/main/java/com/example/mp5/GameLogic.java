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

    public String generateRandomPhrase() {
        String[] randomPhrases = new String[10];
        randomPhrases[0] = "inflammation";
        randomPhrases[1] = "edema";
        randomPhrases[2] = "cytokine";
        randomPhrases[3] = "macrophage";
        randomPhrases[4] = "lymphocyte";
        randomPhrases[5] = "autoimmune";
        randomPhrases[6] = "fibrosis";
        randomPhrases[7] = "eosinophil";
        randomPhrases[8] = "granuloma";
        randomPhrases[9] = "histamine";

        String[] hiddenPhrases = new String[10];

        hiddenPhrases[0] = "____________";
        hiddenPhrases[1] = "_____";
        hiddenPhrases[2] = "________";
        hiddenPhrases[3] = "__________";
        hiddenPhrases[4] = "__________";
        hiddenPhrases[5] = "__________";
        hiddenPhrases[6] = "________";
        hiddenPhrases[7] = "__________";
        hiddenPhrases[8] = "_________";
        hiddenPhrases[9] = "_________";

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

    }


}
