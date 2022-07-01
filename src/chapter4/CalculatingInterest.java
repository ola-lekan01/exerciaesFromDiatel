package chapter4;

import java.util.Scanner;

public class CalculatingInterest {
    public static void main(String[] args) {

        double principal = 1000.0;
        double rate = 0.05;
        double amount = 0.00;
        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter Your Grade: ");
            int grade = input.nextInt();
            total += grade;
        }
        System.out.println("The Sum of all grade entered is: " + total);
        System.out.println("The Average sum of all grade entered is: " + total / 10);

        System.out.printf("%s%20s%n", "year", "Amount on Deposit");

        for (int year = 1; year <= 10; ++year) {
            amount = principal * Math.pow(1 + rate, year);

            System.out.printf("%4d%20.2f%n", year, amount);
        }

    }
}