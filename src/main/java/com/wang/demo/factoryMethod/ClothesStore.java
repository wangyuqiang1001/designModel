package com.wang.demo.factoryMethod;

import com.wang.demo.factoryEasy.BlckClothes;
import com.wang.demo.factoryEasy.Clothes;
import com.wang.demo.factoryEasy.WhiteClothes;
import com.wang.demo.factoryEasy.YellowClothes;

/**
 * 衣服店:
 */
public abstract class ClothesStore {


    public Clothes buyClothes(String color) {
        Clothes clothes = chooseClothes(color);
        //doSomeThing
        //可以看到决定具体的子类是谁，接下来可以具体实现业务逻辑
        return clothes;
    }


    public abstract Clothes chooseClothes(String color);


}
