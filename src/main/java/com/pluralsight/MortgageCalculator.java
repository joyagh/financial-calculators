package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       // ask user for principal amount

        System.out.println("Mortgage Calculator");
        System.out.println("Lets figure out your monthly payment and interest.");

        System.out.print("Please enter principal amount: ");
        double principal = scan.nextDouble();


        System.out.print("Please enter interest rates: ");
        double intRate = scan.nextDouble()/ 100;


        System.out.print("Please enter loan length: ");
        int loanLength = scan.nextInt();

        intRate /= 12;

        double numOfPayments = 12 * loanLength;

        System.out.println(principal);
        System.out.println(intRate);
        System.out.println(loanLength);

       // M = P × (i * (1 + i)^n / ( (1 + i)^n ) - 1)
        double monthlyPayment = principal * (intRate * Math.pow(1 + intRate, numOfPayments)) / (Math.pow(1 + intRate, numOfPayments) -1);

        System.out.println(monthlyPayment);

        double totalInterest = (monthlyPayment * numOfPayments) - principal;

        System.out.printf("$%.2f/month payment with a total after interest of $%.2f\n", monthlyPayment, totalInterest);

    }

}
