package com.wang.demo.abstractFactory;

public class Test {
    public static void main(String[] args) {
        People people = null;
        AsiaFactoryBean asiaFactoryBean = new AsiaFactoryBean();
        String type = "asia";
        if ("asia".equals(type)) { //根据技能工厂产生一批技能:
            people = new AsiaPeople(asiaFactoryBean);
        }
    }
}
