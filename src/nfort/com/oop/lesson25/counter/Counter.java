package nfort.com.oop.lesson25.counter;

/**
 * 1. Создать класс Counter с одним полем:
 * private int count;
 *
 * Добавить методы:
 * - getCount() - для получение поля count
 * - increment() - для увеличения значения поля на единицу
 * - decrement() - для уменьшения значения поля на единицу
 */
public class Counter {

    private static String description;
    private int count;

    public static void init() {
        Class<Counter> counterClass = Counter.class;    // т.к. объекты класса класс синглтоны, то только один поток может его захватить
        synchronized (counterClass) {
            if (description == null) {
                description = "Test description";
            }
        }
    }

    public void increment() {
        synchronized (this) {           // (this.getClass()) здесь также можно вызвать синхронизацию на объекте класса Сlass
            count++;
        }
    }

    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
