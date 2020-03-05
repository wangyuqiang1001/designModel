package com.wang.demo.templateMode;

public class TestWorker
        extends Worker {

    public TestWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name+"测试bug");
    }
}
