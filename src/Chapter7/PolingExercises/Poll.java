package Chapter7.PolingExercises;

import GeneralMethods.General;

public class Poll {
    static Poll poll = new Poll();
    private final String [] topics =
            {"Financial Issues", "Psychological Issues", "Gender Inequality", "Hunger Issues", "BreakFast Issues"};
    private int [][] responses = new int[5][10];
    private double averageRatings;
    public void getAverage(int... pollNumbers) {
        int total = 0;
        for(int pollNumber : pollNumbers) total += pollNumber;
        averageRatings = (double) total / pollNumbers.length;
    }

    public double getAverageRatings() {
        return averageRatings;
    }

    public String[] getTopics() {
        return topics;
    }

    public int[][] getResponses() {
        return responses;
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

    public void getReport(){
        General.displayStatus(String.format("\t\t%20d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        for (int row = 0; row < getResponses().length; row++) {
            System.out.printf("\t%20s", getTopics()[row]);
            for (int column = 0; column < getResponses()[row].length; column++) {
                System.out.printf("\t%d", getResponses()[row][column]);
            }

            System.out.println();
            System.out.println();
        }
    }
}