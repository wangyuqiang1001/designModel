package com.wang.demo.Adapter;

public class Mobile {


    //手机需要5v电压:
    public void charge(V5Power v5Power) {
        int power = v5Power.providerV5Power();
        System.out.println("当前电压是:" + power);
    }
}
