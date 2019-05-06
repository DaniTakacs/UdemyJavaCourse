package com.danitakacs;

public class Main {

    public static void main(String[] args) {
        char myChar = '\u00A9'; //unicode-table.com/en
        System.out.println("Unicode output was: "+ myChar);

        boolean myBoolean = true;
        boolean isMale = true;

        char regSymb = '\u00AE';
        System.out.println("This is a registered symbol: " + regSymb);
    }
}
