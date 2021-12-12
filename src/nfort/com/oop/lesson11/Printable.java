package nfort.com.oop.lesson11;

import java.util.Random;

public interface Printable {

    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom() {
        System.out.println(generateRandom());
        print();
    }

    private int generateRandom() {
        return RANDOM.nextInt();
    }

//    static int generateRandom() {
//        return RANDOM.nextInt();
//    }

    void print();
}
