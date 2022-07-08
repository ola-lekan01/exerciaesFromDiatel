package chapter4;

import java.util.Scanner;

public class SalesCalculator{

    public static void main(String[] args) {
        int counter = 1;
        double totalSale = 0;
        final double percentage = 0.09;
        final double commission = 200.0;
        double salary;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your items sold or enter -1 to quit this application: ");
        double itemSold = input.nextDouble();

        while (itemSold != -1) {

            totalSale = (itemSold + totalSale);
            counter+=1;

            System.out.println("Enter your items sold or enter -1 to quit this application: ");
            itemSold = input.nextDouble();
        }

        if (counter != 0) {

            salary = totalSale * percentage + commission;

            System.out.println("Your Earnings for the Week Ending is: " + salary);


        }
    }
}
