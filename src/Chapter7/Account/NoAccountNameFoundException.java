package Chapter7.Account;

public class NoAccountNameFoundException extends RuntimeException {
    public NoAccountNameFoundException(String message) {
        super(message);
    }
}
