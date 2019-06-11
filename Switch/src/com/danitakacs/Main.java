package com.danitakacs;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//

        int switchValue = 5; //byte short char int String

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char newChar = 'A';


        switch (newChar) {
            case 'A':
                System.out.println("It was A");
                break;
            case 'B':
                System.out.println("It was B");
                break;
            case 'C':
                System.out.println("It was C");
                break;
            case 'D':
                System.out.println("It was D");
                break;
            case 'E':
                System.out.println("It was E");
                break;
            default:
                System.out.println("The character was not A, B, C, D or E");
                break;
        }

    }
}
