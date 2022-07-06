package chapter5;

import java.util.Scanner;

public class SwitchGrades {

    public static void main(String[] args) {
        String grade;
        int score = 0;

        Scanner input = new Scanner(System.in);

        for(int counter = 1 ; counter <= 6 ; counter++) {
            System.out.println("Enter your Score: ");
            score = input.nextInt();

            switch (score / 10) {
                case 9:
                    grade = "Grade A";
                    break;
                case 6:
                    grade = "Grade B";
                    break;
                case 5:
                    grade = "Grade C";
                    break;
                case 4:
                    grade = "Grade D";
                    break;
                case 3:
                    grade = "Grade E";
                    break;
                default:
                    grade = "Grade F";
            }
            System.out.printf("You scored %d and your grade is %s%n", score, grade);
        }
    }
}
