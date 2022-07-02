package chapter4;

import java.util.Scanner;

public class LoopToPrintGradeAndCountGrade {
    public static void main(String[] args) {

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

            switch (total / 10) { //Who scores above 90
                case 10, 9 -> ++aCount;
                case 8 -> ++bCount;
                case 7 -> ++cCount;
                case 6 -> ++dCount;
                case 5 -> ++eCount;
                default -> ++fCount;
            }
        }
                System.out.printf("%nGrade Report: %n");

        if (counter != 0) {
            double average = (double) total / counter;

            System.out.printf("Total of %d student score Calculated is %d%n", counter, total);
            System.out.printf("The Average total is: %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of Students who received each grade" ,
                    " A: ", aCount,
                    " B: ", bCount,
                    " C: ", cCount,
                    " D: ", dCount,
                    " E: ", eCount,
                    " F " , fCount);
            }
        else {
            System.out.println("You have not entered any Score, Please Try again, THANKS");
        }

    }
}
