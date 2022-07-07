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
        int gallons = 0;
        int milesCounter = 0;
        int gallonsCounter = 0;
        int totalMiles = 0;
        int totalGallons = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Miles Driven or -1 to Quit this Application: ");
        miles = input.nextInt();

        System.out.println("Enter Gallons used or -1 to Quit this Application: ");
        gallons = input.nextInt();

        while (miles != -1) {

            totalMiles = miles + totalMiles;
            milesCounter = +1;

            totalGallons = gallons + totalGallons;
            gallonsCounter = +1;

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

