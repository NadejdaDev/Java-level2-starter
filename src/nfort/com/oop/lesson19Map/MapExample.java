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
        map.put(null, new Person(4, "", ""));


        System.out.println(map.get(2));
        System.out.println(map.get(null));

    }
}
