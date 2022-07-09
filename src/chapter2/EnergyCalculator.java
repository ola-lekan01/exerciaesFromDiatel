package chapter2;

//Program to Calculate Energy

import java.util.Scanner;

public class EnergyCalculator{

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amount of Water in Kilograms: ");
        double Water = input.nextDouble();

        System.out.print("Enter Initial Temperature: ");
        double InitialTemperature = input.nextDouble();

        System.out.print("Enter Final Temperature: ");
        double FinalTemperature = input.nextDouble();

        double Energy = Water * (FinalTemperature - InitialTemperature) * 4184;

        System.out.println ("The Energy needed is " + Energy + "Joules");

    }
}
