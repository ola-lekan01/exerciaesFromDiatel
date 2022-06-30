package chapter3;

import chapter3.HealthProfile;

import java.util.Scanner;

public class HealthProfileTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HealthProfile testing = new HealthProfile("Lekan" , "Habeeb" , "Male" ,
                1991 , 06 , 16 , 6.5 , 85.0);


//To Store First Name
        System.out.println("Enter your First Name: ");
        String firstName = sc.nextLine();
        testing.setfName(firstName);

//To Store Last Name
        System.out.println("Enter your Last Name: ");
        String lastName = sc.nextLine();
        testing.setlName(lastName);

//To Store Gender
        System.out.println("Enter Gender: ");
        String myGender = sc.nextLine();
        testing.setgender(myGender);

//To Store Year of Birth
        System.out.println("Enter your Year Of Birth: ");
        int myYear = sc.nextInt();
        testing.setyearOfBirth(myYear);

//To Store Month of Birth
        System.out.println("Enter your Month of Birth eg. 3: ");
        int myMonth = sc.nextInt();
        testing.setmonthOfBirth(myMonth);

//To Store Day of Birth
        System.out.println("Enter your day of Birth: ");
        int myDay = sc.nextInt();
        testing.setdayOfBirth(myDay);

//To Store Height
        System.out.println("Enter your Height in Inches: ");
        double myHeight = sc.nextDouble();
        testing.setheight(myHeight);

//To Store Weight
        System.out.println("Enter your Weight in Pounds: ");
        double myWeight = sc.nextDouble();
        testing.setweight(myWeight);

        System.out.println("Welcome " + testing.getfName() + " "+ testing.getlName());
        System.out.println("Gender " +  testing.getgender());
        System.out.println("Date of Birth " + testing.getdayOfBirth() + testing.getmonthOfBirth() + testing.getyearOfBirth()
                + " As Of today you are " + testing.age() + " Years Old.");

        System.out.println("Height: " + testing.getheight() + " Weight: " + testing.getweight());
        System.out.println(" Your Body Mass Index is " + testing.bodyMassIndex());
        System.out.println("Your Maximum Heart Rate is :  " + testing.heartRate());

    }

}
