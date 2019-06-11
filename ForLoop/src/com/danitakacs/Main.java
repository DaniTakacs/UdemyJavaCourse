package com.danitakacs;

public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest is " + calculateInterest(10000, 2));


        for (int i = 2; i <= 8; i++) {
            System.out.println("10.000 at " + i + "% interest is " + String.format("%.2f", calculateInterest(10000, i)));
        }
    }


    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
