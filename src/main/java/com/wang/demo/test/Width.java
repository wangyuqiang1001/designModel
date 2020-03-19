package com.wang.demo.test;

public class Width  implements  Cloneable{

    public synchronized void doSomething() {
        System.out.println(this);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
