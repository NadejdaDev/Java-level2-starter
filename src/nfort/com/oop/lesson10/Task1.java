package nfort.com.oop.lesson10;

/**
 * 1. Заменить все грустные смайлы :( в строке на весёлые :)
 */

public class Task1 {

    public static void main(String[] args) {

        String value = "adsr :) m::(f :( ::)(:( bhy";
        System.out.println(value);
        String result = replaceSmile(value);
        System.out.println(result);

    }
    static String replaceSmile(String s){
        return s.replace(":(", ":)");
    }
}
