package nfort.com.oop.lesson21Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */
public class Task1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 58, 5, 60, 125, 55, 50, 25, 67);

        OptionalDouble optionalDouble = list.stream()
                .filter(value -> value % 2 != 0 && value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
        optionalDouble.ifPresent(System.out::println);
    }
}
