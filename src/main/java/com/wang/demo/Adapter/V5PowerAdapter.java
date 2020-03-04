package com.wang.demo.Adapter;


//适配器，把220v电压转话为5V
public class V5PowerAdapter implements V5Power {
    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int providerV5Power() {
        int power = v220Power.getPower(220);
        System.out.println("原电压:" + power);
        System.out.println("转化中........");
        return 5;
    }
}
