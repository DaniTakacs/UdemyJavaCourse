package com.danitakacs;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("*****************");

        count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("*****************");

        count = 1;          //allways executes at least once
        do {
            System.out.println("Cout value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 5);


        System.out.println("*****************");

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            if (evenNumbers >= 5) {
                break;
            }
            evenNumbers++;
            System.out.println("Even number " + number);
        }
        System.out.println(evenNumbers + " even numbers found.");

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
