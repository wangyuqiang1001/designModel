package com.wang.demo.test;

import java.util.concurrent.Callable;

public class testCall implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("线程开始执行了");
        Thread.sleep(5000);
        System.out.println("线程执行结束了");
        return 5;
    }
}
