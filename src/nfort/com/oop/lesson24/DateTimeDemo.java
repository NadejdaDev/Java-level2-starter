package nfort.com.oop.lesson24;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        long toEpochMilli = now.toInstant().toEpochMilli();
        System.out.println(toEpochMilli);

        ZonedDateTime plus = now.plus(1l, ChronoUnit.DAYS);
        System.out.println(plus);

        ZonedDateTime truncatedTo = plus.truncatedTo(ChronoUnit.DAYS);
        System.out.println(truncatedTo);

        LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(localDateTime);

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
    }
}
