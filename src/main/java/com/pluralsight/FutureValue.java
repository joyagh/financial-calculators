package com.pluralsight;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter deposit amount: ");
        double depositAmount = input.nextDouble();

        System.out.print("Choose interest rate: ");
        double interest = input.nextDouble()/ 100;

        System.out.print("Number of years: ");
        int years = input.nextInt();

        // FV = P × (1 + (r / 365))^(365 × t)


        double FV = depositAmount * Math.pow(1 + (interest/365),(365 * years));
        double earnedInterest = FV - depositAmount;


        System.out.printf("The future Value is $%.2f\n You have earned: $%.2f in interest",FV, earnedInterest);


    }

}
