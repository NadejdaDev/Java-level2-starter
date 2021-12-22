package nfort.com.oop.lesson22Task;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.*;

/**
 * 5. Задан файл с java-кодом. Прочитать текст программы из файла и
 * записать в другой файл в обратном порядке символы каждой
 * строки.
 */
public class Task5 {

    public static void main(String[] args) {

        Path path = Path.of("src", "nfort", "com", "oop", "lesson22Task", "Task4.java");
        Path resultPath = Path.of("resources", "Task4.java");

        try (Stream<String> lines = Files.lines(path);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(resultPath, APPEND, CREATE)) {
            lines.map(StringBuffer::new)
                    .map(StringBuffer::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
