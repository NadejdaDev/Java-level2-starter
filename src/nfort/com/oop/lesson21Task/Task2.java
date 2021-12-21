package nfort.com.oop.lesson21Task;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */
public class Task2 {

    public static void main(String[] args) {

        List<String> strings = List.of(
                        "String-1",
                        "String-11",
                        "String-34",
                        "String-34",
                        "String-125",
                        "String-9",
                        "String-9",
                        "String-9"
                );

        int result = strings.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result);

        long result2 = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();
        System.out.println(result2);
    }
}

