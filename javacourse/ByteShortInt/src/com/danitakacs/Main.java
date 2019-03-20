package com.danitakacs;

public class Main {

    public static void main(String[] args) {

        // int width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);

        // byte width of 8
        byte myBiteValue = 127;
        byte myNewBiteValue = (byte) (myBiteValue / 2);

        // short width of 16
        short myShortValue = -32_768;
        short myNewShortValue = (short) (myShortValue / 2);

        // long width of 64
        long myLongValue = 9_223_372_036_854_775_807L;


        // CHALLENGE

        byte challengeByte = 1;
        short challengeShort = 2400;
        int challengeInt = 60000;
        long challengeLong = 5000L + 10L * (challengeByte + challengeShort + challengeInt);
        System.out.println(challengeLong);

    }


}
