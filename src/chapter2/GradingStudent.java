package chapter2;

//Simple computing grades Student Program.
import java.util.Scanner;

public class GradingStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Grade: ");
        int grade = input.nextInt();

        if (grade >= 90) {
            System.out.println("Excellent result, your Grade is A");
        }
        else if (grade >= 80) {
            System.out.println("Very Good result, your Grade is B");
        }
        else if (grade >= 70) {
            System.out.println("Good result, your Grade is C");
        }
        else if ( grade >= 60) {
            System.out.println("Satisfactory result, your Grade is D");
        }
        else if (grade >= 50) {
            System.out.println("No Comment, your Grade is E");
        }
        else {
            System.out.println("Study better next time, your Grade is F");
        }
    }
}

