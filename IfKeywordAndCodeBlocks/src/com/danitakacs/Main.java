package com.danitakacs;

public class Main {

    public static void main(String[] args) {

        int highscore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highscore);

        highscore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highscore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Dani", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Eru", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ilkay", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Edansyr", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Draelyth", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;

        } else {
            return -1;
        }

    }


    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

    }
    
}


