package com.danitakacs;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Dani", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " pont");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + "scored " + score + " pont");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player no score ");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        if ((feet > 0) || ((inch > 0) && inch < 12)) {
            double centimeters = feet * 12 * 2.54 + inch * 2.54;
            System.out.println(feet + " foot " + inch + " inches are " + centimeters + " centimeters.");
            return centimeters;
        } else System.out.println("Invalid input");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        if (inch >= 0) {
            double feet =  inch / 12;
            double remainingInches = (int) inch % 12;
            System.out.println(inch + "inches is equal to " + feet + " feet and " + remainingInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else return -1;
    }
}
