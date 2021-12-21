package nfort.com.oop.lesson22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "writer2.poem");
        Files.write(path, List.of("Hello, World!", "Java"));

//        File file = Path.of("resources", "writer.poem").toFile();
//        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true)));

//        try(BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
//            fileWriter.append("Hello, World!");
//            fileWriter.newLine();
//            fileWriter.append("Java");
//        }
    }
}
