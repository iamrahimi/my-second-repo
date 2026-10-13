package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // 1. Find the highest salary between Bob and Gary using Math.max()
        double bobSalary = 50000.00;
        double garySalary = 65000.00;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);


        // 2. Find and display the smallest of carPrice and truckPrice
        double carPrice = 25000.00;
        double truckPrice = 40000.00;
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is " + lowestPrice);


        // 3. Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double circleArea = Math.PI * radius * radius;

        System.out.println("The area of the circle is " + circleArea);


        // 4. Find and display the square root of a variable set to 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root is " + squareRoot);


        // 5. Find and display the distance between points (5, 10) and (85, 50)
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println("The distance between the points is " + distance);


        // 6. Find and display the absolute value of -3.8
        double negativeNumber = -3.8;
        double absoluteValue = Math.abs(negativeNumber);

        System.out.println("The absolute value is " + absoluteValue);


        // 7. Generate and display a random number between 0 and 1
        double randomNumber = Math.random();

        System.out.println("The random number is " + randomNumber);


        // 8. Calculate how many minutes are in 24 days
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;

        int totalMinutes = days * hoursPerDay * minutesPerHour;

        System.out.println("Minutes in 24 days: " + totalMinutes);


        // BONUS: Calculate how many milliseconds are in 24 days
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;

        long totalMilliseconds = (long) days * hoursPerDay
                * minutesPerHour * secondsPerMinute
                * millisecondsPerSecond;

        System.out.println("Milliseconds in 24 days: " + totalMilliseconds);
    }

}
