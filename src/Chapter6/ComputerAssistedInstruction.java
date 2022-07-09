package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static void main(String[] args) {
        chooseGameType();
    }
    private static final Scanner input = new Scanner(System.in);
    private static final SecureRandom randomGenerator = new SecureRandom();
    public static int correctCounter = 0;
    public static int wrongCounter = 0;
    private static int result = 0;
    public static int percentage = 0;
    private static int userInput;
    private static int number2;
    private static int number1;
    private static int random;
    private static int counter;
    private static final int base = 10;

    public static void chooseGameType(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n",
                "Select your preferred selection from below" ,
                "\t1. Multiplication" ,
                "\t2. Addition" ,
                "\t3. Subtraction" ,
                "\t4. Random Questions");
        userInput = input.nextInt();

        switch (userInput){
            case 1: multiplicationQuestions();
            case 2: additionQuestions();
            case 3: subtractionQuestions();
            case 4: randomQuestions();
        }
    }
    public static void multiplicationQuestions() {

        System.out.printf("%s%n%s%n%s%n%s%n",
                "Select the Difficulty Level",
                "\tLevel 1: Intermediate | Between Ages 2 and 5",
                "\tLevel 2: Medium | Between Ages 5 and 8",
                "\tLevel 3: Difficult | Between Ages 8 and 11");

        userInput = input.nextInt();

        if (userInput == 1) {
            multiplyIntermediate();
        }
        if (userInput == 2) {
            multiplyMedium();
        }
        if (userInput == 3) {
           multiplyHard();
        }
    }
    public static void additionQuestions(){
        System.out.printf("%s%n%s%n%s%n%s%n",
                "Select the Difficulty Level",
                "\tLevel 1: Intermediate | Between Ages 2 and 5",
                "\tLevel 2: Medium | Between Ages 5 and 8",
                "\tLevel 3: Difficult | Between Ages 8 and 11");

        userInput = input.nextInt();

        if (userInput == 1) {
            additionIntermediate();
        }
        if (userInput == 2) {
            additionMedium();
        }
        if (userInput == 3) {
            additionHard();
        }
    }

    public static void randomQuestions() {

        for (counter = 1; counter <= 10; counter++) {

            number2 = 1 + randomGenerator.nextInt(9);
            switch (number2) {
                case 1 -> additionIntermediate();
                case 2 -> subtractionIntermediate();
                case 3 -> multiplyIntermediate();
                case 4 -> additionMedium();
                case 5 -> multiplyMedium();
                case 6 -> subtractionMedium();
                case 7 -> multiplyHard();
                case 8 -> subtractionDifficult();
                default -> additionHard();
            }
        }
    }
    public static void subtractionQuestions(){
        System.out.printf("%s%n%s%n%s%n%s%n",
                "Select the Difficulty Level",
                "\tLevel 1: Intermediate | Between Ages 2 and 5",
                "\tLevel 2: Medium | Between Ages 5 and 8",
                "\tLevel 3: Difficult | Between Ages 8 and 11");

        userInput = input.nextInt();

        if (userInput == 1) {
            subtractionIntermediate();
        }
        if (userInput == 2) {
            subtractionMedium();
        }
        if (userInput == 3) {
            subtractionDifficult();
        }
    }
    public static void multiplyIntermediate() {

        for (random = 1; random <= base; random++) {

            number1 = 1 + randomGenerator.nextInt(9);
            number2 = 1 + randomGenerator.nextInt(9);

            System.out.printf("Whats the result of %2d and %2d = ", number1, number2);
            userInput = input.nextInt();
            result = number1 * number2;
            answerChecker();
        }
        gradeCalculator(correctCounter);
        }

    public static void multiplyMedium() {

        for (counter = 1; counter <= 10;) {
            number1 = 9 + randomGenerator.nextInt(50);
            number2 = 9 + randomGenerator.nextInt(50);

            System.out.printf("Whats the result of %2d and %2d = ", number1, number2);
            userInput = input.nextInt();
            result = number1 * number2;
            counter++;
            answerChecker();
        }
        gradeCalculator(correctCounter);

    }
    public static void multiplyHard() {
        for(counter = 1 ; counter <= base;){
            number1 = 20 + randomGenerator.nextInt(70);
            number2 = 20 + randomGenerator.nextInt(70);

            System.out.printf("Whats the result of %2d and %2d = ", number1, number2);
            userInput = input.nextInt();
            result = number1 * number2;
            counter++;
            answerChecker();
        }
        gradeCalculator(correctCounter);

    }
    public static void additionIntermediate(){
        for(random = 1 ; random <= base; random++){
            number1 = 1 + randomGenerator.nextInt(20);
            number2 = 1 + randomGenerator.nextInt(20);

            System.out.printf("Whats the result of %2d plus %2d" , number1 , number2);
            userInput = input.nextInt();
            result= number1 + number2;
            answerChecker();
        }
        gradeCalculator(correctCounter);
    }

    public static void additionMedium(){
        for (random = 1; random <= base; random++) {
            number1 = 10 + randomGenerator.nextInt(50);
            number2 = 10 + randomGenerator.nextInt(50);

            System.out.printf("Whats the result of %2d plus %2d = ", number1, number2);
            userInput = input.nextInt();
            result = number1 + number2;
            answerChecker();
        }
        gradeCalculator(correctCounter);
    }

    public static void additionHard(){
        for(counter = 1 ; counter <= base ; counter++) {
            number1 = 50 + randomGenerator.nextInt(200);
            number2 = 50 + randomGenerator.nextInt(200);

            System.out.printf("Whats the result of %2d plus %2d = ", number1, number2);
            userInput = input.nextInt();
            result = number1 + number2;
            answerChecker();
        }
        gradeCalculator(correctCounter);
    }

    public static void subtractionIntermediate(){
        for(counter = 1 ; counter <= base ; counter++){

            number1 = 1 + randomGenerator.nextInt(20);
            number2 = 1 + randomGenerator.nextInt(20);

            System.out.printf("Whats the result of subtracting %2d from %2d = ", number1, number2);
            userInput = input.nextInt();
            result =  number2 - number1;
            answerChecker();
        }
        gradeCalculator(correctCounter);
    }
    public static void subtractionMedium(){
    for(counter =1 ; counter <= base ; counter++){
        number1 = 20 + randomGenerator.nextInt(100);
        number2 = 20 + randomGenerator.nextInt(100);

        System.out.printf("Whats the result of subtracting %2d from %2d = " , number1, number2 );
        userInput = input.nextInt();
        result = number2 - number1;
            answerChecker();
        }
    gradeCalculator(correctCounter);
    }
    public static void subtractionDifficult(){
        for(counter = 1 ; counter <= base ; counter++){
            number1 = 50 + randomGenerator.nextInt(200);
            number2 = 50 + randomGenerator.nextInt(200);

            System.out.printf("Whats the result of subtracting %2d from %2d = " , number1 , number2);
            userInput =  input.nextInt();
            result = number2 - number1;
            answerChecker();
        }
        gradeCalculator(correctCounter);
    }

    public static void answerChecker() {

        int correctResponse = 1 + randomGenerator.nextInt(4);
        int wrongResponse = 1 + randomGenerator.nextInt(4);

        if (userInput == result) {
            switch (correctResponse) {
                case 1 -> System.out.printf("%s%n" ,"\tVery Good");
                case 2 -> System.out.printf("%s%n" ,"\tExcellent");
                case 3 -> System.out.printf("%s%n" ,"\tNice Work");
                case 4 -> System.out.printf("%s%n" ,"\tKeep Up the Good Work");
            }
            System.out.println(" ");
            correctCounter++;

        } else {
            switch (wrongResponse) {
                case 1 -> System.out.printf("%s%n" ,"\tNo Please try again");
                case 2 -> System.out.printf("%s%n" ,"\tWrong Try Once More");
                case 3 -> System.out.printf("%s%n" ,"\tDon't give up");
                case 4 -> System.out.printf("%s%n" , "\tNo Keep Trying");
            }
            System.out.println(" ");
            wrongCounter++;
        }

    }
    public static void gradeCalculator(int correctCounter){

        percentage = correctCounter * 10;

        if (result < 75) {
            System.out.printf("\tYour overall Percentage is %d. Please ask your teacher for Help%n%n", percentage);
        } else if (result > 75) {
            System.out.printf("\tYour Overall percentage is %d. You are ready to go to the next level%n%n", percentage);
        }
        System.out.printf("\tYou got %d Correctly and %d Wrongly. Thank you for your time%n%n", correctCounter, wrongCounter);

    }
}