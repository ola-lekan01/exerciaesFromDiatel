package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GeneratingRandomNumbers {
    public static void main(String[] args) {
        nextNumberGenerator();

    }
        static void nextNumberGenerator () {
            Scanner input = new Scanner(System.in);
            SecureRandom randomGenerator = new SecureRandom();
            int correctCounter = 0;
            int wrongCounter = 0;


            for (int random = 1; random <= 10; random++) {

                int dice = 1 + randomGenerator.nextInt(9);
                int number = 1 + randomGenerator.nextInt(9);

                int correctResponse = 1 + randomGenerator.nextInt(4);
                int wrongResponse = 1 + randomGenerator.nextInt(4);

                System.out.printf("Whats the result of %2d and %2d = " , dice , number);
                int userInput = input.nextInt();
                int result =  dice * number;

                if(userInput == result){
                    switch (correctResponse){
                        case 1:
                            System.out.println("Very Good");
                            break;
                        case 2:
                            System.out.println("Excellent");
                            break;
                        case 3:
                            System.out.println("Nice Work");
                            break;
                        case 4:
                            System.out.println("Keep Up the Good");
                            break;

                    }
                    correctCounter++;
                }
                else {
                    switch (wrongResponse){
                        case 1:
                            System.out.println("No Please try again");
                            break;
                        case 2:
                            System.out.println("Wrong Try Once More");
                            break;
                        case 3:
                            System.out.println("Don't give up");
                            break;
                        case 4:
                            System.out.println("No Keep Trying");
                            break;
                    }
                    wrongCounter++;
                }

            }
            System.out.printf("You got %d Correctly and %d Wrongly. Thank you for your time" , correctCounter , wrongCounter);
        }

        public static void checkAnswer(){

        }

}
