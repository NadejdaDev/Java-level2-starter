package nfort.com.oop.lesson22;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *                  output stream
 * application -------------------> file
 *
 *                  input stream
 * application <------------------- file
 *
 */
public class FileRunner {

    public static void main(String[] args) throws IOException {

        File file = new File("resources/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.canExecute());      // параметр доступа (один из трех) возможность выполнения
        System.out.println(file.canRead());         // параметр доступа - чтение
        System.out.println(file.canWrite());        // параметр доступа - запись

        System.out.println(file.getAbsolutePath());

        File dir = new File("resources/test/dir");
        dir.mkdirs();
        System.out.println(Arrays.toString(dir.list()));
    }
}
