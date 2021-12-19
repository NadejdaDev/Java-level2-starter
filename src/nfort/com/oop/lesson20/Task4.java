package nfort.com.oop.lesson20;

/**
 * 4. Повторить предыдущее упражнение, но наследуя свой класс от класса
 * RuntimeException.
 * Добавить в конструктор своего класса возможность указания
 * сообщения.
 */
public class Task4 {

    public static void main(String[] args) {
        try{
            unsafe();
        } catch (NFortRuntimeException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() {
        throw new NFortRuntimeException(new RuntimeException("runtime exception"));

    }
}
