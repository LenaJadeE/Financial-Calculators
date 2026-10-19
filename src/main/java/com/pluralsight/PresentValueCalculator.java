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


