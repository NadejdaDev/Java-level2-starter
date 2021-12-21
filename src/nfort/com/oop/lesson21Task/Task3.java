package nfort.com.oop.lesson21Task;

import java.util.Map;

/**
 * 3. Дана Map<String, Integer>. Найти сумму всех
 * значений, длина ключей которых меньше 7
 * символов.
 */
public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "mapKey7", 10,
                "mapK-6", 15,
                "mapK-5", 5,
                "mapK-12", 47,
                "mapK-4", 10,
                "mapKey-15", 43,
                "mapK", 25
        );

        int resultSum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();

        System.out.println(resultSum);
    }
}
