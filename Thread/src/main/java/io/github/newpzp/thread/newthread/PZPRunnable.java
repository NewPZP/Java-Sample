package io.github.newpzp.thread.newthread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PZPRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("新建线程第二种方式，继承Runnable，还是用Thread.start 执行");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new PZPRunnable());
        }
        new Thread(new PZPRunnable()).start();
    }
}
