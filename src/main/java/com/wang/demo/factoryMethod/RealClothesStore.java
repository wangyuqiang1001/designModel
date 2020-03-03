package com.wang.demo.factoryMethod;

import com.wang.demo.factoryEasy.BlckClothes;
import com.wang.demo.factoryEasy.Clothes;
import com.wang.demo.factoryEasy.YellowClothes;
import com.wang.demo.factoryEasy.WhiteClothes;

/**
 * 工厂方法实现类。实现具体工厂方法:
 */
public class RealClothesStore extends ClothesStore {
    @Override
    public Clothes chooseClothes(String color) {
        Clothes clothes = null;
        if ("yellow" == color) {
            clothes = new YellowClothes();
        } else if ("black" == color) {
            clothes = new BlckClothes();
        } else if ("white" == color) {
            clothes = new WhiteClothes();
        }
        return clothes;
    }
}
