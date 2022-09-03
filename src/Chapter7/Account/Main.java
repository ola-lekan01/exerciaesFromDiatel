package Chapter7.Account;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Bank lakesBank = new Bank();
    static String accountName;
    static String accountPin;
    static int amount;

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
            }
        } catch (InvalidInputException exception) {
            displayStatus(exception.getMessage());
            openPage();
        }
    }
    private static void checkBalance() {
        accountName = input("Enter Account Name: ");
        String pin = input("Enter you pin to check balance: ");
        int balance = lakesBank.findAccountName(accountName).getBalance(pin);
        displayStatus(String.format("Your Balance is %d", balance));
        backMenu();
    }

    private static void bankTransfer() {
        String sendersAccountNumber =input("Enter your Account Number: ");
        String receiverAccountNumber =input("Enter Receiver's Account Number: ");
        String pin = input("Enter Receiver's Account Number: ");
        int amount = inputInt("Enter Amount to transfer");

        lakesBank.transfer(sendersAccountNumber,receiverAccountNumber,amount,pin);
        int balance = lakesBank.findAccountName(accountName).getBalance(accountPin);
        displayStatus(String.format("You have Successfully transferred %d to %s your new account balance is %d", amount, receiverAccountNumber, balance));
        backMenu();
    }

    private static void withdraw() {
        try {
            lakesBank.withdraw(amount = inputInt("Enter withdrawal Amount: "), input("Enter Account Number: "), input("Enter Password:"));
        } catch (InvalidPinException exception) {
            displayStatus(exception.getMessage());
            withdraw();
        }
        int balance = lakesBank.findAccountName(accountName).getBalance(accountPin);
        displayStatus(String.format("You have Successfully Withdrawn %d", amount));
        displayStatus(String.format("Your new Account balance is %d", balance));

        backMenu();
    }

    private static void mainDeposit() {
        String accountNumber = input("Enter Your Account Number: ");
        int amount = inputInt("Enter Amount: ");

        try {
            lakesBank.deposit(amount, accountNumber);
        }
        catch (InvalidAmountException e) {
            displayStatus(e.getMessage());
            mainDeposit();
        }
        int balance = lakesBank.findAccountName(accountName).getBalance(accountPin);
        displayStatus(String.format("You have Successfully deposited %d to %s your new account balance is %d", amount, accountNumber, balance));

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
        System.out.println(prompt);
        return sc.nextLine();
    }

    public static void backMenu(){
        System.out.println( """
                1.  Go back to the Previous Menu
                2.  Exit the System
                """);
        String subs = sc.nextLine();
        switch (subs){
            case "1": openPage();
            case "2": exit(2);
        }
    }
    private static int inputInt(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }
}
