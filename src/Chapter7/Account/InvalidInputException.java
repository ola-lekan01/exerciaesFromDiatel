package Chapter7.Account;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException(String message) {
        super(message);
        message = "Invalid Input Entered";
    }
}
