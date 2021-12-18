package nfort.com.oop.lesson19Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3. Написать метод isUnique, который принимает Map<String, String>;
 * и возвращает true,
 * если каждому ключу соответствуют свое уникальное значение.
 * Например, в данном случае вернётся true:
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp,
 * Hal=Perkins}
 * А в данном false:
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges,
 * Hal=Perkins}
 */
public class Task3 {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("Marty", "Stepp");
//        map.put("Stuart", "Reges");
//        map.put("Jessica", "Miller");
//        map.put("Amanda", "Camp");
//        map.put("Hal", "Perkins");

        Map<String, String> map = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins"
        );

        Map<String, String> map1 = new HashMap<>();
        map1.put("Kendrick", "Perkins");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Bruce", "Reges");
        map1.put("Hal", "Perkins");

        System.out.println(isUnique(map));
        System.out.println(isUnique(map1));

    }

    private static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet(map.values());
        return set.size() == map.size();
    }
}
