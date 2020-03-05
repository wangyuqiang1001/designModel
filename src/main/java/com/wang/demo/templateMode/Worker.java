package com.wang.demo.templateMode;

import java.util.Date;

public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    public void enterCompany() {
        System.out.println(name + "进入了公司");
    }

    public void openComputer() {
        System.out.println(name + "打开了电脑");
    }

    public void work() {
        System.out.println(name + "进行工作");
    }

    public void leaveCompany() {
        System.out.println(name + "离开公司");
    }

    public boolean isRecordTime() {
        return false;
    }


    public void allDay() {
        enterCompany();
        openComputer();
        work();
        leaveCompany();
        recordTime();
    }

    public void recordTime() {
        if (isRecordTime()) {
            System.out.println(name + "离开时间是" + new Date());
        }

    }

}
