package nfort.com.oop.lesson25;

public class ThreadDemo {

    public static void main(String[] args) {

        SimpleThread simpleThread = new SimpleThread();     // создали поток
//        simpleThread.run();                                 // поток main просто вызывает функцию run()
        simpleThread.start();                               // java-приложение создает новый поток, и в этом новом потоке вызывается run()
        try {
            simpleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
