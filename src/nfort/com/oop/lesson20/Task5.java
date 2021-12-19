package nfort.com.oop.lesson20;

/**
 * 5. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */
public class Task5 {

    public static void main(String[] args) {
        try {
            catchCustomerException();
        } catch (NFortRuntimeException exception) {
            System.out.println("catched in main");
            exception.printStackTrace();
        }
    }

    private static void catchCustomerException() {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("Catch in catchCustomerException");
            throw new NFortRuntimeException(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Oooops");
    }
}
