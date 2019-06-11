package com.danitakacs;

public class Main {

    public static void main(String[] args) {

        int sumOfNums = 0;
        int numOfNums = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numOfNums += 1;

                if (numOfNums <= 5) {
                    System.out.println(i);
                    sumOfNums = sumOfNums + i;


                }

            }

        }
        System.out.println("The summ is " + sumOfNums);

    }
}