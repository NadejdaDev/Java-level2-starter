package nfort.com.oop.lesson26.pool;

import java.util.Optional;
import java.util.Queue;

public class PoolThread extends Thread{

    private final Queue<Runnable> tasks;        // лучше использовать потокобезопасные очереди, т.к. не нужно бы было
                                                // использовать synchronized методы и блоки.

    public PoolThread(Queue<Runnable> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while(true) {
            Optional<Runnable> task = Optional.empty();
            synchronized (tasks) {
                if(!tasks.isEmpty()) {
                    task = Optional.of(tasks.remove());

                }
            }
            task.ifPresent(Runnable::run);
        }
    }
}
