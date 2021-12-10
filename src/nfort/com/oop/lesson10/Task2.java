package nfort.com.oop.lesson10;

import java.util.Locale;

/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * возвращающую true, если строка начинается и заканчивается этим словом.
 */

public class Task2 {

    public static void main(String[] args) {
        String value = "Яблоко лежало на столе. Как же хотелось съесть это сочное яблоко";
        String word1 = "яблоко";
        String word2 = "яблок";
        System.out.println(isStartAndEnd(value, word1));
        System.out.println(isStartAndEnd(value, word2));

    }

    public static boolean isStartAndEnd(String target, String word) {
        String s = target.toLowerCase();
        String t = word.toLowerCase();

        return (s.startsWith(t) && s.endsWith(t));
    }
}
