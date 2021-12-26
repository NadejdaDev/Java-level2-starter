package nfort.com.oop.lesson25.vol;

public class VolatileDemo {

    /**
     * [RAM     flag=true]
     *
     * ------   [flag=false]
     *
     * ------   [flag=true]
     */
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while(!flag) {
                System.out.println("Still false");
            }
        });
        thread1.start();

        Thread.sleep(5L);

        Thread thread2 = new Thread(() -> {
            flag = true;
                System.out.println("Flag is set");
        });
        thread2.start();
    }
}
