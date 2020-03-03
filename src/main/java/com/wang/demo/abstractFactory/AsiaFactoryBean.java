package com.wang.demo.abstractFactory;


/**
 * 亚洲人的技能:
 */
public class AsiaFactoryBean implements abstractFactory {
    @Override
    public Skill1 getSkill1() {
        return new AsiaSkill1();
    }

    @Override
    public Skill2 getSkill2() {
        return new AsiaSkill2();
    }
}
