package com.wang.demo.test;

public class Runnables2 implements Runnable {

    private static User user = new User();
    private static Object lock = new Object();


    @Override
    public void run() {
        testWait();
    }

    public void testWait() {
        synchronized (user) { //wait会让出当前线程资源：
            try {
                System.out.println("准备线程等待"+ Thread.currentThread().getName());
                user.wait();
                System.out.println("已重新唤醒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void testNotify() {
        synchronized (user) {
            System.out.println("开始执行线程代码" + Thread.currentThread().getName());
            try {
                Thread.sleep(6000);
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程代码执行结束" + Thread.currentThread().getName());
        }
    }
}
