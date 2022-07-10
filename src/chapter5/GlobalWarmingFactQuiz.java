package chapter5;

import java.util.Scanner;

public class GlobalWarmingFactQuiz {
    public static void main(String[] args) {

        int gradeCounter = 0;
        int answer;

        Scanner input = new Scanner(System.in);
        System.out.printf( "%s%n%s%n" , "Kindly Read through the questions on Global warming and enter your correct answer" , "Note: You can only answer once");

        System.out.printf("%s%n%s%n%s%n%s%n%s%n%n" , "A. Who was featured in the movie An Inconvenient Truth? " , " 1. Al Gore " , " 2. Yal Hore " , " 3. Ral Rore " , " 4. Eal Tore ");
        answer = input.nextInt();

        switch (answer) {
            case 1 -> System.out.println("You are Wrong");
            case 2 -> {
                System.out.println(" You are Correct");
                gradeCounter++;
            }
            case 3 -> System.out.println(" You are Wrong");
            case 4 -> System.out.println("Wrong Answer");
            default -> System.out.println("Wrong Input");
        }

        System.out.printf("%s%n%s%n%s%n%s%n%s%n" , "2. Which Year was the UN Scientist given a Nobel Prize in recognition of their efforts to build up and disseminate greater knowledge about man-made climate change." ,
                " 1. 2008 " , " 2. 2009 " , " 3. 2010 " , " 4. 2007 ");
        answer = input.nextInt();

        switch (answer) {
            case 1, 2, 3 -> System.out.println("You are Wrong");
            case 4 -> {
                System.out.println("You are Correct");
                gradeCounter++;
            }
        }
        System.out.printf("%s%n%s%n%s%n%s%n%s%n" , "C. What is the tittle of the movie on issue of global warming " , "1. The Bitter Truth" , "2. An Inconvenient Truth" , " 3. An Honest Truth" , " 4. The Convention");
        answer = input.nextInt();

        switch (answer) {
            case 1, 3, 4 -> System.out.println("You are Wrong");
            case 2 -> {
                System.out.println(" You are Correct");
                gradeCounter++;
            }
        }
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%n" , "4. What Award was presented to the U.N. Network of Scientist?" , " 1. Nobel Prize" , " 2. Scientist Prize" , " 3. Industrial Prize " , " 4. Award Recognition ");
        answer = input.nextInt();

        switch (answer) {
            case 1 -> {
                System.out.println("You are Correct");
                gradeCounter++;
            }
            case 2, 3, 4 -> System.out.println(" You are Wrong");
        }
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%n" , " E. Within the next 2 decades, global temperatures are likely to rise by how many degrees? " ," 1. 0.5" , " 2. 3.0 " , " 3. 2.0 " , " 4. 1.5 " );
        answer = input.nextInt();

        switch (answer) {
            case 4 -> {
                System.out.println("You are Correct");
                gradeCounter++;
            }
            case 2, 3, 1 -> System.out.println(" You are Wrong");
        }

        System.out.println(" Your Overall Score for the Global Warming Quiz is " + gradeCounter + "/5");
        switch (gradeCounter) {
            case 1, 2, 3 -> System.out.println("Time to brush up on your Global Warming Challenge");
            case 4 -> System.out.println("Very Good Performance");
            case 5 -> System.out.println(" Excellent performance ");
        }
    }

}
