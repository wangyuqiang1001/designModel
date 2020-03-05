package com.wang.demo.templateMode;

public class ItWorker extends Worker {
    public ItWorker(String name) {
        super(name);
    }

    /**
     * 超类定义算法的骨架，而将算法的一些步骤延迟到子类中，子类可以在不改变算法结构的情况下，对某些具体步骤变更:
     */
    @Override
    public void work() {
        System.out.println(name + "敲打吗，逛贴吧，吹牛");
    }

    /**
     * 一个钩子
     * @return
     */
    @Override
    public boolean isRecordTime() {
        return true;
    }
}
