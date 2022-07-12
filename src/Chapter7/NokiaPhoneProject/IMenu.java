package Chapter7.NokiaPhoneProject;

import java.util.Scanner;

public class IMenu {
    private static final Scanner input = new Scanner(System.in);
    private static int userInput;

    public static void menu (){
        subMenu();
        switch(userInput){
            case 1:
                phoneBook();
                break;
            case 2:
                messages();
                break;
            case 3:
                chats();
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                settings();
                break;
            case 7:
                callDivert();
                break;
            case 8:
                games();
            case 9:
                calculator();
            case 10:
                reminders();
            case 11:
                clock();
                break;
            case 12:
                profiles();
                break;
            case 13:
                simServices();
                break;
            default:
                menu();
        }
    }
    public static void subMenu() {
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n%s%n",
                    "Main Menu" ,
                    "\t1.     PhoneBook ",
                    "\t2.     Messages ",
                    "\t3.     Chats",
                    "\t4.     Call register",
                    "\t5.     Tones",
                    "\t6.     Settings",
                    "\t7.     Call Divert",
                    "\t8.     Games",
                    "\t9.     Calculator",
                    "\t10.    Remainder",
                    "\t11     Clock",
                    "\t12.    Profiles",
                    "\t13.    SIM Services",

                    "\t\tPress 0 to go back");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();
    }

   public static void phoneBook(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n" ,
                "PhoneBook",
                "\t1.     Search" ,
                "\t2.     Service Nos." ,
                "\t3.     Add name" ,
                "\t4.     Erase" ,
                "\t5.     Edit" ,
                "\t6.     Assign tone" ,
                "\t7.     Send b'card",
                "\t8.     Options" ,
                "\t9.     Speed dials " ,
                "\t10.    Voice tags" ,
                "\t\tPress 0 to go back to the previous menu");

       System.out.println(" ");
       System.out.print("Please Select an Option ");
       userInput = input.nextInt();

       switch (userInput){
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
               menu();
               break;
           case 8:
               phoneBookOptions();
       }
    }

   public  static void phoneBookOptions(){

        System.out.printf("%s%n%s%n%s%n%n%s",
                "PhoneBook Options" ,
                "\t1.  Type of View",
                "\t2.  Memory Status" ,
                "\t\tPress 0 to go back to the previous Menu");

       System.out.println(" ");
       System.out.print("Please Select an Option ");
       userInput = input.nextInt();

       switch (userInput){
           case 1:
               System.out.print("1.  Type Of View");
               break;
           default:
               phoneBook();
               break;
           case 2:
               System.out.println("2.  Memory Status");
       }
    }

   public static void messages(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n%s" ,
                "Messages" ,
                "\t1.     Write messages" ,
                "\t2      Inbox " ,
                "\t3.     Outbox" ,
                "\t4.     Picture Messages" ,
                "\t5.     Templates" ,
                "\t6.     Smileys" ,
                "\t7.     Message Settings" ,
                "\t8.     Info Services" ,
                "\t9.     Voice Mail Box" ,
                "\t10.    Service Command Editor" ,
                "\t\tPress 0 to go back to the previous Menu");

       System.out.println(" ");
       System.out.print("Please Select an Option ");
       userInput = input.nextInt();

       switch (userInput){
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
               menu();
               break;
           case 7:
               messagesOption();
       }
    }
    static void messagesOption(){
        System.out.printf("%s%n%s%n%s%n%n%s%n",
                "Messages Settings" ,
                "\t1.  Set 1",
                "\t2.  Common" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");

        userInput = input.nextInt();
        switch (userInput){
            case 1:
                messageOptionSet1();
            case 2:
                messageOptionCommon();
            default:
                messages();
        }
    }
    static void messageOptionSet1(){
        System.out.printf("%s%n%s%n%s%n%s%n%n%s%n",
                "Set 1" ,
                "\t1.  Message Centre Number",
                "\t2.  Message Sent as" ,
                "\t3.  Message Validity" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
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
                messages();
        }
    }
    static void messageOptionCommon(){
        System.out.printf("%s%n%s%n%s%n%s%n%n%s%n",
                "Common" ,
                "\t1.  Delivery Report",
                "\t2.  Report Via Same Centre" ,
                "\t3.  Character Support" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
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
               messages();
        }
    }
    public static void chats(){
        System.out.println("Chats");
    }
    static void callRegister(){
        System.out.printf( "%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n%s" ,
                "Call Register" ,
                "\t1.    Missed call" ,
                "\t2.    Received call" ,
                "\t3.    Dialled numbers" ,
                "\t4.    Erase recent calls" ,
                "\t5.    Show call duration" ,
                "\t6.    Show call cost" ,
                "\t7.    Call cost settings" ,
                "\t8.    Prepaid credit" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput) {
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
                callRegisterShowCallDuration();
                break;
            case 6:
                callRegisterShowCallCost();
                break;
            case 7:
                callRegisterShowCallCostSettings();
                break;
            case 8:
                System.out.println("Prepaid Credit");
                break;
            default:
                menu();
        }
    }
    static void callRegisterShowCallDuration(){

        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%n%s%n" ,
                "Show Call Duration" ,
                "\t1.    Last call duration" ,
                "\t2     All Calls duration" ,
                "\t3.    Received calls duration" ,
                "\t4.    Dialled calls duration" ,
                "\t5.    Clear times" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
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
                callRegister();
        }
    }

    static void callRegisterShowCallCost(){

        System.out.printf("%s%n%s%n%s%n%s%n%n%s%n" ,
                "Show Call Cost" ,
                "\t1.    Last call cost" ,
                "\t2.    All calls' cost" ,
                "\t3.    Clear counters" ,
                "\t\tPlease Press 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
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
                callRegister();
        }
    }
    static void callRegisterShowCallCostSettings(){
        System.out.printf("%s%n%s%n%s%n%n%s%n" ,
                "Show Call Cost Settings" ,
                "\t1.    Call cost limit" ,
                "\t2.    Show cost in" ,
                "\t\tPress 0 to go back to the previous Menu.");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
            case 1:
                System.out.println("Call cost limit");
                break;
            case 2:
                System.out.println("Show cost in");
                break;
            default:
                callRegister();
        }
    }

    public static void tones(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n%s%n" ,
                "Tones" ,
                "\t1. Ringing tone" ,
                "\t2. Ringing volume" ,
                "\t3  Incoming call alert" ,
                "\t4. Composer" ,
                "\t5. Message alert tone" ,
                "\t6. Keypad Tones" ,
                "\t7. Warning and game tones" ,
                "\t8. Vibrating alert" ,
                "\t9. ScreenSaver" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
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
                menu();
        }
    }
    public static void settings(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%n%s" ,
                "Settings" ,
                "\t1. Call settings" ,
                "\t2. Phone settings" ,
                "\t3. Security settings" ,
                "\t4. Restore factory settings" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
            case 1:
                callSettings();
            case 2:
                phoneSettings();
            case 3:
                securitySettings();
            case 4:
                System.out.println("Restore factory Settings");
            default:
                menu();
        }

    }
    public static void callSettings(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n%s%n" ,
                "Call Settings" ,
                "\t1. Automatic redial" ,
                "\t2. Speed dialing" ,
                "\t3. Call waiting option" ,
                "\t4. Own number sending " ,
                "\t5. Phone line in use" ,
                "\t6. Automatic answer" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
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
                settings();
        }
    }

    public static void phoneSettings(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n%s%n" ,
                "Phone Settings" ,
                "\t1. Language" ,
                "\t2. Cell info display" ,
                "\t3. Welcome note" ,
                "\t4. Network Selection " ,
                "\t5. Lights" ,
                "\t6. Confirm SIM services actions" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
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
                settings();
        }
    }
    public static void securitySettings(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n%s%n" ,
                "Security Settings" ,
                "\t1. PIN code request " ,
                "\t2. Call baring Services" ,
                "\t3. Fixed dialing " ,
                "\t4. Closed user group " ,
                "\t5. Phone security" ,
                "\t6. Change access codes" ,
                "\t\tPress 0 to go back to the previous Menu");

        System.out.println(" ");
        System.out.print("Please Select an Option ");
        userInput = input.nextInt();

        switch (userInput){
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
                settings();
            }
        }
    public static void callDivert(){
        System.out.println("Call Divert");
         }
    public static void games(){
        System.out.println("Games");
         }
         public static void calculator(){
             System.out.println("Calculator");
         }
    public static void reminders(){
        System.out.println("Reminders");
        }

        public static void clock(){
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n%s%n" ,
                    "Clock" ,
                    "\t1. Alarm Clock " ,
                    "\t2. Clock Settings" ,
                    "\t3. Date Settings " ,
                    "\t4. Stopwatch " ,
                    "\t5. Countdown timer" ,
                    "\t6. Auto update of date and time" ,
                    "\t\tPress 0 to go back to the previous Menu");

            System.out.println(" ");
            System.out.print("Please Select an Option ");
            userInput = input.nextInt();

            switch (userInput) {
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
                    menu();
            }
        }
    public static void profiles(){
        System.out.println("Profiles");
    }
    public static void simServices(){
        System.out.println("Sim Services");
    }
}