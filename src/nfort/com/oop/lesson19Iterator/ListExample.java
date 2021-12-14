package nfort.com.oop.lesson19Iterator;

import nfort.com.oop.lesson18.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");

        for(String element : list) {
            System.out.println(element);
        }

        list.iterator().forEachRemaining(System.out::println);          // в современном функциональном стиле
        list.forEach(System.out::println);
    }
}
