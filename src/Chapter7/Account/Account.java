package Chapter7.Account;
public class Account {
    private int balance;
    private String pin;
    private String accountName;
    private String accountNumber;
    public Account(String accountNumber, String accountName, String pin){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance(String pin) {
        if(pin.equals(this.pin)) return balance;
        return 0;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int deposit) {
        if (deposit > 0) {
            this.balance = balance + deposit;
        }
    }
    public void withdraw(int withdrawalAmount, String pin) {
        if(withdrawalAmount <= this.balance && pin.equals(this.pin)){
            this.balance = getBalance(pin) - withdrawalAmount;
        }
    }
}
