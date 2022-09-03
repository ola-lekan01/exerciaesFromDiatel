package Chapter7.Account;

public class InvalidPinException extends RuntimeException{

    public InvalidPinException(String message) {
        super(message);
    }
}
