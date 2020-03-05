package com.wang.demo.decorateModel;

/**
 * 护腕:
 */
public class WristEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 10;
    }

    @Override
    public void description() {
        System.out.println("这是一个护腕");
    }
}
