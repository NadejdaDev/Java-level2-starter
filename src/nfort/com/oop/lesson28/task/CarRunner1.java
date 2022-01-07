package nfort.com.oop.lesson28.task;

/**
 * Мой вариант решения 1-й задачи.
 */
public class CarRunner1 {

    public static void main(String[] args) throws NoSuchFieldException {
        Car car = new Car("Toyota", "Corolla");
        System.out.println(car);
        generateInsert(car);
    }

    public static void generateInsert(Car car) throws NoSuchFieldException {
        String scheme = car.getClass().getAnnotation(Table.class).scheme();
        String table = car.getClass().getAnnotation(Table.class).value();
        String brand = car.getClass().getDeclaredField("brand").getAnnotation(Column.class).value();
        String model = car.getClass().getDeclaredField("model").getAnnotation(Column.class).value();
        String brandName = car.getBrand();
        String modelName = car.getModel();

        String result = String.format("INSERT INTO %s.%s (%s, %s) VALUES ('%s', '%s');",
                scheme, table, brand, model, brandName, modelName);
        System.out.println(result);
    }
}
