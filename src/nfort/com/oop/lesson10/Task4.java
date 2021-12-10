package nfort.com.oop.lesson10;

/**
 * 4. Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
 */

public class Task4 {

    public static void main(String[] args) {
        String value = "hdg!!(*%, fl,.dsk!nv, .,";
        int result = countSymbolsInString(value);

        System.out.println(result);
    }

    public static int countSymbolsInString(String value) {
        String value2 = value.replace(".", "")
                .replace("!", "")
                .replace(",", "");
        return value.length() - value2.length();
    }

}
