package nfort.com.oop.lesson27.task;

/**
 * 3. Написать программу, выполняющую поиск в строке всех тегов
 * абзацев, в т.ч. тех, у которых есть параметры, например <p id ="p1">,
 * и замену их на простые теги абзацев <p>.
 */
public class Task3 {

    public static void main(String[] args) {
        String target = "<p>adsd sdfgsd</p> sda <b> nbm hfj</b> sdf <p id=\"name\">sdf q oip</p> sdf atrh<p> dsgsg<p id=\"12\">asd df</p>";
        String regex = "(<p .+?>)(.+?</p>)";

        String result = target.replaceAll(regex, "<p>$2");
        System.out.println(result);
    }
}
