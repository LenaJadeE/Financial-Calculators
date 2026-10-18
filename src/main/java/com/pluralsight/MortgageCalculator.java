package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);









    }
}




// Calculator 1: A mortgage calculator - it is used to calculate what the monthly payment for a loan would be (minus any insurance or taxes), and the total interest paid over the life of the loan.
// a. Accept the principal, interest rate as a percent (e.g. 7.625), and loan length in years from the user
// b. Display the expected monthly payment and total interest paid
// Example: A $53,000 loan at 7.625% interest for 15 years would have a $495.09/mo payment with a total interest of $36,115.99
// This calculator would use a compounded interest formula.
//    M = P × (i × (1 + i)^n) / ((1 + i)^n - 1)
// Monthly Payment (M) = - - - - -
// Principal (P):
//    This is the total amount of the loan.
// Annual Interest Rate (r): f
//    The nominal annual interest rate in decimal form. (e.g. 7.625% = 0.07625)
// Loan Term in Years (y):
//    How many years the loan lasts.
// Number of Monthly Payments (n):
//    This is 12 × y (Because there are 12 monthly payments per year.)
// Monthly Interest Rate (i):
//    This is the annual interest rate divided by 12, i.e. r/12
// Total Interest = (M × n) - P