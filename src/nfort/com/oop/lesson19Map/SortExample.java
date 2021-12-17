package nfort.com.oop.lesson19Map;

import nfort.com.oop.lesson19Person.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("123", "345", "14", "678");
        Collections.sort(list);
        System.out.println(list);

        List<Person> personList = Arrays.asList(
                new Person(1, "Yvan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Svetukova")
        );

        Collections.sort(personList);
        System.out.println(personList);

//        personList.sort(new FirstNameComparator());
        personList.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        System.out.println(personList);
    }

    public static class FirstNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
