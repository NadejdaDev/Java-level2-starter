package nfort.com.oop.lesson21Task;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * 5. Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */
public class Task5 {

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov", 56)

        );

        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
//                .reduce((person1, person2) -> person1.getAge() > person2.getAge() ? person1 : person2)
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        // представим Person-ов в виде Map, где ключ - это возраст, а значение - сам Person

        Map<Integer, List<Person>> map = persons.stream()
                .collect(groupingBy(Person::getAge));
        System.out.println(map);

        Map<Integer, List<String>> map1 = persons.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        System.out.println(map1);

//        Map<Integer, List<String>> map1 = persons.stream()
//                .collect(Collectors.groupingBy(Person::getAge,
//                        Collectors.mapping(Person::getFullName, Collectors.toList())));
//        System.out.println(map1);

        // получаем Map всех пользователей, то ключи должны быть уникальными

        Map<Integer, Person> personMap = persons.stream()
                .collect(toMap(Person::getAge, Function.identity()));
    }
}
