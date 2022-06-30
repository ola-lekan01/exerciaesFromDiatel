package chapter2;

//To calculate the Runway length for the speed of an Airplane given a known speed.

import java.util.Scanner;

public class AirPlaneFlight {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Speed: ");
        double speed = input.nextDouble();

        System.out.print("Enter Acceleration: ");
        double acceleration = input.nextDouble();

        double runWayLength = (speed * speed ) / (2 * acceleration);

        System.out.print("The minimum runway length for this airplane is " + runWayLength);

    }

}
