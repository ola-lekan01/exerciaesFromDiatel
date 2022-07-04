package chapter5;

import java.util.Scanner;

public class twelveDaysOfChristmasForLoops {

        public static void main(String[] args) {

            System.out.println("Twelve Days of Christmas Songs");

            int songDay;
            String days = " ";
            String message;

            Scanner input = new Scanner(System.in);

                System.out.println("Enter a day from 1 - 12 to print songs verses");
                songDay = input.nextInt();

            for(songDay = 1 ; songDay <= 12 ; songDay++) {

                    switch (songDay) {
                        case 12:
                            days = "twelfth";
                            break;
                        case 11:
                            days = "eleventh";
                            break;
                        case 10:
                            days = "tenth";
                            break;
                        case 9:
                            days = "ninth";
                            break;
                        case 8:
                            days = "eighth";
                            break;
                        case 7:
                            days = "seventh";
                            break;
                        case 6:
                            days = "sixth";
                            break;
                        case 5:
                            days = "fifth";
                            break;
                        case 4:
                            days = "forth";
                            break;
                        case 3:
                            days = "third";
                            break;
                        case 2:
                            days = "second";
                            break;
                        case 1:
                            days = "first";
                            break;
                    }
                    System.out.printf("On the %s day, of christmas, my true love sent to me %n", days);

                    switch (songDay) {
                        case 12:
                            message = "Twelve drummers drumming";
                            System.out.println(message);
                        case 11:
                            message = "I sent eleven pipers piping";
                            System.out.println(message);
                        case 10:
                            message = "Ten lords a-leaping,";
                            System.out.println(message);
                        case 9:
                            message = "Nine ladies dancing";
                            System.out.println(message);
                        case 8:
                            message = "Eight maids a-milking";
                            System.out.println(message);
                        case 7:
                            message = "Seven swans a-swimming";
                            System.out.println(message);
                        case 6:
                            message = "Six geese a-laying,";
                            System.out.println(message);
                        case 5:
                            message = "(Five golden rings.) Five golden rings";
                            System.out.println(message);
                        case 4:
                            message = "Four calling birds,";
                            System.out.println(message);
                        case 3:
                            message = "Three french hens";
                            System.out.println(message);
                        case 2:
                            message = "Two turtledoves";
                            System.out.println(message);
                        case 1:
                            message = "A partridge in a pear tree.";
                            System.out.println(message);
                        default:
                            break;
                    }
                    System.out.println();

            }
        }

}
