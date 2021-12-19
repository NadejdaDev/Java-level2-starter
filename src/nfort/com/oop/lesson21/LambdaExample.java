package nfort.com.oop.lesson21;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {
//        Comparator<Integer> comparator = (Integer o1, Integer o2) -> {return Integer.compare(o1, o2);};
//        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);    // так выглядит лямбда-выражение, но ее можно сократить
        Comparator<Integer> comparator = Integer::compare;      // а это с помощью "ссылки на метод"
        System.out.println(comparator.compare(25, 100));
    }

//    private static class IntegerComparator implements Comparator<Integer> {
//          [модиф.] возвр назв ([параметры])
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1, o2);
//        }
//    }

    // С помощью анонимных классов. Так делали до Java 8, т.е. до появления лямбда-выражений.
//    Comparator<Integer> comparator = new Comparator<Integer>() {
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return 0;
//        }
//    };
}
