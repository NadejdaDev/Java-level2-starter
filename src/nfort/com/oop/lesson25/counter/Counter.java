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

    private int count;

    public int getCount() {
        return count;
    }

    public int increment() {
        return count++;
    }

    public int decrement() {
        return count--;
    }
}
