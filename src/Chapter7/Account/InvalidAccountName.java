package Chapter7.Account;

public class InvalidAccountName extends NullPointerException{

    public InvalidAccountName(String message) {
        super(message);
    }
}
