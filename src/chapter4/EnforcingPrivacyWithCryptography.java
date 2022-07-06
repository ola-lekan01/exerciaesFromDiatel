package chapter4;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Message: ");
        double decrypt = input.nextDouble();

        System.out.println("Enter your Message: ");
        double decrypt2 = input.nextDouble();

        System.out.println("Enter your Message: ");
        double decrypt3 = input.nextDouble();

        System.out.println("Enter your Message: ");
        double decrypt4 = input.nextDouble();

        double encrypt = (decrypt + 7) / 10;
        double encrypt2 = (decrypt + 7) / 10;
        double encrypt3 = (decrypt + 7) / 10;
        double encrypt4 = (decrypt + 7) / 10;

        System.out.printf("%f%f%f%f" , encrypt , encrypt2 , encrypt3 , encrypt4);

    }
}
