package com.wang.demo.SingleModel;

/**
 * 单例模式:恶汉式:
 * 类加载时就已经完成了初始化，缺点是无法实现懒加载，系统内存浪费:
 */
public class Singleton {
//  (1)   private static Singleton singleton = new Singleton();

    //(2)
    private static Singleton singleton = null;

    static {
        singleton = new Singleton();
    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }

}
