package com.danitakacs;

public class Main {

    public static void main(String[] args) {
        getDurationString(120);
        getDurationString(80,40);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 || seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            String durationString = hours + "h " + remainingMinutes + "m " + seconds + "s";
            System.out.println(durationString);
            return durationString;
        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds/60;
            int remainingSeconds = seconds%60;
            getDurationString(minutes,remainingSeconds);
        }
        return "Invalid value";
    }
}
