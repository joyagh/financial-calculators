package com.pluralsight;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter deposit amount: ");
        double depositAmount = input.nextDouble();

        System.out.print("Choose interest rate: ");
        double interest = input.nextDouble();

        System.out.print("Number of years: ");
        int year = input.nextInt();
    }
}
