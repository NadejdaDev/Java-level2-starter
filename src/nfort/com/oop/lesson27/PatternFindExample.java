package nfort.com.oop.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "sdfs+375(33) 898-33-13f fgsa fghz +375(44) 777-12-13 fdasdb" +
                "bcvb cx fas+375(29) 657-13-29vxc zdfg +375(25) 111-11-11ddf rt h345 375";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?\\d{3}-\\d{2}-\\1";       // \\2 - ссылка на вторую группу
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while(matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group("code"));
        }
    }
}
