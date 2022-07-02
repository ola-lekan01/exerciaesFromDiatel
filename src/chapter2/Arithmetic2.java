package chapter2;

import java.util.Scanner;

public class Arithmetic2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int addition = number1 + number2;
        int multiplication = number1 * number2;
        int subtraction = number1 - number2;
        int division = number1 / number2;

        System.out.printf("The Sum of numbers is %d%nThe Product of number is %d%nThe Diffrence of number is %d%nThe Quotient of number is %d", addition,multiplication,subtraction,division);

    }
}
