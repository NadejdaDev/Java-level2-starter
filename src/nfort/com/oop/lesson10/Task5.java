package nfort.com.oop.lesson10;

import java.util.Arrays;

/**
 * 5. Написать функцию, разбивающую строку на равные части по n символов и
 * сохраняющую отдельные части в массив. Вывести этот массив.
 */

public class Task5 {

    public static void main(String[] args) {
        String value = "12345678901";
        int n = 3;
        String[] result = split(value, n);
        System.out.println(Arrays.toString(result));

    }

    public static String[] split(String value, int n) {
        int arraySize = (int)Math.ceil(value.length()/(double)n);
        String[] result = new String[arraySize];

        for (int i = 0, j = 0; i < value.length(); i += n) {
            int endIndex = Math.min(value.length(), i + n);
            result[j++] = value.substring(i, endIndex);
        }
        return result;
    }

}
