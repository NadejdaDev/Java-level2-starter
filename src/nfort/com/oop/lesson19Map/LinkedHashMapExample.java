package nfort.com.oop.lesson19Map;

import nfort.com.oop.lesson19Person.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        Person ivan = new Person(5, "Ivan", "Ivanov");
        Person petr = new Person(6, "Petr", "Petrov");

        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(null, new Person(3, "", ""));
        map.putIfAbsent(null, new Person(4, "", ""));

        for(Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
