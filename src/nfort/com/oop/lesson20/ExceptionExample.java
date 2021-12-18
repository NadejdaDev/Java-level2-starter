package nfort.com.oop.lesson20;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("main start");
        try{
            unsafe(5);
        } catch(TimeoutException exception) {
            // handle exception
            exception.printStackTrace();
        } catch (Exception e) {
            // handle exception
            e.printStackTrace();
        }
        System.out.println("main end");
        // code
    }

    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("unsafe start");
        if(value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe end");
        // code
    }
}
