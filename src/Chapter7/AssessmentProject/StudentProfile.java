package Chapter7.AssessmentProject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentProfile {
    private String studentName;
    private int subject1;
    private int subject2;
    private int subject3;
    private double total;
    private double avg;
    private int position;
    private static int index;
    static ArrayList <StudentProfile> students = new ArrayList<>();

    public StudentProfile(String studentName, int subject1, int subject2, int subject3, int total, double avg, int position) {
        this.studentName = studentName;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.position = position;
        this.avg = avg;
        this.total = total;
    }

    public String toString(){
        return "\t" + this.studentName + "\t\t\t\t" + this.subject1 + "\t\t" + this.subject2 + "\t\t" + this.subject3 + "\t\t" + this.total + "\t\t" + this.avg + "\t\t" + this.position;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentProfile studentProfile = new StudentProfile("Name" , 45 ,60 ,30 , 90 , 190, 4);

        int numberCount, index;
        int subjectCount = 0;
        String name = null;
        int subject1, subject2, subject3, total;
        int num = 1;
        double average = 0;

        System.out.println("How Many Student do you have: ");
        numberCount = input.nextInt();

        System.out.println("How Many subject do the student offer ");
        subjectCount= input.nextInt();

        for(index = 0 ; index < numberCount ; index++) {

            System.out.printf("Enter Name of Student%d:" , num);
            name = input.nextLine();
            name = input.nextLine();
            studentProfile.setStudentName(name);

            System.out.printf("Enter scores for subject1 offered by Student%d: " , num);
            subject1 = input.nextInt();
            studentProfile.setSubject1(subject1);

            System.out.printf("Enter scores for subject2 offered by Student%d: " , num);
            subject2 = input.nextInt();
            studentProfile.setSubject2(subject2);

            System.out.printf("Enter scores for subject3 offered by Student%d: " , num);
            subject3 = input.nextInt();
            studentProfile.setSubject3(subject3);

            total = subject1 + subject2 + subject3;
            studentProfile.setTotal(total);

            average = (double) (total / subjectCount);
            studentProfile.setAvg(average);

            students.add(new StudentProfile(name, subject1, subject2, subject3, total, average, 1));
            num++;
        }
        resultPage();
    }

    public static void resultPage() {
        System.out.printf("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = %n");
        System.out.printf("%-3s %20s %15s %15s %12s %12s %15s %n", "Student", "English", "Mathematics", "Economics ", "Total", "Average", "Position");
        System.out.printf("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = %n");

        for(index = 0 ; index < students.size() ; index++){
            System.out.printf("%s%n" , students.get(index));
        }
        System.out.printf("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = %n");
        System.out.printf("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = %n");

    }



}
