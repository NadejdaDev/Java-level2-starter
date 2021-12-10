package nfort.com.oop.lesson8;

/**
 * 1. Создать класс, описывающий промежуток времени.
 * Сам промежуток должен задаваться тремя свойствами:
 * секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте.
 * Создать два конструктора: первый принимает общее количество
 * секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 */

public class TimeIntervalRunner {

    public static void main(String[] args) {

        TimeInterval timeInterval = createTimeInterval();

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());

        TimeInterval timeInterval1 = new TimeInterval(3750);
        timeInterval1.printTimeInterval();

        TimeInterval sumIntervals = timeInterval.sum(timeInterval2);
        sumIntervals.printTimeInterval();
    }

    private static TimeInterval createTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }
}
