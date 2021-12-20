package nfort.com.oop.lesson21;

import java.util.stream.Stream;

/**
 * [1_000_000] -> age -> max ->
 *
 * [1_000_000] -> age -> max -> max
 *
 * [1_000_000] -> age -> max ->
 */
public class MapReduceExample {

    public static void main(String[] args) {
        Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Peter"),
                new Student(38, "Sveta"),
                new Student(103, "Max"),
                new Student(83, "Yurii"),
                new Student(57, "kolia"),
                new Student(17, "Lisa"),
                new Student(23, "Bob")
        )
//                .sequential()           // обработка в одном потоке
                .parallel()             // обработка в нескольких потоках
                .map(Student::getAge)
//                .reduce(Math::max)
                .reduce(Math::min)
//                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
