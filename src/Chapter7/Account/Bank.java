package Chapter7.Account;

public class Bank {

    private int numberOfCustomers;

    private Account [] accounts = new Account[10];

    private String name;
    public void createAccountFor(String accountName, String pin) {
        this.name = accountName;
        numberOfCustomers++;
    }
    public int getNumberOfCustomer() {
        return numberOfCustomers;
    }
    public Account findAccount(String accountNumber){
        return null;
    }

    public String getName() {
        return name;
    }
}
