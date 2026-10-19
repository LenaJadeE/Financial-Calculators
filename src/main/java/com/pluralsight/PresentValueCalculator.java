package com.pluralsight;

import java.util.Scanner;

public class PresentValueCalculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Annuity Present Value Calculator");
        System.out.println("Example: $2,195 per month, 5.00% return, 20 years");
        System.out.println("5.00% is the low end of thr rates top carriers paid on fixed annuities in 2026.");
        System.out.println("Enter numbers without commas.");
        System.out.println();

        System.out.print("Monthly payout ($): ");
        double monthlyPayout = scanner.nextDouble();

        System.out.print("Expected annual interest rate (e.g. 5.00): ");
        double annualRatePercent = scanner.nextDouble();

        System.out.print("Number of years the annuity pays out: ");
        double years = scanner.nextDouble();

        double presentValue = calculatePresentValue(monthlyPayout, annualRatePercent,years);

        System.out.println();
        System.out.printf("You would need to invest $%.2f today.%n", presentValue);

        scanner.close();
    }

    public static double calculatePresentValue(double monthlyPayout,double annualRatePercent, double years) {
        double monthlyRate = annualRatePercent / 100 /12;
        double numberOfPayments = years * 12;
        double presentValue;

        if (monthlyRate == 0) {
            presentValue = monthlyPayout * numberOfPayments;
        } else {
            presentValue = monthlyPayout * (1 - (1/ Math.pow(1+ monthlyRate, numberOfPayments))) / monthlyRate;
        }

        return presentValue;
    }
}


// Calculator 3: A calculator that determines the present value of an ordinary annuity.
// (Note: this is difficult)
// a. It would accept three values from the user: the monthly payout in dollars,
// the expected annual interest rate entered as a percent (for example,
// 2.5 and not 0.025), along with the number of years the annuity pays out.
// b. It would display the present value of that annuity
// Example: To fund an annuity that pays $3,000 monthly for 20 years and earns an expected 2.5% interest,
// you would need to invest $566,141.46 today.
// The number above assumes monthly compounding.


