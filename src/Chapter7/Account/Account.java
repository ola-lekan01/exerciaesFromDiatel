package Chapter7.Account;

public class Account {

    //given: Setting up a precondition before carrying out a test
    private int balance;
    private String pin;
    private String accountName;
    private String accountNumber;

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
        throw new InvalidPinException("Invalid Pin Entered, Please try process again");
    }
    public void deposit(int depositAmount) {
        boolean isValid = depositAmount > 0;
        if(!isValid) throw new InvalidAmountException("You cannot Deposit a Negative Amount");
        else this.balance = balance + depositAmount;
    }
    public void withdraw(int withdrawalAmount, String pin) {
        boolean isValidWithdrawalAmount = withdrawalAmount > 0 && withdrawalAmount <= this.balance;
        if (!isValidWithdrawalAmount) throw new InvalidAmountException(String.format("Your current account balance is %d, You cannot withdraw more than your current balance", balance));
        if(!isCorrect(pin)) throw new InvalidPinException("Invalid Pin Entered, Please try process again");
        balance -= withdrawalAmount;
    }
    private boolean isCorrect(String pin){
        return (pin.equals(this.pin));
    }

    public String getName() {

        return accountName;
    }
    @Override
    public String toString() {
        return String.format("%s ", accountNumber);
    }
}