package chapter4;

import java.util.Scanner;

public class LoopTesting {
    public static void main(String[] args) {

        System.out.println("Using The For Loop");
        for(int counter = 1 ; counter <= 100 ; counter+=8 ){
            System.out.println(counter);
        }

        System.out.println("Using The while Loop");
        int count = 0;
        while (count <= 100){
            System.out.println(count);
            count+=7;
        }
        System.out.println("Using the for Loop to total 10 grade scores");

        Scanner input = new Scanner(System.in);


        int total = 0;
        for(int i = 1 ; i <=10 ; i++){
            System.out.println("Enter Your Grade: ");
            int grade = input.nextInt();
            total+= grade;
        }
        System.out.println( "The Sum of all grade entered is: " + total);
        System.out.println( "The Average sum of all grade entered is: " + total / 10);

    }
}
