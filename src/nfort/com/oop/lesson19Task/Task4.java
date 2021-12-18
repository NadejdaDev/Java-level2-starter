package nfort.com.oop.lesson19Task;

import java.util.*;

/**
 * 4. Сложить два многочлена заданной степени, если коэффициенты
 * многочлена хранятся в объекте HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * Вывести результирующий многочлен в виде строки: ax^6 + bx^4 +
 * cx^3 + dx + 8
 */
public class Task4 {

    public static void main(String[] args) {

        Map<Integer, Integer> polynomial1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );

        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );

        System.out.println(convertToString(sum(polynomial1, polynomial2)));

        // 8x^6 + 9x^5 + 6x^3 + 3x^1 + 10
    }

//    public static Map<Integer, Integer> sum(Map<Integer, Integer> m1,
//                                            Map<Integer, Integer> m2) {
//        Map<Integer, Integer> result = new HashMap<>(m1);
//        for(Map.Entry<Integer, Integer> res : m2.entrySet()) {
//            if(result.containsKey(res.getKey())) {
//                result.put(res.getKey(), res.getValue() + result.get(res.getKey()));
//            } else {
//                result.put(res.getKey(), res.getValue());
//            }
//        } return result;
//    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> polynomial1,
                                            Map<Integer, Integer> polynomial2) {
        Map<Integer, Integer> polynomialResult = new HashMap<>(polynomial1);
        for(Map.Entry<Integer, Integer> entry : polynomial2.entrySet()) {
//            Integer value = polynomialResult.getOrDefault(entry.getKey(), 0);
//            polynomialResult.put(entry.getKey(), value + entry.getValue());
            polynomialResult.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return polynomialResult;
    }

    public static String convertToString(Map<Integer, Integer> map) {

        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> list = new ArrayList<>(result.size());
        for(Map.Entry<Integer, Integer> entry : result.entrySet()) {
            String value = entry.getKey() == 0 ?
                    String.valueOf(entry.getValue()) :
                    entry.getValue() + "x^" + entry.getKey();
            list.add(value);
        }
        String resultString = String.join(" + ", list);
        return resultString;
    }

}
