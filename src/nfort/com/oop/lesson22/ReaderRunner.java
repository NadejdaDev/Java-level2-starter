package nfort.com.oop.lesson22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        try(Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }

//        File file = Path.of("resources", "test.txt").toFile();
//        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//            String collect = bufferedReader.lines()
//                    .collect(Collectors.joining("\n"));
//            System.out.println(collect);
//        }
    }
}
