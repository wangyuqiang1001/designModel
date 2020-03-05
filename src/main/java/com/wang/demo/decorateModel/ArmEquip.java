package com.wang.demo.decorateModel;

/**
 * 武器
 */
public class ArmEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 20;
    }

    @Override
    public void description() {
        System.out.println("这是一个武器");
    }
}
