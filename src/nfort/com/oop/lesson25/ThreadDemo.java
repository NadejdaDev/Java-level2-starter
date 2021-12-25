package nfort.com.oop.lesson25;

public class ThreadDemo {

    public static void main(String[] args) {

        var simpleThread = new SimpleThread();     // 3 способа создать поток
        var runnableThread = new Thread(new SimpleRunnable());
        var lambdaThread = new Thread(() -> System.out.println("Hello from lambda " + Thread.currentThread().getName()));

//        simpleThread.run();                                 // поток main просто вызывает функцию run()
        simpleThread.start();                               // java-приложение создает новый поток, и в этом новом потоке вызывается run()
        runnableThread.start();
        lambdaThread.start();

        try {
            simpleThread.join();
            runnableThread.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
