package com.wang.demo.decorateModel;

/**
 * 蓝宝石装饰武器
 */
public class BlueGemDecorate implements BaseDecorate {


    private IEquip iEquip;

    public BlueGemDecorate(IEquip equip) {

        this.iEquip = equip;
    }


    @Override
    public int calculateAttack() {
        return 5 + iEquip.calculateAttack();
    }

    @Override
    public void description() {

    }
}
