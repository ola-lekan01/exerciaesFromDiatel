package chapter5;

import java.util.Scanner;

public class NokiaPhone {
    public static void main(String[] args){
        int menu;

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n" ,
                "1.     PhoneBook " ,
                "2.     Messages " ,
                "3.     Chats",
                "4.     Call register",
                "5.     Tones" ,
                "6.     Settings" ,
                "7.     Call Divert" ,
                "8.     Games",
                "9.     Calculator" ,
                "10.    Remainder" ,
                "11     Clock" ,
                "12.    Profiles" ,
                "13.    SIM Services");

        System.out.println("");
        System.out.print("Please Select an option to Continue: ");
        menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n" ,
                        "1.     Search" ,
                        "2.     Service Nos." ,
                        "3.     Add name" ,
                        "4.     Erase" ,
                        "5.     Edit" ,
                        "6.     Assign tone" ,
                        "7.     Send b'card",
                        "8.     Options" ,
                        "9.     Speed dials " ,
                        "10.    Voice tags");

                System.out.println("");
                System.out.print("Please Select an option to Continue: ");
                int menuCase1PhoneBook = input.nextInt();

                switch (menuCase1PhoneBook){
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos");
                        break;
                    case 3:
                        System.out.println("Add Name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        break;
                    default:
                        System.out.println("Incorrect Input");
                        break;
                    case 8:
                        System.out.printf("%s%n%s%n" ,
                                "1.  Type of View" ,
                                "2.  Memory Status");

                        System.out.println("");

                        System.out.print("Please Select an option to Continue: ");

                        int menuCase1PhoneBookOptions = input.nextInt();
                        switch (menuCase1PhoneBookOptions){
                            case 1:
                                System.out.print("1.  Type Of View");
                                break;
                            default:
                                System.out.println("Incorrect Input");
                                break;
                            case 2:
                                System.out.println("2.  Memory Status");
                        }
                }
                break;
            case 2:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n" ,
                        "1.     Write messages" ,
                        "2      Inbox " ,
                        "3.     Outbox" ,
                        "4.     Picture Messages" ,
                        "5.     Templates" ,
                        "6.     Smileys" ,
                        "7.     Message Settings");

                System.out.println(" ");
                System.out.print( "Please Select an Option ");
                    int menuCase2Messages = input.nextInt();

                     switch (menuCase2Messages) {
                         case 1:
                             System.out.println("Write message");
                             break;
                         case 2:
                             System.out.println("Inbox");
                             break;
                         case 4:
                             System.out.println("Picture message");
                             break;
                         case 3:
                             System.out.println("Outbox");
                             break;
                         case 5:
                             System.out.println("Templates");
                             break;
                         case 6:
                             System.out.println("Smileys");
                             break;
                         case 8:
                             System.out.println("Info Service");
                             break;
                         case 9:
                             System.out.println("Voice mailbox number");
                         case 10:
                             System.out.println("Service command editor");
                             break;
                         default:
                             System.out.println("Incorrect Entry");
                             break;
                         case 7:
                             System.out.printf("%s%n%s%n%s%n%s%n",
                                     "1.    Set 1",
                                     "2.    Common");

                             System.out.println(" ");
                             System.out.print("Please Select an Option ");
                             int menuCase2MessagesSettings = input.nextInt();

                             switch (menuCase2MessagesSettings) {
                                 case 1:
                                     System.out.printf("%s%n%s%n%s%n",
                                             "1.    Message centre number",
                                             "2.    Message sent as",
                                             "3.    Message validity");

                                     System.out.println(" ");
                                     System.out.print("Please Select an Option ");
                                     int menuCase2MessagesSettingsSet1 = input.nextInt();

                                     switch (menuCase2MessagesSettingsSet1) {
                                         case 1:
                                             System.out.println("Message centre Number");
                                             break;
                                         case 2:
                                             System.out.println("Message Sent as");
                                             break;
                                         case 3:
                                             System.out.println("Message validity");
                                             break;
                                         default:
                                             System.out.println("Unrecognized Input");
                                     }
                                     break;

                                 case 2:
                                     System.out.printf("%s%n%s%n%s%n",
                                             "1.    Delivery report ",
                                             "2.    Reply via same centre",
                                             "3.    Character Support");

                                     System.out.println(" ");
                                     System.out.print("Please Select an Option ");
                                     int menuCase2MessagesSettingsCommon = input.nextInt();

                                     switch (menuCase2MessagesSettingsCommon) {
                                         case 1:
                                             System.out.println("Delivery report");
                                             break;
                                         case 2:
                                             System.out.println("Reply via same centre");
                                             break;
                                         case 3:
                                             System.out.println("Character Support");
                                             break;
                                         default:
                                             System.out.println("Unrecognized Input");
                                        }
                                     break;
                                }
                            }
            case 3:
                System.out.println("Chats");
                break;

            case 4:
                System.out.printf( "%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n" ,
                        "1.    Missed call" ,
                        "2.    Received call" ,
                        "3.    Dialled numbers" ,
                        "4.    Erase recent calls" ,
                        "5.    Show call duration" ,
                        "6.    Show call cost" ,
                        "7.    Call cost settings" ,
                        "8.    Prepaid credit");

                System.out.println(" ");
                System.out.print("Please Select an Option ");
                int menuCase4CallRegister = input.nextInt();
                switch (menuCase4CallRegister){

                    case 1:
                        System.out.println("Missed call");
                        break;

                    case 2:
                        System.out.println("Received call");
                        break;

                    case 3:
                        System.out.println("Dialled number");
                        break;

                    case 4:
                        System.out.println("Erase recent call list");
                        break;
                    case 5:
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n" ,
                                "1.    Last call duration" ,
                                "2     All Calls duration" ,
                                "3.    Received calls duration" ,
                                "4.    Dialled calls duration" ,
                                "5.    Clear times");

                        System.out.println(" ");
                        System.out.print("Please Select an Option ");
                        int menuCase4CallRegisterShowCallDuration = input.nextInt();

                        switch (menuCase4CallRegisterShowCallDuration){
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls duration");
                                break;
                            case 3:
                                System.out.println("Received calls duration");
                                break;
                            case 4:
                                System.out.println("Dialled calls duration");
                                break;
                            case 5:
                                System.out.println("Clear timers");
                                break;
                            default:
                                System.out.println("Unrecognized Input");
                        }
                        break;

                    case 6:
                        System.out.printf("%s%n%s%n%s%n" ,
                                "1.    Last call cost" ,
                                "2.    All calls' cost" ,
                                "3.    Clear counters");

                        System.out.println(" ");
                        System.out.print("Please Select an Option ");
                        int menuCase4CallRegisterShowAllCallCost = input.nextInt();

                        switch (menuCase4CallRegisterShowAllCallCost){
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.println("All calls' cost ");
                                break;
                            case 3:
                                System.out.println("Clear counters");
                                break;
                            default:
                                System.out.println("Unrecognized Input");
                        }
                        break;
                    case 7:
                        System.out.printf("%s%n%s%n" ,
                                "1.    Call cost limit" ,
                                "2.    Show cost in");
                        System.out.println(" ");
                        System.out.print("Please Select an Option ");
                        int menuCase4CallRegisterCallCostSettings = input.nextInt();

                        switch (menuCase4CallRegisterCallCostSettings){
                            case 1:
                                System.out.println("Call cost limit");
                                break;

                            case 2:
                                System.out.println("Show cost in");
                                break;

                            default:
                                System.out.println("Unrecognized input");
                        }
                        break;
                    case 8:
                        System.out.println("Prepaid credit");
                        break;

                    default:
                        System.out.println("Unrecognized Input");
                }
                break;

            case 5:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n" ,
                        "1. Ringing tone" ,
                        "2. Ringing volume" ,
                        "3  Incoming call alert" ,
                        "4. Composer" ,
                        "5. Message alert tone" ,
                        "6. Keypad Tones" ,
                        "7. Warning and game tones" ,
                        "8. Vibrating alert" ,
                        "9. ScreenSaver");

                System.out.println(" ");
                System.out.print("Please Select an Option ");
                int menuCase3Tones = input.nextInt();
                switch (menuCase3Tones){
                    case 1:
                        System.out.println("Ringing tone");
                        break;
                    case 2:
                        System.out.println("Ringing Volume ");
                        break;
                    case 3:
                    System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("Warning and game tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                    default:
                        System.out.println("Unrecognized Input");
                } break;

            case 6:
                System.out.printf("%s%n%s%n%s%n%s%n" ,
                        "1. Call settings" ,
                        "2. Phone settings" ,
                        "3. Security settings" ,
                        "4. Restore factory settings");

                System.out.println(" ");
                System.out.print("Please Select an Option ");
                int menuCase6Settings = input.nextInt();

                switch (menuCase6Settings) {
                    case 1:
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n" ,
                                "1. Automatic redial" ,
                                "2. Speed dialing" ,
                                "3. Call waiting option" ,
                                "4. Own number sending " ,
                                "5. Phone line in use" ,
                                "6. Automatic answer");

                        System.out.println(" ");
                        System.out.print("Please Select an Option ");
                        int menuCase6SettingsCallSettings = input.nextInt();

                        switch (menuCase6SettingsCallSettings){
                            case 1:
                                System.out.println("Automatic redial");
                                break;
                            case 2:
                                System.out.println("Speed dialing");
                                break;
                            case 3:
                                System.out.println("Call waiting options");
                                break;
                            case 4:
                                System.out.println("Own number sending ");
                                break;
                            case 5:
                                System.out.println("Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answer");
                            default:
                                System.out.println("Unrecognized input");
                        }
                        break;

                    case 2:
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n" ,
                                "1. Language" ,
                                "2. Cell info display" ,
                                "3. Welcome note" ,
                                "4. Network Selection " ,
                                "5. Lights" ,
                                "6. Confirm SIM services actions");

                        System.out.println(" ");
                        System.out.print("Please Select an Option ");
                        int menuCase6SettingsPhoneSettings = input.nextInt();

                        switch (menuCase6SettingsPhoneSettings){
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell info display");
                                break;
                            case 3:
                                System.out.println("Welcome note");
                                break;
                            case 4:
                                System.out.println("Network selection");
                                break;
                            case 5:
                                System.out.println("Lights");
                                break;
                            case 6:
                                System.out.println("Confirm SIM service actions");
                                break;
                            default:
                                System.out.println("Unrecognized input");
                        }
                        break;
                    case 3:
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n" ,
                                "1. PIN code request " ,
                                "2. Call baring Services" ,
                                "3. Fixed dialing " ,
                                "4. Closed user group " ,
                                "5. Phone security" ,
                                "6. Change access codes");

                        System.out.println(" ");
                        System.out.print("Please Select an Option ");
                        int menuCase6SettingsSecuritySettings = input.nextInt();

                        switch (menuCase6SettingsSecuritySettings) {
                            case 1:
                                System.out.println("PIN code request");
                                break;

                            case 2:
                                System.out.println("Call baring services");
                                break;

                            case 3:
                                System.out.println("Fixed dialing ");
                                break;

                            case 4:
                                System.out.println("Closed user group");
                                break;

                            case 5:
                                System.out.println("Phone security ");
                                break;

                            case 6:
                                System.out.println("Change access codes");
                                break;

                            default:
                                System.out.println("Unrecognized input");
                        }
                        break;
                    case 4:
                        System.out.println("Restore Factory Settings");
                }
                break;

            case 7:
                System.out.println("Call divert");
                break;

            case 8:
                System.out.println("Games");
                break;

            case 9:
                System.out.println("Calculator ");
                break;

            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n" ,
                        "1. Alarm Clock " ,
                        "2. Clock Settings" ,
                        "3. Date Settings " ,
                        "4. Stopwatch " ,
                        "5. Countdown timer" ,
                        "6. Auto update of date and time");

                System.out.println(" ");
                System.out.print("Please Select an Option ");
                int menuCase11Clock = input.nextInt();

                switch (menuCase11Clock) {
                    case 1:
                        System.out.println("Alarm CLock");
                        break;

                    case 2:
                        System.out.println("Clock Settings");
                        break;

                    case 3:
                        System.out.println("Date Settings");
                        break;

                    case 4:
                        System.out.println("Stopwatch");
                        break;

                    case 5:
                        System.out.println("Countdown timer");
                        break;

                    case 6:
                        System.out.println("Auto update of date and time");
                        break;

                    default:
                        System.out.println("Unrecognized input");
                }
                break;

            case 12:
                System.out.println("Profiles");
                break;

            case 13:
                System.out.println("SIM Services");
                break;

            default:
                System.out.println("Unrecognized Input");
        }
    }
}