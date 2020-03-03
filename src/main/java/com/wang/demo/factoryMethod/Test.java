package com.wang.demo.factoryMethod;

import com.wang.demo.factoryEasy.Clothes;

public class Test {
    public static void main(String[] args) {
        /*
        ① 定义了一个创建对象的接口，但由子类来决定实例化哪一个，工厂方法让类把实例化推迟到子类；
② 工厂方法就是抽象类提供的一个创建对象的方法的接口；
         */
        ClothesStore clothesStore = new RealClothesStore();
        Clothes clothes = clothesStore.buyClothes("white");
        System.out.println(clothes.color);
        //博客地址:     https://blog.csdn.net/dx94sg/article/details/80346421
    }
}
