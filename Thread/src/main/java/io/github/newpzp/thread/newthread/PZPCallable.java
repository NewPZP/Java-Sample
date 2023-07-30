package io.github.newpzp.thread.newthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class PZPCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "java创建线程第三种方式，实现callable 可以获取返回值";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new PZPCallable());
        new Thread(task).start();
        String message = task.get();
        System.out.println(message);
    }
}
