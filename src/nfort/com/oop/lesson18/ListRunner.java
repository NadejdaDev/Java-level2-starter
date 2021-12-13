package nfort.com.oop.lesson18;

import nfort.com.oop.lesson15.Archer;

public class ListRunner {

    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String 1");
        list.add("String 2");
        list.add("String 4");

        Object element = list.get(1);
        System.out.println(element);
    }
}
