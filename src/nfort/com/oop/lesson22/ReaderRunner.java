package nfort.com.oop.lesson22;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test.txt").toFile();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String collect = bufferedReader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(collect);
        }
    }
}
