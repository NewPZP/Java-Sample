package io.github.newpzp.thread;

public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("jvm exit success!! ")));

        Thread testThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    System.out.println("thread still running ....");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        testThread.setDaemon(true);
        testThread.start();
    }
}
