package com.danitakacs;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        result = 4;

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println(result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result -= 10;
        System.out.println(result);
        result /= 10;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien != true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCrar = false;
        if (isCrar)
            System.out.println("This is not supposed to be happening");

        isCrar = true;
        boolean wasCar = isCrar ? true : false;
        if (wasCar) ;
        System.out.println("wasCar is true");

        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html


        double myDouble = 20d;
        double mySecondDouble = 80d;
        double newNum = (myDouble + mySecondDouble) * 25;
        double myRemainder = newNum % 40;

        if (myRemainder <=20)
            System.out.println("Total was over the limit");

        System.out.println("remainder is " + myRemainder);

        // http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html 
    }
}
