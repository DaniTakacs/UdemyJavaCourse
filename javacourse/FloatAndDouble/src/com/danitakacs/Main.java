package com.danitakacs;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5 / 3; //4 bytes
        float myFloatValue = 5f / 3f; // 4 bytes, 8 decimals
        double myDoubleValue = 5d / 3d; // 8 bytes, faster on many computers, more precise, inbuilt functions mostly use this, 16 decimals

        System.out.println("myintvalue = " + myIntValue);
        System.out.println("myfloatvalue = " + myFloatValue);
        System.out.println("mydoutlbevalue = " + myDoubleValue);

        // Convert pounds to kg

        double numOfPounds = 200d;
        double numOfKg = numOfPounds * 0.45359237d;
        System.out.println(numOfPounds + " pounds is " + numOfKg + " kilograms ");
    }
}
