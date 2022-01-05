package nfort.com.oop.lesson27.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Написать программу, выполняющую поиск в строке
 * шестнадцатеричных чисел, записанных по правилам Java,
 * с помощью регулярных выражений и выводящую их на страницу.
 */
public class Task2 {

    public static void main(String[] args) {
        String target = "0xAB sdf r hfd 0X034 cvb d wfds 0x77 v asd yjfh 0xF";
        String regex = "0[xX][0-9a-fA-F]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(target);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
