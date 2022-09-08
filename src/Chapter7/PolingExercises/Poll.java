package Chapter7.PolingExercises;

import java.util.Scanner;

public class Poll {
    static Poll poll = new Poll();
    private final String [] issues =
            {"Financial Issues", "Psychological Issues", "Gender Inequality", "Hunger Issues", "BreakFast Issues"};
    private final int [][] responses = new int[5][10];

    public int getAverage(int [] pollNumbers) {
        int total = 0;
        for (int array : pollNumbers) {
            total += array;
        }
        return total / pollNumbers.length;
    }

    public int getHighestRatings(int[] pollNumbers) {
        int highestNumber = Integer.MIN_VALUE;
        for (int array : pollNumbers) {
            if(array > highestNumber) highestNumber = array;
        }
        return highestNumber;
    }

    public int getLowestRatings(int[] pollNumbers) {
        int lowestNumber = Integer.MAX_VALUE;
        for (int array : pollNumbers) {
            if(array < lowestNumber) lowestNumber = array;
        }
        return lowestNumber;
    }
}