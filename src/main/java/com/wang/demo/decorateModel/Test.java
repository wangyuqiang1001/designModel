package com.wang.demo.decorateModel;

import java.io.BufferedInputStream;

public class Test {


    public static void main(String[] args) {


        System.out.println("装饰了两个红宝石");
        ArmEquip armEquip = new ArmEquip();
        RedGemDecorate redGemDecorate = new RedGemDecorate(new RedGemDecorate(armEquip));
        int c1 = redGemDecorate.calculateAttack();
        System.out.println("攻击力是:" + c1);
        System.out.println("装饰了一个红宝石一个蓝宝石");
        RedGemDecorate redGemDecorate1 = new RedGemDecorate(new BlueGemDecorate(new ArmEquip()));
        int c2 = redGemDecorate1.calculateAttack();
        System.out.println("攻击力是" + c2);
        // new BufferedInputStream()
        //其实像文件流 BufferedInputStream就装饰了一个InputStream 输入流:截取输入流信息:

    }
}
