package Chapter6;

import java.security.SecureRandom;

public class SecureRandomGenerator {
    public static void main(String[] args) {
        randomNumberGenerator();
    }

    public static void numberGenerator(){
        SecureRandom randomNumberGenerator = new SecureRandom();
        int firstDice = 0;
        int secondDice = 0;
        int result = 0;

        for(int counter = 1 ; counter <= 20 ; counter++) {
            firstDice = 1 + randomNumberGenerator.nextInt(6);
            secondDice = 1 + randomNumberGenerator.nextInt(6);

        result = firstDice + secondDice;

            System.out.printf("The sum of the %d and the %d is %d%n%n" , firstDice , secondDice , result);
        }
    }
    public static void randomNumberGenerator(){
        int counter;
        SecureRandom secureRandom = new SecureRandom();

        for (counter = 1 ; counter <= 100 ; counter++) {
            double random = 50 + secureRandom.nextDouble(500);
            System.out.println(random);

            if (counter % 5 == 0) {
                System.out.println(" ");
                   }
        }    }
}
