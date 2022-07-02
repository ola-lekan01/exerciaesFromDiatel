package chapter2;

import java.util.Scanner;

public class AverageAcceleration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Starting Velocity: ");
        double startingVelocity = input.nextDouble();

        System.out.print("Enter Ending Velocity: ");
        double endingVelocity = input.nextDouble();

        System.out.print("Enter Time: ");
        double time = input.nextDouble();

        double average = (endingVelocity - startingVelocity)/time;

        System.out.print("The Average Acceleration is " + average);

    }
}