//To Calculate Sum of numbers between 1- 30 divisible by 3

package chapter5;

public class IntegersDivisibleByThree {
    public static void main(String[] args) {

        int total = 0;

        for (int counter = 0; counter <= 30; counter+=3) {
            total = counter + total;

        }
        System.out.println("The Sum of numbers between 1- 30 divisible by 3 is: " + total);
    }

}
