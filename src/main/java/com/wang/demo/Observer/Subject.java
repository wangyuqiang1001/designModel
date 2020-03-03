package com.wang.demo.Observer;

/**
 * 主题接口，所有的观察者都必须通过该主题实现类，注册到该主题中，相当于发布订阅的意思:
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObserver();


}
