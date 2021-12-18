package nfort.com.oop.lesson19Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Написать метод, который принимает целочисленный список и возвращает
 * целочисленный список только с нечетными значениями.
 */
public class Task1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 64, 7, 33, 54, 78, 103, 4);
        System.out.println(getArrayWithOddNumbers(list));
    }

    public static ArrayList<Integer> getArrayWithOddNumbers(List<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer l : list) {
            if(l % 2 != 0) {
                result.add(l);
            }
        } return result;
    }
}
