package com.danitakacs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        printConversion(95.25);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour * 0.621371);
    }


    public static void printConversion(double kilometersPerHour) {
        double milesPerHour = kilometersPerHour / 1.60934;

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + "km/h = " + Math.round(milesPerHour) + "mi/h");
        }
    }
}
