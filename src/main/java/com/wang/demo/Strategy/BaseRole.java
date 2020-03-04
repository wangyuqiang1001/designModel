package com.wang.demo.Strategy;


/**
 * 角色基类:
 * 定义一类算法不依赖于客户的具体实现，将这类算法提取出来，即策略:可动态配置
 */
public abstract class BaseRole {
    public String name;


    IAttackBehavior iAttackBehavior;
    IDefendBehavior iDefendBehavior;
    IPlayBehavior iPlayBehavior;


    public BaseRole setIAttackBehavior(IAttackBehavior iAttackBehavior) {
        this.iAttackBehavior = iAttackBehavior;
        return this;
    }

    public BaseRole setIDefendBehavior(IDefendBehavior iDefendBehavior) {
        this.iDefendBehavior = iDefendBehavior;
        return this;
    }

    public BaseRole setIPlayBehavior(IPlayBehavior iPlayBehavior) {
        this.iPlayBehavior = iPlayBehavior;
        return this;
    }

    public void defend() {
        iDefendBehavior.defend();
    }

    public void attack() {
        iAttackBehavior.attack();
    }

    public void play() {
        iPlayBehavior.play();
    }

}
