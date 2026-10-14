package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        System.out.println("Payroll Calculator");
        String employeeName;
        float employeeHoursWorked;
        float payRatePerHour;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        employeeName = input.nextLine();
        System.out.println("Enter your hours worked: ");
        employeeHoursWorked = input.nextFloat();
        System.out.println("Enter your pay rate per hour: ");
        payRatePerHour = input.nextFloat();
        System.out.println("Payroll ("+employeeName+") total gross pay: " +  employeeHoursWorked + "Hours * " + payRatePerHour + "$ = " + (employeeHoursWorked * payRatePerHour) + "$" );
    }
}
