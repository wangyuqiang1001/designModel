package com.wang.demo.SingleModel;

/**
 * 懒汉式：顾名思义就是懒加载，用到了才加载，线程不安全不可用
 */
public class Singleton2 {
    private static Singleton2 singleton = null;

    private Singleton2() {
    }

    //线程不安全(因为可能同时两个线程在判断为null的时候进入，然后都new对象了)
    public Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

    //线程安全：(锁静态方法，即该类的所有对象尝试获取锁都要同步，效率较低)
    public static synchronized Singleton2 getInstance2() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

    //还是线程不安全：因为可能偶同时判断为null
    public static Singleton2 getInstance3() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                singleton = new Singleton2();
            }
        }
        return singleton;
    }


    //线程安全，即便两个线程同时进入的话，等待一个线程执行完，另外一个线程也会判断是否为空；（双重校验:）线程安全；延迟加载；效率较高。
    public static Singleton2 getInstance4() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }


    //静态内部类，可以实现懒加载:
    private static class Singleton2Holder {
        private static Singleton2 singleton2 = new Singleton2();
    }

    public static Singleton2 getInstance5() {
        return Singleton2Holder.singleton2;
    }


}
