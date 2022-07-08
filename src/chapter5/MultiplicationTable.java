package chapter5;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 1;
        int number2 = 1;

        for(number2 = 1 ; number2 <= 12 ; number2++){

            int result = number * number2;
            System.out.printf("%d *  %d = %d", number, number2, result);
            System.out.println();
        }

    }
}
