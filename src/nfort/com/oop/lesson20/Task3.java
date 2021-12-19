package nfort.com.oop.lesson20;

/**
 * 3. Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в
 * консоль.
 */
public class Task3 {

    public static void main(String[] args) {
        try{
            unsafe();
        } catch (NFortException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws NFortException {
        throw new NFortException(new RuntimeException("runtime exception"));
    }
}
