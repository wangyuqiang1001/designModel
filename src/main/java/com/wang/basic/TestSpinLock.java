package com.wang.basic;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试自旋转锁:
 */
public class TestSpinLock {


    private AtomicReference<Thread> atomicReference = new AtomicReference<>();


    /**
     * 自旋锁操作;
     */
    public void lockSpin() {


        System.out.println("当前线程名称" + Thread.currentThread().getName());

        while (!atomicReference.compareAndSet(null, Thread.currentThread())) {
        }

    }


    /**
     * 解锁操作:
     */
    public void unLockSpin() {
        atomicReference.compareAndSet(Thread.currentThread(), null);
        System.out.println("当前线程" + Thread.currentThread().getName() + "解锁");
    }

}
