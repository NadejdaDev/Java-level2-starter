package nfort.com.oop.lesson25.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class BayerThread implements Runnable {

    private final Semaphore cashboxes;

    public BayerThread(Semaphore cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            cashboxes.acquire();    //получить монитор, если это получилось, то поток идет дальше выполнять инструкции, если нет, то ждет здесь

            System.out.println(Thread.currentThread().getName() + " обслуживается в какой-то кассе");
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " освобождаю какую-то кассу");

            cashboxes.release();             // освобождение монитора
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

