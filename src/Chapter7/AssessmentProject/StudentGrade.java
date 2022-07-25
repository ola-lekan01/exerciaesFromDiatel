package Chapter7.AssessmentProject;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        setUp();
    }

    static int numberOfStudents , numberOfSubjects , index , total = 0;
    static double average = 0.0;
    static Scanner input = new Scanner(System.in);
    static int[][] grades = new int[numberOfStudents][numberOfSubjects];
    static int[] totalScore;
    static double[] averageScore;

    public static int scannerInt(){
        return input.nextInt();
    }

    public static void doubleLine(){
        for(index = 0 ; index < 100; index++ ){
            System.out.print("= ");
        }
        System.out.println();
    }


    static void setUp() {
        System.out.println("How many Students are in your Class: ");
        numberOfStudents = input.nextInt();

        System.out.println("How many subjects each do the Students Offer: ");
        numberOfSubjects = input.nextInt();

        for(int row = 0 ; row < grades.length ; row++){
            for(int column = 0 ; column < grades[row].length ; column++) {
                System.out.printf("Enter Student %d score for subject %d:",  column + 1, column + 1);
                grades[row][column] = scannerInt();
            }
            System.out.println(" ");

        }
        resultTable();
    }

    static void resultTable(){
        doubleLine();
        System.out.print("STUDENT");
        for(int row = 0 ; row < numberOfSubjects; row++){
            System.out.printf("          Subject %d" , row + 1 );
        }
        System.out.printf("%30s%10s%10s%n" , "Total" , "Average" , "Sum");
        doubleLine();
    }

    public static void computeResult(){
       totalScore = new int[numberOfStudents];
       averageScore = new double[numberOfStudents];
        for(int rows = 0; rows < grades.length; rows++){
            System.out.printf("Student %d" , rows + 1);
            for(int column = 0 ; column < grades[rows].length ; column++){
                total = total + grades[rows][column];
                totalScore[rows] = total;
                average = (double) total / grades.length;
                averageScore[rows] = average;
                System.out.printf("%10d" , grades[rows][column]);
            }
            System.out.printf("%10d" , total);
            System.out.printf("%10f" , average);
            System.out.println();

        }
    }

}
