package nfort.com.oop.lesson20;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(finallyTest());

        try{
            unsafe(5);
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
//        catch(TimeoutException exception) {
//            // handle exception
//            exception.printStackTrace();
//        } catch (Exception e) {
//            // handle exception
//            e.printStackTrace();
//        }
        finally {
            System.out.println("finally");
        }
        System.out.println("main end");
        // code
    }

    public static int finallyTest() {
        try {
            return 2;
        } catch (Throwable throwable) {
            return 3;
        } finally {
            return 4;
        }
    }

    public static void unsafe(int value) {
        System.out.println("unsafe start");
        if(value > 0) {
            throw new RuntimeException();
        }
        System.out.println("unsafe end");
        // code
    }
}
