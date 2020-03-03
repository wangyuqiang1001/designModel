package com.wang.demo.Observer;

/**
 * 观众
 */
public class Viewer implements Observer {
    @Override
    public void updateMsg(String msg1) {
        System.out.println("当前用户1接受到了信息:" + msg1);
    }
}
