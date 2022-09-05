package Chapter7.Account;

public class Bank {
    private int numberOfCustomers;
    private Account [] accounts = new Account[10];

    public void createAccountFor(String accountName, String pin) {
        Account account = new Account((numberOfCustomers+1)+"", accountName, pin);
        accounts[numberOfCustomers] = account;
        numberOfCustomers++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomers;
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            boolean isValidAccountNumber = account.getAccountNumber().equals(accountNumber);
            if (isValidAccountNumber) return account;
        }
        throw new NullPointerException("Account Number Not Found");
    }

    public Account findAccountName(String accountName) {
        for (Account account : accounts) {
            boolean isValidAccountName = account.getName().equals(accountName);
            if (isValidAccountName) return account;
        }
        throw new NullPointerException("Account Name Not Found");
    }

    public void deposit(int deposit, String accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(deposit);
    }

    public void withdraw(int amount, String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        account.getBalance(accountNumber);
        account.withdraw(amount,pin);
    }

    public void transfer(String senderAccountNumber, String receiverAccountNumber, int amount, String pin) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);

        senderAccount.withdraw(amount, pin);
        receiverAccount.deposit(amount);
    }
}