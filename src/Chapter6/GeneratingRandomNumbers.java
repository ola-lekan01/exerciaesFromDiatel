package Chapter6;

import java.security.SecureRandom;

public class GeneratingRandomNumbers {
    public static void main(String[] args) {

        SecureRandom randomGenerator = new SecureRandom();

        for (int random = 1; random <= 5000; random++){

           int dice = 1 + randomGenerator.nextInt(6);

            System.out.print(dice);

            if(random % 5 == 0){
                System.out.println();
            }
        }

    }

}
