package Chapter7.PolingExercises;

import GeneralMethods.*;

import java.util.Scanner;

public class MainPoll {
    static Poll poll = new Poll();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        General.displayStatus("Welcome to UniCorns Poll");

        System.out.println("Enter Your Ratings as applied to the topics ");

        var response = "yes";
        while (response.equals("yes")) {
            int numberOfTopics = poll.getTopics().length;
            for (int issueNumber = 0; issueNumber < numberOfTopics; issueNumber++) {
                int userRatings = General.inputInt(String.format("%d. Topic: %s" , issueNumber + 1, poll.getTopics()[issueNumber]));
                if (userRatings < 0 || userRatings >= 11)
                    throw new UserFitBeKapiException("Invalid Response abeg try again");
                saveRating(issueNumber,userRatings);
            }
            System.out.println("Would you like to record another Response");
            response = sc.next();
        }
        poll.getReport();
    }

    private static void saveRating(int issueNumber, int userRating){
        poll.getResponses()[issueNumber][userRating - 1] += 1;
    }
}