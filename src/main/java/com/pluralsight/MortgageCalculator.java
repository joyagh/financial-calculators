package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       // ask user for principal amount

        System.out.print("Please enter principal amount: ");
        double principal = scan.nextDouble();


        System.out.print("Please enter interest rates: ");
        double intRate = scan.nextDouble();


        System.out.print("Please enter loan length: ");
        int loanLength = scan.nextInt();

        System.out.println(principal);
        System.out.println(intRate);
        System.out.println(loanLength);

    }

}
