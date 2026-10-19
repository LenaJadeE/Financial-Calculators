package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CD Future Value Calculator");
        System.out.println("Example: $10,000 for 5 years at 3.6816%");
        System.out.println("That rate equals 3.75% APY with daily compounding, the 60 month CD.");
        System.out.println("Enter numbers without commas.");
        System.out.println();

        System.out.print(" Deposit amount ($): ");
        double deposit = scanner.nextDouble();

        System.out.print("Annual interest rate (e.g. 3.6816):");
        double annualRatePercentage = scanner.nextDouble();

        System.out.print("Number of years until maturity:");
        double years = scanner.nextDouble();

        double futureValue = calculateFutureValue(deposit, annualRatePercentage, years);
        double interestEarned = futureValue - deposit;

        System.out.println();
        System.out.printf("Ending balance: $%.2f%n", futureValue);
        System.out.printf("Interest earned: $%.2f%n", interestEarned);

        scanner.close();
    }

    public static double calculateFutureValue(double deposit, double annualRatePercentage, double years) {
        double daysPerYear = 365;
        deposit d


    }
}


// Calculator 2:
// A calculator that determines the future value of a one/time deposit assuming compound interest -
// it is used to help you decide how much a CD will be worth when it matures
// A. It would accept the deposit, annual interest rate as a percent (e.g. 7.625), and number of years from the user
// B. It would display the future value and the total interest earned
// Example: If you deposit $1,000 in a CD that earns 1.75% interest and matures in 5 years,
// your CD's ending balance will be $1,091.44 and you would have earned $91.44 in interest
// Note: The numbers above assume daily compounding
// FV = P × (1 + (r / d))^n
// Future Value (FV) = - - - - -
// Principal (P):
//      This is the initial deposit amount.
// Annual Interest Rate (r):
//      The nominal annual interest rate in decimal form.
//  (e.g., 1.75% = 0.0175).
// Divide the percent the user entered by 100 to get this
// Number of Years (t):
//      The total number of years the deposit will earn interest.
// Days Per Year (d):
//      Daily compounding assumes 365 days per year.
// Total Number of Days (n):
//      This is d × t (because there are 365 days per year).
// Total Interest Earned = FV - P