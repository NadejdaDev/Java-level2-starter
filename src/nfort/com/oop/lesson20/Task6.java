package nfort.com.oop.lesson20;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

/**
 * 6. Создать метод случайным образом выбрасывающий одно из 3-х видов
 * исключений. Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */
public class Task6 {

    private static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new RuntimeException("runtime"),
            1, new FileNotFoundException("file not found"),
            2, new IndexOutOfBoundsException("index out of bounds")
    );

    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        } catch(IndexOutOfBoundsException exception) {
            System.out.println(2);
            exception.printStackTrace();
        } catch(FileNotFoundException exception) {
            System.out.println(1);
            exception.printStackTrace();
        } catch(RuntimeException exception) {
            System.out.println(0);
            exception.printStackTrace();
        }
        catch (Throwable throwable) {
            System.out.println(3);
            throwable.printStackTrace();
        }
    }

    public static void unsafe(int randomValue) throws Throwable {
        Throwable exception = EXCEPTIONS.getOrDefault(randomValue, new NFortRuntimeException("not found"));
        throw exception;
    }
}
