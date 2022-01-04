package nfort.com.oop.lesson26.latch;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(RocketDetail.values().length);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new Rocket(countDownLatch));     // один из трех потоков сразу займет поток Rocket

        Arrays.stream(RocketDetail.values())
                .map(detail -> new RocketDetailRunnable(detail, countDownLatch))
                .forEach(executorService::submit);

        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.MINUTES);
    }
}
