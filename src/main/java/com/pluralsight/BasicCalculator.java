package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        char operation;
        System.out.println("Welcome to my calculator application!");
        System.out.println("Please enter your first number: ");
        Scanner input = new Scanner(System.in);
        firstNumber = input.nextDouble();
        System.out.println("Please enter your second number: ");
        secondNumber = input.nextDouble();

        System.out.println("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option: ");

        operation = input.next().charAt(0);

        System.out.println(firstNumber +" * " + secondNumber + " = " +  firstNumber * secondNumber);

    }
}
