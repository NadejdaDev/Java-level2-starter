package nfort.com.oop.lesson28.model;

import java.lang.reflect.*;

public class ReflectionApiExample {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User(25L, "Ivan");
//        testFields(user);
        testMethods2(user);
//        Class<? extends User> userClass = user.getClass();
//        Class<User> userClass1 = User.class;
//        System.out.println(userClass == userClass1);

//        testConstructor();
    }

    private static void testFields(Object object) throws IllegalAccessException {   //нельзя просто получить доступ к полю, например, если у него модификатор private
        Field[] declaredFields = object.getClass().getSuperclass().getDeclaredFields();
        for(Field declaredField : declaredFields) {
            declaredField.setAccessible(true);      //разрешение на доступ к private-полям
            Object value = declaredField.get(object);
            System.out.println(declaredField.getModifiers());
            // используется побитовая маска
            // [0, 0, 0, 0, 0, 0, 0, 0]
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
            System.out.println(value);
        }
    }

//    private static void testFields2(User user) throws IllegalAccessException {   //нельзя просто получить доступ к полю, например, если у него модификатор private
//        Field[] declaredFields = User.class.getDeclaredFields();
//        for(Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);      //разрешение на доступ к private-полям
//            Object value = declaredField.get(user);
//            System.out.println(value);
//        }
//    }

    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = user.getClass().getDeclaredMethod("getName");
        System.out.println(method.invoke(user));
    }

    private static void testMethods2(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = user.getClass().getDeclaredMethod("setName", String.class);
        method.invoke(user, "Maxim");
        System.out.println(user);
    }

    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User petr = constructor.newInstance(25L, "Petr");
        System.out.println(petr);
    }

    private class Test1 {

    }

    private static class Test3 {

    }

    private enum Test2 {
        ONE, TWO
    }

}
