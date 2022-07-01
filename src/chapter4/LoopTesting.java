package chapter4;

import java.util.Scanner;

public class LoopTesting {
    public static void main(String[] args) {
/*
        double principal = 1000.0;
        double rate = 0.05;
        double amount = 0.00;


        System.out.println("Using The For Loop");
        for(int counter = 1 ; counter <= 100 ; counter+=8 ){
            System.out.println(counter);
        }

        System.out.println("Using The while Loop");
        int count = 0;
        while (count <= 100){
            System.out.println(count);
            count+=7;
        }
        System.out.println("Using the for Loop to total 10 grade scores");

        Scanner input = new Scanner(System.in);


        int total = 0;
        for(int i = 1 ; i <=10 ; i++){
            System.out.println("Enter Your Grade: ");
            int grade = input.nextInt();
            total+= grade;
        }
        System.out.println( "The Sum of all grade entered is: " + total);
        System.out.println( "The Average sum of all grade entered is: " + total / 10);

        System.out.printf("%s%20s%n" , "year" , "Amount on Deposit" );

        for(int year = 1 ; year <=10 ; ++year){
            amount = principal * Math.pow(1 + rate , year);

            System.out.printf("%4d%20.2f%n" , year , amount);
        }

        int counter = 0;
        int total = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n%s%n%s%n" ,"Enter Scores between 0 and 100 " , "Enter End of File After Entering all the scores Correctly" ,
                "For Windows Press Control Z and Enter to signify End of File" , "For Apple Press CMD z and Enter to Signify End of Data Entry");
        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            counter++;

            switch (total / 10) {
                case 10: //Who scores above 90
                case 9:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                case 5:
                    ++eCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }
                System.out.printf("%nGrade Report: %n");

        if (counter != 0) {
            double average = (double) total / counter;

            System.out.printf("Total of %d student score Calculated is %d%n", counter, total);
            System.out.printf("The Average total is: %.2f%n", average);
            System.out.printf("n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of Students who received each grade" ,
                    " A: ", aCount,
                    " B: ", bCount,
                    " C: ", cCount,
                    " D: ", dCount,
                    " E: ", eCount,
                    " F ", fCount);
            }
        else {
            System.out.println("You have not entered any Score, Please Try again, THANKS");
        }
*/
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
