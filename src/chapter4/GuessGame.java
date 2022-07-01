package chapter4;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Number to Guess against the System: ");
        int number = input.nextInt();

        if (number == 50) {
            System.out.println("Congratulations, You are Correct, You just won $1,000,000");
        }
        if (number > 50) {
            System.out.println("The Number is to big, please try again. GoodLuck");
        }
        if (number < 50)
            System.out.println("The Number is to Small, Please Try again, GoodLuck");
    }
}
