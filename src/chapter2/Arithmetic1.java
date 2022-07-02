package chapter2;

//Program to calculate Arithmetic programs (Square, Addition and Differences)

import java.util.Scanner;

public class Arithmetic1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your First Integer: ");
        int FirstNumber = input.nextInt();

        System.out.print("Enter your Second Integer: ");
        int SecondNumber = input.nextInt();

        int FirstSquare = (FirstNumber * FirstNumber);
        int SecondSquare = (SecondNumber * SecondNumber);

        int Sum = (FirstSquare + SecondSquare);

        int Difference = (FirstSquare - SecondSquare);

        System.out.println("The Square of the first Number is: " + FirstSquare);

        System.out.println("The Square of the Second Number is: " + SecondSquare);

        System.out.println("The Sum of the Squared Number is: " + Sum);

        System.out.println("The Difference of the Squared Number is: " + Difference);

    }

}