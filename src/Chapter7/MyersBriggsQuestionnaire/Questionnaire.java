package Chapter7.MyersBriggsQuestionnaire;

import java.util.Scanner;

public class Questionnaire {
    private static final Scanner input = new Scanner(System.in);
    private static int aCount = 0;
    private static int bCount = 0;

    private static int aCount1 = 0;
    private static int bCount1 = 0;

    private static int aCount2 = 0;
    private static int bCount2 = 0;

    private static int aCount3 = 0;
    private static int bCount3 = 0;

    private static String p1;
    private static String p2;
    private static String p3;
    private static String p4;

    static String[][] answers = new String[6][8];

    public static String getAnswer(){
        return input.nextLine();
    }

    static void questionnaire() {
        System.out.printf("%s%n%s%n%s        %s%n",
                "Choose only one Option as Applicable to you",
                "Select only A or B",
                "1.\tA.  expand energy, enjoy groups ",
                "B. Conserve energy, enjoy one-on-one");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[0][0] = "A";
                aCount++;
            }
            case "B" , "b" -> {
                answers[0][1] = "B";
                bCount++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");
        System.out.printf("%s%n%s        %s%n", "Select only A or B",
                "2\tA.  Interpret Literally ", "B. Look for meaning and possibilities");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[0][2] = "A";
                aCount1++;
            }
            case "B" , "b" -> {
                answers[0][3] = "B";
                bCount1++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");


        System.out.printf("%s%n%s        %s%n", "Select only A or B",
                "3\tA.  Logical Thinking, Questioning ", "B. Empathetic feeling and Accommodating");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[0][4] = "A";
                aCount2++;
            }
            case "B" , "b" -> {
                answers[0][5] = "B";
                bCount2++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B",
                "4\tA.  Organized, Orderly ", "B. Flexible and Adaptable");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[0][6] = "A";
                aCount3++;
            }
            case "B" , "b" -> {
                answers[0][7] = "B";
                bCount3++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");


        System.out.printf("%s%n%s        %s%n", "Select only A or B",
                "5\tA.  More Outgoing, Think out Loud ", "B. More reserved, Think to yourself");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[1][0] = "A";
                aCount++;
            }
            case "B" , "b" -> {
                answers[1][1] = "B";
                bCount++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");


        System.out.printf("%s%n%s        %s%n", "Select only A or B",
                "6\tA.  Practical Realistic Experimental ", "B. Imaginative, Innovative and Theoretical");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[1][2] = "A";
                aCount1++;
            }
            case "B" , "b" -> {
                answers[1][3] = "B";
                bCount1++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");


        System.out.printf("%s%n%s        %s%n", "Select only A or B",
                "7\tA.  Candid, Straight forward, Frank ", "B. Tactful, Kind, Encouraging");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[1][4] = "A";
                aCount2++;
            }
            case "B" , "b" -> {
                answers[1][5] = "B";
                bCount2++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");


        System.out.printf("%s%n%s        %s%n", "Select only A or B",
                "8\tA.  Plan, Schedule ", "B. Unplanned Spontaneous");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[1][6] = "A";
                aCount3++;
            }
            case "B" , "b" -> {
                answers[1][7] = "B";
                bCount3++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "9\tA.  Seek Many Task, Public Activities, Interaction with Others ",
                "B. Seek Private, Solitary activities with quiet to concentrate");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[2][0] = "A";
                aCount++;
            }
            case "B" , "b" -> {
                answers[2][1] = "B";
                bCount++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "10\tA.  Standard, Usual, Conventional ",
                "B. Different, Novel, Unique");
        switch (getAnswer()) {
            case "A", "a" -> {
                answers[2][2] = "A";
                aCount1++;
            }
            case "B", "b" -> {
                answers[2][3] = "B";
                bCount1++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "11\tA.  Firm Tend to Criticize ",
                "B. Seek Private, Solitary activities with quiet to concentrate");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[2][4] = "A";
                aCount2++;
            }
            case "B" -> {
                answers[2][5] = "B";
                bCount2++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "12\tA.  Regulated, Structured ",
                "B. easygoing, Live and Let live");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[2][6] = "A";
                aCount3++;
            }
            case "B" , "b" -> {
                answers[2][7] = "B";
                bCount3++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "13\tA.  External Communicative, Express yourself ",
                "B. Internal, ");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[3][0] = "A";
                aCount++;
            }
            case "B" , "b" -> {
                answers[3][1] = "B";
                bCount++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "14\tA.  Focus on Here and Now ",
                "B. Look to the Future, Global Perspective, Big Picture ");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[3][2] = "B";
                aCount1++;
            }
            case "B" , "b" -> {
                answers[3][3] = "B";
                bCount1++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");


        System.out.printf("%s%n%s        %s%n", "Select only A or B", "15\tA.  Tough Minded, Just ",
                "B. Tender-Hearted, Merciful");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[3][4] = "A";
                aCount2++;
            }
            case "B" , "b" -> {
                answers[3][5] = "B";
                bCount2++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "16\tA. Preparation, Plan Ahead ",
                "B. Go with the flow, Adapt as you go");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[3][6] = "A";
                aCount3++;
            }
            case "B" , "b" -> {
                answers[3][7] = "B";
                bCount3++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "17\tA.  Active, Initiate ",
                "B.Reflective, Deliberate");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[4][0] = "A";
                aCount++;
            }
            case "B" , "b" -> {
                answers[4][1] = "B";
                bCount++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");


        System.out.printf("%s%n%s        %s%n", "Select only A or B", "18\tA.  Facts, Things, What-is ",
                "B. Ideas, Dreams, What Could be; Philosophical");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[4][2] = "A";
                aCount1++;
            }
            case "B" , "b" -> {
                answers[4][3] = "B";
                bCount1++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "19\tA.  Matter Of Fact, Issue Oriented ",
                "B. Sensitive, People Oriented, Compassionate");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[4][4] = "A";
                aCount2++;
            }
            case "B" , "b" -> {
                answers[4][5] = "B";
                bCount2++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        System.out.printf("%s%n%s        %s%n", "Select only A or B", "20\tA.  Control, Govern ",
                "B. Latitude, Freedom");
        switch (getAnswer()) {
            case "A" , "a" -> {
                answers[4][6] = "A";
                aCount3++;
            }
            case "B" , "b" -> {
                answers[4][7] = "B";
                bCount3++;
            }
        }
        System.out.printf("=================================================================================================================================%n%n");

        personalityChecker();
    }
        public static void personalityChecker() {
            if (aCount > bCount) {
                p1 = " You are an Extroverted person,  ";
            } else {
                p1 = "You are an Introverted person,  ";
            }

            if (aCount1 > bCount1) {
                p2 = "Sensing, ";
            } else {
                p2 = "Intuitive, ";
            }

            if (aCount2 > bCount2) {
                p3 = "Thinking, ";
            } else {
                p3 = "Feeling, ";
            }

            if (aCount3 > bCount3) {
                p4 = "and Judgemental";
            } else {
                p4 = "and Perceiving";
            }

            System.out.printf("Your Personality is: %s%s%s%s" , p1, p2, p3, p4);

        }
}