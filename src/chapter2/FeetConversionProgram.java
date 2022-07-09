package chapter2;

import java.util.Scanner;

public class FeetConversionProgram {

    //Program to Convert Feet to Meters
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your Value in Feet: ");
            double Feet = input.nextDouble();

            double Meters = (Feet * 0.305);

            System.out.println(Feet + " feet is " + Meters + " meters ");

        }
}
