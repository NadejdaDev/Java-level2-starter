package nfort.com.oop.lesson19Map;

import nfort.com.oop.lesson19Person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(null, new Person(3, "", ""));
        map.putIfAbsent(null, new Person(4, "", ""));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for(Person person : map.values()) {
            System.out.println(person.getFirstName());
        }

        for(Integer key : map.keySet()) {
            System.out.println(key);
        }

        for(Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + ", Class: " + entry.getClass());
        }

        System.out.println(map.containsKey(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(6, new Person(4, "Sveta", "Svetikova")));

//        System.out.println(map.get(2));
//        System.out.println(map.get(null));

    }
}
