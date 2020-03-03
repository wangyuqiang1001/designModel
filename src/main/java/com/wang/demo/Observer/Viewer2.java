package com.wang.demo.Observer;

public class Viewer2 implements Observer {
    @Override
    public void updateMsg(String msg1) {
        System.out.println("当前用户2接受到了信息:" + msg1);
    }
}
