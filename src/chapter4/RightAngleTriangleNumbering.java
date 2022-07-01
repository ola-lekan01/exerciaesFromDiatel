package chapter4;

import java.util.Scanner;

public class RightAngleTriangleNumbering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter1 =1;
        int number = 1;

        System.out.println("Enter the base length: ");
        int rows = input.nextInt();

        while (counter1 < rows){

            int number2 = 0;
            int counter2 = 1;

            while (counter2 < counter1){

                System.out.printf( "%d" , number + number2);
                number2++;
                counter2++;
            }

            System.out.println();
            counter1++;
        }
    }
}
