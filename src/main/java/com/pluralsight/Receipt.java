package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String fruit = "Apple";
        float pricePerItem = 1.99f;
        int quantityOfItems = 5;

        System.out.println("Total price of " + fruit + " is $" + pricePerItem * quantityOfItems);
    }
}
