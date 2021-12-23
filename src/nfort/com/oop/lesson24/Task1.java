package nfort.com.oop.lesson24;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * 1. Создать объект LocalDateTime, представляющий собой
 * дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
 * представляющий собой дату через 3 месяца после сегодняшней.
 * Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
 */
public class Task1 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2020, 06, 25, 19, 47);
//        System.out.println(localDateTime);
//
//        String format = localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
//        System.out.println(format);

        LocalDateTime newLocalDateTime = localDateTime.plusMonths(3L);

        LocalDate localDate = newLocalDateTime.toLocalDate();
        LocalTime localTime = newLocalDateTime.toLocalTime();

        System.out.println(localDate);
        System.out.println(localTime);

    }
}
