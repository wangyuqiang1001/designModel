package com.wang.demo.abstractFactory;

public class AsiaPeople extends People {

    private abstractFactory abstractFactory;

    public AsiaPeople(abstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    @Override
    void message() { //亚洲人或者非洲人相关的一类功能:
        abstractFactory.getSkill1();
        abstractFactory.getSkill2();
    }
}
