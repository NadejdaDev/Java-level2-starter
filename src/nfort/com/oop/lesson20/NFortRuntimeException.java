package nfort.com.oop.lesson20;

public class NFortRuntimeException extends RuntimeException{

    public NFortRuntimeException(String message) {
        super(message);
    }

    public NFortRuntimeException(Throwable cause) {
        super(cause);
    }
}
