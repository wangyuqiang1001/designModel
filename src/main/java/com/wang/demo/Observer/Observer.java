package com.wang.demo.Observer;

/**
 * 观察者:主题持有观察者的引用，观察者需要提供方法更新
 */
public interface Observer {

    //更新行为状态:
    void updateMsg(String msg);
}
