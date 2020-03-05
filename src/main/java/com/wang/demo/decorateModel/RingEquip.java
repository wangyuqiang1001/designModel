package com.wang.demo.decorateModel;

/**
 * 戒指
 */
public class RingEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 10;
    }

    @Override
    public void description() {
        System.out.println("这是一个戒指");
    }
}
