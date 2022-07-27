package Chapter7;

import java.security.SecureRandom;

public class ArcheryGame {
    private static int[][] playerScores = new int[4][3];
    private static int [] totals = new int[4];
    private static final SecureRandom numbers = new SecureRandom();

    public static void main(String[] args) {
        firstChance();
        secondChance();
        thirdChance();
        resultTable();
    }

    public static void firstChance(){
        int chances;
        for (int i = 0; i < playerScores.length; i++) {
            chances = numbers.nextInt(10);
            playerScores[i][0] = chances;
        }
    }

    public static void secondChance(){
        int chances;
        for (int i = 0; i < playerScores.length; i++) {
            chances = numbers.nextInt(10);
            playerScores[i][1] = chances;
        }
    }

    public static void thirdChance(){
        int chances;
        for (int i = 0; i < playerScores.length; i++) {
            chances = numbers.nextInt(10);
            playerScores[i][2] = chances;
        }
    }

    public static void resultTable(){
        int total = 0;
        System.out.printf("%30s%20s%20s%20s%n", "First Chance" , "Second Chance" , "Third Chance" , "Total");
        for (int i = 0; i < playerScores.length; i++) {
            System.out.printf("%s%d" ,  "Player " , i + 1);
            for (int j = 0; j < playerScores[i].length; j++) {
                System.out.printf("%20s" , playerScores[i][j]);
                total += playerScores[i][j];
                totals[i] = total;
            }
            System.out.printf("%20d" , total);

            System.out.println();
        }
        System.out.printf("The Player %d Wins the Game" , winner());
    }

    public static int winner(){
        int index;
        int max = Integer.MIN_VALUE;
        int winner = 0;
        for (index = 0; index < totals.length; index++) {
            if (totals[index] > max){
                winner = totals[index];
            }
        }
        return index;
    }
}
