package com.wang.basic;

import sun.management.counter.Units;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LockTest {

    /**
     * 自旋锁功能测试:
     *
     * @param args
     */
    public static void main(String[] args) {
        TestSpinLock testSpinLock = new TestSpinLock();
        new Thread(() -> {
            testSpinLock.lockSpin();
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                testSpinLock.unLockSpin();
            }
        }, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> {
            //因为延迟了一秒，所以上一个线程代表的原子引用类内部已经有值，然后上个线程休眠了三秒，
            //剩下的两秒时间相当于自旋操作的时间，一直自旋等待可以设置成功，
            testSpinLock.lockSpin();
            testSpinLock.unLockSpin();
        }, "t2").start();
    }
}
