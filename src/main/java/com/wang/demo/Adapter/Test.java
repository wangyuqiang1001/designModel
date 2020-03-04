package com.wang.demo.Adapter;

public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5PowerAdapter v5PowerAdapter = new V5PowerAdapter(new V220Power(220));
        mobile.charge(v5PowerAdapter);
    }
}
