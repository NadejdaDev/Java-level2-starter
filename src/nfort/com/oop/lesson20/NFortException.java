package nfort.com.oop.lesson20;

public class NFortException extends Exception{
    public NFortException(String message) {
        super(message);
    }

    public NFortException(Throwable cause) {
        super(cause);
    }
}
