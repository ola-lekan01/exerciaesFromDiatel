package Chapter7.AssessmentProject.StudentGrade;

import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        setUp();
        gradeInputs();
        resultHeader();
        processGrades();
        subjectSummary();
        classSummary();
    }
    static Scanner input = new Scanner(System.in);
    static int numberOfStudents, rows, columns;
    static int numberOfSubjects;
    static int [][] studentGrades;
    static int [] totals;
    static double [] averages;

    public static void setUp(){
        System.out.println("Enter Number Of Students: ");
        numberOfStudents = input.nextInt();

        System.out.println("Enter Number of Subjects: ");
        numberOfSubjects = input.nextInt();
    }

    public static void doubleLine(){
        for (int index = 0; index < 70; index++) {
            System.out.print("= ");
        }
        System.out.println();
    }

    public static void gradeInputs(){
        studentGrades = new int[numberOfStudents][numberOfSubjects];
        System.out.println("Welcome to Result Page");
        for (rows = 0 ; rows < studentGrades.length ; rows++){
            for(columns = 0 ; columns < studentGrades[rows].length ; columns++){
                System.out.printf("Enter Student Grade for Student %d and Subject %d:" , rows + 1, columns + 1);
                int grade = input.nextInt();
                studentGrades[rows][columns] = grade;
            }
            System.out.println();
        }
        sleep();
    }

    public static void resultHeader(){
        doubleLine();
        System.out.printf("%2s","STUDENT");
        for (rows = 0; rows < numberOfSubjects ; rows++) {
            System.out.printf("%8s%d" ,"SUB ", (rows+1));
        }
        System.out.printf("%20s%10s%10s%n" , "Total" , "Average" , "Position");
        doubleLine();
    }
    public static void sleep(){
        try {
            System.out.println("Saving Results");
            for (rows = 0; rows < 20; rows++) {
                Thread.sleep(50);
                System.out.print(">");
            }
            System.out.println();
            System.out.println("Saved Successfully");
            System.out.println();
            System.out.println("Please wait While result is Generated");
            System.out.println("Generating Results");
            for (rows = 0; rows < 20; rows++) {
                Thread.sleep(50);
                System.out.print(">");
            }
            System.out.println();
            System.out.println("Result Generated");
            System.out.println();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void processGrades(){

        totals = new int[numberOfStudents];
        averages = new double[numberOfStudents];
        for (rows = 0 ; rows < studentGrades.length ; rows++){
            int total = 0;
            System.out.printf("%5s%d","Student", (rows+1));
            for(columns = 0 ; columns < studentGrades[rows].length ; columns++) {
                System.out.printf("%8d",studentGrades[rows][columns]);
                total += studentGrades[rows][columns];
            }
            totals[rows] = total;
            averages[rows] = (double) total / numberOfSubjects;
            System.out.printf("%20d%10.2f%10d" , totals[rows], averages[rows], rows+1);
            System.out.println();
        }
        doubleLine();
    }

    public static int bestStudent(int[][] array){
        int highest = array[0][0];
        for(rows = 0; rows < array.length; rows++){
            if(array[rows][0] > highest){
                highest = array[rows][0];
            }
        }
        return highest;
    }

    public static int bestStudentScorerIndex(int[][] array) {
        int highest = array[0][0];
        int index = 0;
        for (rows = 0; rows < array.length; rows++) {
            if (array[rows][0] > highest) {
                index = rows;
            }
        }
        return index + 1;
    }
    public static int worstStudent(int[][] array){
        int lowest = array[0][0];
        for(rows = 0; rows < array.length; rows++){
            if(array[rows][0] < lowest){
                lowest = array[rows][0];
            }
        }
        return lowest;
    }
    public static int worstStudentScorerIndex(int[][] array) {
        int lowest = array[0][0];
        int index = 0;
        for (rows = 0; rows < array.length; rows++) {
            if (array[rows][0] < lowest) {
                index = rows;
            }
        }
        return index + 1;
    }

    public static int totalSubject (int[][] array){
        int total = array[0][0];
        for(rows = 0; rows < array.length; rows++){
                total += array[rows][0];
        }
        return total;
    }
    public static int averageSubject (int[][] array){
        int total = array[0][0];
        int average;
        for(rows = 0; rows < array.length; rows++){
                total += array[rows][0];
        }
        average = total / numberOfStudents;
        return average;
    }

    public static int passPerSubject (int[][] array){
        int count = 0;
        for(rows = 0; rows < array.length; rows++){
            if(array[rows][0] > 50){
                count++;
            }
        }
        return count;
    }
    public static int failPerSubject (int[][] array){
        int count = 0;
        for(rows = 0; rows < array.length; rows++){
            if(array[rows][0] < 50){
                count++;
            }
        }
        return count;
    }

    public static int overallHighestStudent(int [][] array){
        int highest = array[0][0];
        for(rows = 0; rows < array.length; rows++){
            for(columns = 0;  columns < array[rows].length; columns++) {
                if (array[rows][columns] > highest) {
                    highest = array[rows][columns];
                }
            }
        }
        return highest;
    }

    public static int overallHighestStudentIndex(int [][] array){
        int highest = array[0][0];
        int index = 0;
        for(rows = 0; rows < array.length; rows++){
            for(columns = 0;  columns < array[rows].length; columns++) {
                if (array[rows][columns] > highest) {
                    index = columns;
                }
            }
        }
        return index + 1;
    }

    public static int overallLowestStudent(int [][] array){
        int lowest = array[0][0];
        for(rows = 0; rows < array.length; rows++){
            for(columns = 0;  columns < array[rows].length; columns++) {
                if (array[rows][columns] < lowest) {
                    lowest = array[rows][columns];
                }
            }
        }
        return lowest;
    }

    public static int overallLowestStudentIndex(int [][] array){
        int lowest = array[0][0];
        int index = 0;
        for(rows = 0; rows < array.length; rows++){
            for(columns = 0;  columns < array[rows].length; columns++) {
                if (array[rows][columns] < lowest) {
                    index = columns;
                }
            }
        }
        return index + 1;
    }

    public static int bestGraduatingStudent() {
        int highest = totals[0];
        for (rows = 0; rows < totals.length; rows++) {
            if (totals[rows] > highest) {
                highest = totals[rows];
            }
        }
        return highest;
    }

    public static int bestGraduatingStudentIndex() {
        int highest = totals[0];
        int index = 0;
        for (rows = 0; rows < totals.length; rows++) {
            if (totals[rows] > highest) {
                index = rows;
            }
        }
        return index + 1;

    }

    public static int worstGraduatingStudent() {
        int lowest = totals[0];
        for (rows = 0; rows < totals.length; rows++) {
            if (totals[rows] < lowest) {
                lowest = totals[rows];
            }
        }
        return lowest;
    }

    public static int worstGraduatingStudentIndex() {
        int lowest = totals[0];
        int index = 0;
        for (rows = 0; rows < totals.length; rows++) {
            if (totals[rows] < lowest) {
                index = rows;
            }
        }
        return index + 1;
    }

    public static int totalClassScore(int[] array) {
        int total = 0;
        for (rows = 0; rows < array.length; rows++) {
           total += array[rows];
        }
        return total;
    }

    public static int averageClassScore(int[] array) {
        int total = 0;
        int average;
        for (rows = 0; rows < array.length; rows++) {
            total += array[rows];
        }
        average = total / numberOfStudents;
        return average;
    }

    public static void classSummary(){
        doubleLine();
        System.out.printf("Best Graduating Student is: Student %d Scoring %d%n", bestGraduatingStudentIndex(), bestGraduatingStudent());
        doubleLine();
        System.out.println();
        doubleLine();
        System.out.printf("Worst Graduating Student is: Student %d Scoring %d%n", worstGraduatingStudentIndex(), worstGraduatingStudent());
        doubleLine();
        System.out.printf("Class Total is: %d%n", totalClassScore(totals));
        System.out.printf("Class Average is: %d%n" ,  averageClassScore(totals));
        doubleLine();
    }

    public static void subjectSummary(){
        doubleLine();
        System.out.println("Subject Summary");
        for(rows = 0; rows < numberOfSubjects ; rows++){
            System.out.printf("%s%d%n", "Subject " , (rows+1));
            System.out.printf("The highest Scoring Student is: Student %d Scoring %d%n", bestStudentScorerIndex(studentGrades), bestStudent(studentGrades));
            System.out.printf("The lowest Scoring Student is: Student %d Scoring %d%n", worstStudentScorerIndex(studentGrades), worstStudent(studentGrades));
            System.out.printf("Total Score is: %d%n" , totalSubject(studentGrades));
            System.out.printf("The Average Score is: %d%n" , averageSubject(studentGrades));
            System.out.printf("Number of fails: %d%n", failPerSubject(studentGrades));
            System.out.printf("Number of passes: %d%n", passPerSubject(studentGrades));
            System.out.printf("The Overall highest Scoring Student is: Student %d Scoring %d%n", overallHighestStudentIndex(studentGrades), overallHighestStudent(studentGrades));
            System.out.printf("The Overall lowest Scoring Student is: Student %d Scoring %d%n", overallLowestStudentIndex(studentGrades), overallLowestStudent(studentGrades));
            doubleLine();
        }
    }
}