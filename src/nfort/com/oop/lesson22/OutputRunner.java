package nfort.com.oop.lesson22;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class OutputRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try(BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String value = "Hello, World! ";
            fileOutputStream.write(value.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
        }
    }
}
