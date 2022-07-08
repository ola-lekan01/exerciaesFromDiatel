package chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        int balance;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Account Number: ");
        int account = input.nextInt();

        System.out.println("Enter the Balance at the Beginning of the Month: ");
        int initialBalance = input.nextInt();

        System.out.println("Enter the Total Items Charged at The End of the Month: ");
        int accountCharged = input.nextInt();

        System.out.println("Enter the Total of Credit limit applied to your account: ");
        int creditCharged = input.nextInt();

        System.out.println("Enter the Allowed Credit Limit ");
        int allowedLimit = input.nextInt();

        balance = (initialBalance + accountCharged - creditCharged);

        System.out.println("Your current balance is" + balance);

        if (balance > allowedLimit) {
            System.out.println("Your current balance limit is exceeded");
        }
        else System.out.println(" You still have a Credit limit balance of " + (allowedLimit - balance));

    }
}
