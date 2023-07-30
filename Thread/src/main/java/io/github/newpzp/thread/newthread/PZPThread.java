package io.github.newpzp.thread.newthread;

public class PZPThread extends Thread{
    @Override
    public void run(){
        System.out.println("创建线程方法一，继承thread 实现自己的run方法，使用start执行");
    }

    public static void main(String[] args) {
        new PZPThread().start();
    }
}
