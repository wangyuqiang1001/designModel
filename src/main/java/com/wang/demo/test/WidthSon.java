package com.wang.demo.test;

public class WidthSon extends Width {
    @Override
    public synchronized void doSomething() {
        System.out.println(this);
        super.doSomething();
    }

    //实际上在调用父类方法时并没有新建对象，本质上还是子对象调用：
    public static void main(String[] args) {
        WidthSon widthSon = new WidthSon();
        widthSon.doSomething();
    }
}
