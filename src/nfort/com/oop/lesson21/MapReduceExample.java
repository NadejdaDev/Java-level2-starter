package nfort.com.oop.lesson21;

import java.util.Optional;
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
        Optional<Student> maybeStudent = Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Peter"),
                new Student(38, "Sveta"),
                new Student(103, "Max"),
                new Student(83, "Yurii"),
                new Student(57, "kolia"),
                new Student(17, "Lisa"),
                new Student(23, "Bob")
        )
                .sequential()           // обработка в одном потоке
//                .flatMap(student -> student.getMarks().stream())          // преобразуем в stream<Integer>
//                .map(mark -> )
//                .map(Student::getAge)
//                .filter(student -> student.getAge() < 17)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);   // находим максимального по возрасту студента

        maybeStudent.ifPresent(System.out::println);

        maybeStudent.map(Student::getAge)
//                .filter(age -> age > 25)
                .flatMap(age -> Optional.of(age * 2))
                .ifPresent(System.out::println);
    }
}
