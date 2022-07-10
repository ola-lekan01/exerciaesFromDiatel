package chapter5;

import java.util.Scanner;

public class MaximumOfNumbers {

    public static void main(String[] args) {
        numberInput();
    }
    private static final Scanner input = new Scanner(System.in);

    public static void numberInput(){
        System.out.print("Enter three numbers separated by comma: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int maximumOfValue = maximum(number1, number3, number2);

        System.out.printf("The Maximum of the three Numbers is %d" , maximumOfValue);
    }
    public static int maximum(int number1 , int number2 , int number3){
        int maximumValue = number1;

        if (maximumValue < number2) {
            maximumValue = number2;
        }
         else if (number3 > maximumValue) {
            maximumValue = number3;
        }
        return maximumValue;
    }
}
