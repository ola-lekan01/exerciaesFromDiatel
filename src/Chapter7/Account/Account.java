package Chapter7.Account;
public class Account {

    //given: Setting up a precondition before carrying out a test
    private int balance;
    private String pin;
    private String accountName;
    private String accountNumber;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public Account(String accountNumber, String accountName, String pin){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
    public int getBalance(String pin) {
        if(isCorrect(pin)) return balance;
        return 0;
    }
    public void deposit(int depositAmount) {
        boolean isValid = depositAmount > 0;
        if (isValid) {
            this.balance = balance + depositAmount;
        }
    }
    public void withdraw(int withdrawalAmount, String pin) {
        if(withdrawalAmount > 0 && withdrawalAmount <= this.balance && isCorrect(pin)){
            this.balance = getBalance(pin) - withdrawalAmount;
        }
    }
    private boolean isCorrect(String pin){
        return (pin.equals(this.pin));
    }

    public String getName() {
        return accountName;
    }
}