package Chapter7.Account;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Bank lakesBank = new Bank();
    static String accountName;
    static String accountPin;
    static int amount;
    static String receiver;
    static String senders;

    public static void main(String[] args) {
        openPage();
    }

    public static void openPage(){
        try {
            System.out.println("Welcome to Lakes Micro Finance Bank");
            String mainMenu = """
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Exit
                """;

            switch (input(mainMenu)){
                case "1" -> createAccount();
                case "2" -> mainDeposit();
                case "3" -> withdraw();
                case "4" -> bankTransfer();
                case "5" -> checkBalance();
                case "6" -> exit(6);
                default -> openPage();
            }
        } catch (InvalidInputException exception) {
            displayStatus(exception.getMessage());
            openPage();
        }
    }
    private static void checkBalance() {
        try{
            String accountNumber = input("Enter Account Number: ");
            String pin = input("Enter you pin to check balance: ");
            int balance = lakesBank.findAccount(accountNumber).getBalance(pin);
            displayStatus(String.format("Your Balance is %d", balance));
            backMenu();

        } catch (InvalidPinException | NoAccountNameFoundException exception) {
            displayStatus(exception.getMessage());
            checkBalance();
        }

    }

    private static void bankTransfer() {
        try{
            String sendersAccountNumber =input("Enter your Account Number: ");
            String receiverAccountNumber =input("Enter Receiver's Account Number: ");
            String pin = input("Enter Your Transfer Pin: ");
            amount = inputInt("Enter Amount to transfer");
            System.out.printf("Initiating transfer of %d to %s", amount, lakesBank.findAccount(receiverAccountNumber).getName());
            String confirmTransaction = ("""
                    Confirm Transaction:
                    1. To Complete Transaction
                    2. To abort Transaction and go back to main menu
                    3. To Exit
                    """);
            switch (input(confirmTransaction)){
                case "1" -> lakesBank.transfer(sendersAccountNumber,receiverAccountNumber,amount,pin);
                default -> openPage();
                case "3" -> exit(3);
            }

            receiver = receiverAccountNumber;
            senders = sendersAccountNumber;

        } catch (InvalidPinException | InvalidAmountException | NoAccountNameFoundException exception) {
            displayStatus(exception.getMessage());
            bankTransfer();
        }
        int balance = lakesBank.findAccount(senders).getBalance(accountPin);
        displayStatus(String.format("You have Successfully transferred %d to %s your new account balance is %d", amount, lakesBank.findAccount(receiver).getName(), balance));
        backMenu();
    }

    private static void withdraw() {
        try {
            lakesBank.findAccount(input("Enter Account Number: ")).withdraw(amount = inputInt("Enter withdrawal Amount: "), input("Enter Password:"));
        } catch (InvalidPinException | InvalidAmountException exception) {
            displayStatus(exception.getMessage());
            withdraw();
        }
        int balance = lakesBank.findAccountName(accountName).getBalance(accountPin);
        displayStatus(String.format("You have Successfully Withdrawn %d", amount));
        displayStatus(String.format("Your new Account balance is %d", balance));

        backMenu();
    }

    private static void mainDeposit() {
        try {
            String accountNumber = input("Enter Your Account Number: ");
            amount = inputInt("Enter Amount: ");
            lakesBank.deposit(amount, accountNumber);
        }
        catch (InvalidAmountException | NoAccountNameFoundException | NullPointerException exception) {
            displayStatus(exception.getMessage());
            mainDeposit();
        }
        int balance = lakesBank.findAccountName(accountName).getBalance(accountPin);
        displayStatus(String.format("You have Successfully deposited %d your new account balance is %d", amount, balance));
        backMenu();
    }

    private static void createAccount() {
        accountName = input("Enter Your account Name: ");
        accountPin = input("Enter Your Account Pin");
        lakesBank.createAccountFor(accountName,accountPin);

        displayStatus(String.format("Account Created for %s", accountName));
        displayStatus(String.format("Your account Number is %s", lakesBank.findAccountName(accountName)));
        displayStatus(String.format("Thank you %s for creating an account with Lakes Bank", accountName));

        backMenu();
    }
    private static void displayStatus(String message) {
        System.out.println(message);
    }
    private static String input(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }

    public static void backMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println( """
                1.  Go back to the Previous Menu
                2.  Exit the System
                """);
        String subs = input.nextLine();
        switch (subs){
            case "1": openPage();
            case "2": exit(2);
            default: bankTransfer();
        }
    }
    private static int inputInt(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextInt();
    }
}
