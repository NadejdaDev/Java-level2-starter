package nfort.com.oop.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternReplaceExample {

    public static void main(String[] args) {
        String phoneNumber = "sdfs+375(33) 898-33-13f fgsa fghz +375(44) 777-12-13 fdasdb" +
                "bcvb cx fas+375(29) 657-13-29vxc zdfg +375(25) 111-11-11ddf rt h345 375";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?(\\d{3})-(\\d{2})-(\\d{2})";       // \\2 - ссылка на вторую группу
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        StringBuilder stringBuilder = new StringBuilder();     // т.к. локальные переменные потокобезопасны до тех пор,
                                                            // пока их не передадут другому потоку, а этого практически
                                                            // никогда не бывает, поэтому вместо StringBuffer можно
                                                            // использовать StringBuilder

        while(matcher.find()) {
//            String gr1 = matcher.group(2);
//            String gr2 = matcher.group(3);
//            String gr3 = matcher.group(4);
//            matcher.appendReplacement(stringBuilder, gr1 + " " + gr2 + " " + gr3);

            matcher.appendReplacement(stringBuilder, "$2 $3 $4");
        }
        matcher.appendTail(stringBuilder);      // нужно, чтобы не потерять окончание строки, если она заканчивается не на шаблоне

        System.out.println(stringBuilder);
        System.out.println(phoneNumber.replaceAll(regex, "$2 - $3 - $4 | "));
    }
}
