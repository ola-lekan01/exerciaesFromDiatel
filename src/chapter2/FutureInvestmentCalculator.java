package chapter2;

import java.util.Scanner;

public class FutureInvestmentCalculator {

//A simple investment Calculator

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Investment amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter Annual Interest in Percentage; ");
        double interest = input.nextDouble();

        System.out.print("Enter Number of Years: ");
        double years = input.nextDouble();

        double accumulatedValue1 = amount * (1 + interest / 100);

        double accumulatedValue = Math.pow(accumulatedValue1, years * 12);

        System.out.print(" Accumulated value is $" + accumulatedValue);

    }
}
