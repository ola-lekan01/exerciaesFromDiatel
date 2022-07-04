package chapter3;

import java.util.Calendar;
import java.util.Scanner;

public class HeartRate {

    public static void main(String[] args) {

        HeartRateTest heartRateCalculator = new HeartRateTest
                ("Olalekan" , "Sofuyi" , 16 , 06 , 1991 );

        Calendar cal = Calendar.getInstance();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String fName = input.nextLine();
        heartRateCalculator.setfName(fName);

        System.out.println("Enter your Second Name: ");
        String lName = input.nextLine();
        heartRateCalculator.setfName(lName);

        System.out.println("Enter your day of Birth: ");
        int dob = input.nextInt();
        heartRateCalculator.setDayOfBirth(dob);

        System.out.println("Enter your Month of Birth: ");
        int mob = input.nextInt();
        heartRateCalculator.setMonthOfBirth(mob);

        System.out.println("Enter your Year of Birth: ");
        int yob = input.nextInt();
        heartRateCalculator.setYearOfBirth(yob);

        System.out.println("Welcome" + heartRateCalculator.getfName() + " " + heartRateCalculator.getlName() + " " + heartRateCalculator.getDayOfBirth()
                + " / " + heartRateCalculator.getMonthOfBirth() + " / " + heartRateCalculator.getYearOfBirth());

        System.out.println(" As at this year " + cal.get(Calendar.YEAR) + "  You are " + heartRateCalculator.getAge());

        System.out.println( "Your Max Heart Rate is: " + heartRateCalculator.maxHeartRate(heartRateCalculator.getAge()));

        System.out.println( " Your Target Heart Rate is: " + heartRateCalculator.BMI(heartRateCalculator.maxHeartRate(heartRateCalculator.getAge())));

    }
}

