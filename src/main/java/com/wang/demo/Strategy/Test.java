package com.wang.demo.Strategy;

public class Test {

    public static void main(String[] args) {
        RoleA roleA = new RoleA("汪与强");
        roleA.setIAttackBehavior(new IAttackBehaviorImp()).
                setIDefendBehavior(new IDefendBehaviorImp()).setIPlayBehavior(new playBehaviorImp());
        roleA.attack();
        roleA.defend();
        roleA.play();

    }
}
