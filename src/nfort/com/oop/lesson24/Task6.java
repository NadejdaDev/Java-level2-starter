package nfort.com.oop.lesson24;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 6. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task6 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prev = LocalDate.of(2018, 07, 07);

//        LocalDateTime localDateTimeNow = LocalDateTime.of(now, LocalTime.MIDNIGHT);
        LocalDateTime localDateTimeNow = now.atStartOfDay();
        LocalDateTime localDateTimePrev = prev.atStartOfDay();

        Duration duration = Duration.between(localDateTimePrev, localDateTimeNow);      // 1-й вариант
        System.out.println(duration.getSeconds());


        long between = ChronoUnit.SECONDS.between(localDateTimePrev, localDateTimeNow);  // 2-й вариант
        System.out.println(between);
    }
}
