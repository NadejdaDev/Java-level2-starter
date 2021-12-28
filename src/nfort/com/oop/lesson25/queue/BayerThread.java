package nfort.com.oop.lesson25.queue;

import java.util.Queue;

public class BayerThread implements Runnable {

    private final Queue<Cashbox> cashboxes;

    public BayerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            synchronized (cashboxes) {
                while (true) {
                    if (!cashboxes.isEmpty()) {
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName() + " обслуживается вкассе " + cashbox);

                        cashboxes.wait(5L);

                        System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
                        cashboxes.add(cashbox);
                        cashboxes.notifyAll();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу");
                        cashboxes.wait();       // ждем пока касса не освободится, это произойдет
                        // только тогда, когда на этом же самом объекте не будет вызван
                        // метод notify() или notifyAll()
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

