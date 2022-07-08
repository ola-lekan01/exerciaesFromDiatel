package chapter4;

/*
initialize Miles Driven
Initialize Gallons Used
set counter to Zero

*/
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int miles;
        int gallons;
        int milesCounter = 0;
        int totalMiles = 0;
        int totalGallons = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter the Miles Driven or -1 to Quit this Application: ");
            miles = input.nextInt();

            System.out.println("Enter Gallons used or -1 to Quit this Application: ");
            gallons = input.nextInt();

            double average = (double) (miles/gallons);
            System.out.println(average);
        }
        while (miles != -1); {

            totalMiles = miles + totalMiles;
            milesCounter = +1;

            totalGallons = gallons + totalGallons;

            System.out.println("Enter the Miles Driven or -1 to Quit this Application: ");
            miles = input.nextInt();

            System.out.println("Enter Gallons used or -1 to Quit this Application: ");
            gallons = input.nextInt();

        }

        if (milesCounter != 0) {
            double averageMiles = (double) (totalMiles / totalGallons);

            System.out.println("The total Gallons Used for the Trip is: " + totalGallons);
            System.out.println("The total Miles travelled is: " + totalMiles);
            System.out.println("The Average gallon used per trip is " + averageMiles);

        }
    }
}

