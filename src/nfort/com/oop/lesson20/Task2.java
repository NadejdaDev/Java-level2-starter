package nfort.com.oop.lesson20;

/**
 * 2. Написать код, который создаст, а затем отловит
 * ArrayIndexOutOfBoundsException.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            array[6] = 6;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Опять отловили :)");
            e.printStackTrace();
        }
        System.err.println("Программа завершена");
    }
}
