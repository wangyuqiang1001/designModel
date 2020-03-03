package com.wang.demo.factoryEasy;

public class ClothesFactory {

    /**
     * 买衣服
     *
     * @param color
     * @return
     */
    public Clothes buyClothes(String color) {
        Clothes clothes = null;
        if ("white".equals(color)) {
            clothes = new WhiteClothes();
        } else if ("black".equals(color)) {
            clothes = new BlckClothes();
        } else if ("yellow".equals(color)) {
            clothes = new YellowClothes();
        }
        return clothes;
    }
}
