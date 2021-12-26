package nfort.com.oop.lesson25;

public class ThreadDemo {

    public static void main(String[] args) {

        var simpleThread = new SimpleThread();     // 3 способа создать поток
        System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
        var runnableThread = new Thread(new SimpleRunnable());
        var lambdaThread = new Thread(() -> System.out.println("Hello from lambda " + Thread.currentThread().getName()));

//        simpleThread.run();                                 // поток main просто вызывает функцию run()
        simpleThread.start();                               // java-приложение создает новый поток, и в этом новом потоке вызывается run()
        System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
        runnableThread.start();
        lambdaThread.start();

        try {
            simpleThread.join(100L);            // если SimpleThread не успеет выполниться за 100 миллисекунд - поток main все-равно продолжит выполнение дальше
            System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
            runnableThread.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
