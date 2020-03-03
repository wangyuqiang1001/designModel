package com.wang.demo.factoryEasy;

/**
 *
 */
public class Clothes {

    public String color;


//    private Clothes clothes;

    /**
     * 比如现在买衣服这个行为，要选某个颜色的衣服，如果采取这种方式，维护麻烦，后期如果有新的衣服还需要在本类中修改代码
     * 简单工厂类意味着就可以将挑选衣服剥离出来，这样以后即便修改也是工厂类中修改就好
     *
     * @param color
     * @return
     */
 /*   private Clothes buyClothes(String color) {
        if ("white".equals(color)) {
            clothes = new WhiteClothes();
        } else if ("black".equals(color)) {
            clothes = new BlckClothes();
        } else if ("yellow".equals(color)) {
            clothes = new YellowClothes();
            ;
        }
        return clothes;
    }*/


    private ClothesFactory clothesFactory;


    public Clothes(ClothesFactory clothesFactory) {
        this.clothesFactory = clothesFactory;
    }

    public Clothes() {

    }


    public Clothes buyClothes(String color) {
        return clothesFactory.buyClothes(color);
    }
}
