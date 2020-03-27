package com.wang.cas.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Cas {


    private AtomicInteger a = new AtomicInteger(0);


    /**
     * 不会有线程安全问题，但是可能存在ABA
     */
    public void test3() {

        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                a.getAndIncrement();
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.get());
    }


    /**
     * 其实这样也不会有线程安全问题:就是可能会失败。
     */
    public void testCas2() {

        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                boolean res = a.compareAndSet(a.get(), a.get() + 1);
                if (!res) {
                    System.out.println(res);
                }
            }).start();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.get());
    }


    /**
     * Integer 在 -128到127之间会去 Integer.Cache中取，但是大于这部分范围的话那么会直接new ,因此使用大于
     * 这部分的INteger的值得就出问题了，前后对象不是同一个，一般我们在开发中都是修改对象，因此不会有问题。
     */
    public void testB() {
        AtomicStampedReference<Integer> refence = new AtomicStampedReference<>(1, 1);


        //由1 -3 -1过程:
        //典型的问题场景就是。火锅店。 10个线程给会员充钱，每人20，只要小于10元就然后充20，但是此时又消费20，另外一个线程判断
        //相当于钱没变，这样就出问题了、还去加钱，引入原子引用相当于乐观锁。
        new Thread(() -> {
            System.out.println("A1当前版本号:" + refence.getStamp());


            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("修改结果a1" + refence.compareAndSet(1, 3, refence.getStamp(),
                    refence.getStamp() + 1));


            System.out.println("A2最新版本号" + refence.getStamp());
            System.out.println("修改结果a2" + refence.compareAndSet(3, 1, refence.getStamp(),
                    refence.getStamp() + 1));
            System.out.println("A3最新版本号" + refence.getStamp());
        }, "a").start();


        new Thread(() -> {
            int a = refence.getStamp();
            System.out.println("B当前版本号:" + a);
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //也就是在这段代码期间，如果另外一个线程有修改数据的话，版本号变了。然后自然就修改失败：版本号:
            System.out.println("B修改结果" + refence.compareAndSet(1, 2, a,
                    refence.getStamp() + 1));
        }, "b").start();

    }

    /**
     * 原子引用解决ABA问题:
     *
     * @param args
     */
    public static void main(String[] args) {
        new Cas().testCas2();
    }

}
