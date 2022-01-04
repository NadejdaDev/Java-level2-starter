package nfort.com.oop.lesson25.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class BayerThread implements Runnable {

    private final BlockingQueue<Cashbox> cashboxes;

    public BayerThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            Cashbox cashbox = cashboxes.take();    //take делает synchronized и wait вместе
            System.out.println(Thread.currentThread().getName() + " обслуживается вкассе " + cashbox);
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
            cashboxes.add(cashbox);                 // можно также использовать put()
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

