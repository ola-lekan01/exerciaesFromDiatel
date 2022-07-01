// TODO: 6/30/2022  Please kindly look through again for update

package chapter4;

import java.util.Scanner;

public class LargestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;
        int number2 = 0;
        int counter = 1;
        int firstLargest = -500;
        int secondLargest = 0;

        while (counter <= 5) {
            System.out.println("Please Enter your number: ");
            number = input.nextInt();

            if (number > firstLargest) {
                firstLargest = number;
            }
            if( firstLargest < secondLargest)
                secondLargest = number2;

            counter++;
        }
        System.out.printf("The Largest of two numbers is %d %d", firstLargest , secondLargest);
    }
}
