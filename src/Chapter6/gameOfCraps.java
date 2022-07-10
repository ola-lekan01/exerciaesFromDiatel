package Chapter6;

import java.security.SecureRandom;

public class gameOfCraps {
    public static void main(String[] args) {
        GameOfCraps();
    }
    private static final SecureRandom secureRandom = new SecureRandom();

    private enum Status{WIN , LOST , CONTINUE}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_ELEVEN = 11;
    private static final int BOX_CARS = 12;

    public static int rollingDice() {

        int firstDice = 0;
        int secondDice = 0;
        int sum = 0;

        for (int counter = 0; counter <= 1; counter++) {
            firstDice = 1 + secureRandom.nextInt(6);
            secondDice = 1 + secureRandom.nextInt(6);

            sum = firstDice + secondDice;
        }
        System.out.printf("The sum of the %d and the %d is %d%n%n" , firstDice , secondDice , sum);
        return sum;
    }

    public static void GameOfCraps() {
        Status gameStatus;
        int sumOfDice = rollingDice();
        int myPoint = 0;

        switch (sumOfDice) {
            case SNAKE_EYES, SEVEN -> gameStatus = Status.WIN;
            case YO_ELEVEN, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
            }
        }
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollingDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.CONTINUE;
            } else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }

            if (gameStatus == Status.CONTINUE) {
                System.out.println("Player Wins");
            } else {
                System.out.println("Player Lost");
            }
        }
    }

}
