package com.pluralsight;

public class TimeMachine {
    public static void main(String[] args) {
        int hours = 22;
        int minutes = 45;
        int minutesToAdd = 150;

        // Calculate the total number of minutes
        int totalMinutes = hours * 60 + minutes + minutesToAdd;

        // Calculate the new hour and minute
        int newHour = (totalMinutes / 60) % 24;
        int newMinute = totalMinutes % 60;

        // Print the result.
        System.out.println("| Starting time | Minutes to add | Expected time |\n" +
                "| ------------- | -------------: | ------------- |");
        System.out.println("| "+hours+":"+minutes+"         |             "+minutesToAdd+" | "+newHour+":"+newMinute+"         |");
    }
}
