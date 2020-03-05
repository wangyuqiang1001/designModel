package com.wang.demo.decorateModel;

/**
 * 红宝石装饰武器
 */
public class RedGemDecorate implements BaseDecorate {


    private IEquip iEquip;

    public RedGemDecorate(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int calculateAttack() {
        return 6 + iEquip.calculateAttack();
    }

    @Override
    public void description() {

    }
}
