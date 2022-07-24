package Chapter7.Diary;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Diary {

    public static void main(String[] args) {
        landingPage();
    }

    static ArrayList<String>  diaryItems = new ArrayList<>();
    static ArrayList<String> dateOfEntry = new ArrayList<>();
    public static Date date = new Date();
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd : hh:mm:ss");
    public static final Scanner input = new Scanner(System.in);
    public static int index;
    public static int index2;
    public static int modify;

    public static int getInput(){
        return input.nextInt();
    }
    public static String getNextLine(){
        return input.nextLine();
    }
    public static String getDate(){
        return simpleDateFormat.format(date);
    }
    public static void doubleLine(){
        for (index2 = 0; index2 < 70 ; index2++) {
            System.out.print("=");
        }
        System.out.println(" ");
    }

    public static void singleLine(){
        for (index2 = 0; index2 < 70 ; index2++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }

    public static void landingPage(){
        System.out.println("""
                Enter 12345 as Default Password to Open Diary
                """);
        if (getInput() == 12345) {
                digital_Diary();
            } else {
                landingPage();
            }
        }
    public static void digital_Diary(){
        System.out.println("""
                1.  To add new Content to your Diary Press (1)
                2.  To view your Diary Entries press (2)
                3.  To delete Content from Diary press (3)
                4.  To Modify your previously saved entry press (4)
                5.  To Exit the Application press (5)
                """);
        switch (getInput()) {
            case 1 -> diary_Log();
            case 2 -> view_Diary_Log();
            case 3 -> delete_From_Log();
            case 4 -> modify_Diary_Log();
            default -> exit_Diary();
        }
    }

    public static void getUpDate(){
        System.out.println("Date and Time of Entry: " + getDate());
    }
    public static void diary_Log(){
        getUpDate();
        System.out.println("Enter Content to be written into Diary");
        getNextLine();
        diaryItems.add(getNextLine());
        dateOfEntry.add(simpleDateFormat.format(date));

        System.out.println("""
                Diary Updated Successfully.
                1. To Enter a new Content Press (1)
                2. To go back to the previous Menu (2)
                3. To Exit press (0)
                """);
        switch (getInput()) {
            case 1 -> diary_Log();
            case 2 -> digital_Diary();
            default -> exit_Diary();
        }
    }
    public static void view_Diary_Log(){
        for(index = 0; index < diaryItems.size(); index++) {
            singleLine();
            System.out.printf("%s%d%n%s%s%n%s%n%s%n" ,"Entry: ", index + 1 , "Date: " , dateOfEntry.get(index), "Message" , diaryItems.get(index));
            doubleLine();
        }
    }
    public static void delete_From_Log(){
        view_Diary_Log();
        System.out.println("""
                Please select the Entry Number to be deleted form your Diary Log.
                """);
        modify = input.nextInt();
        diaryItems.remove(modify - 1);
        dateOfEntry.remove(modify -1);

        System.out.println("""
                Diary Updated Successfully.
                1. To Delete a new Content Press (1)
                2. To go back to the previous Menu (2)
                3. To Exit press (0)
                """);
        switch (getInput()) {
            case 1 -> delete_From_Log();
            case 2 -> digital_Diary();
            default -> exit_Diary();
        }
    }
    public static void modify_Diary_Log(){
        view_Diary_Log();
        System.out.println("""
                Please select the Entry Number to be Modified form your Diary Log.
                """);
        modify = input.nextInt();
        diaryItems.remove(modify - 1);

        System.out.println("Enter Modified Content to be written into Diary");
        getNextLine();
        diaryItems.add(modify -1, getNextLine());
        System.out.println("""
                Diary Updated Successfully.
                1. To Modify a new Content Press (1)
                2. To go back to the previous Menu (2)
                3. To Exit press (0)
                """);
        switch (getInput()) {
            case 1 -> modify_Diary_Log();
            case 2 -> digital_Diary();
            default -> exit_Diary();
        }
    }
    public static void exit_Diary(){
        System.out.println("GoodBye and, Enjoy the rest of your day!!!");
    }
}
