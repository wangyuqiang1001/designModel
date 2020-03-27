package com.wang.demo.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //线程创建方法三:
//        FutureTask futureTask = new FutureTask<>(new testCall());
//        Thread thread = new Thread(futureTask);
//
//        thread.start();
//        System.out.println(futureTask.get());
//        System.out.println("执行结束");\
        Runnables2 runnables2 = new Runnables2();
        Thread thread1 = new Thread(runnables2);

        Thread thread2 = new Thread(runnables2);
        thread1.start();
        thread2.start();

    }
}
