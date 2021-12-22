package nfort.com.oop.lesson22Task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

/**
 * 4. Задан файл с java-кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */
public class Task4 {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("src", "nfort", "com", "oop", "lesson22Task", "Task3.java");
        String stringValues = Files.readString(path);
        String result = stringValues.replace("public", "private");

        Path resultPath = Path.of("resources", "Task3.java");
        Files.writeString(resultPath, result);

    }
}
