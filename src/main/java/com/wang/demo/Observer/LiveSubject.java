package com.wang.demo.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 直播主题:
 */
public class LiveSubject implements Subject {

    private String msg;

    //比如这里相当于一个推送行为，推送信息给所有的直播客户端:
    public void setMsg(String msg) {
        this.msg = msg;
        notifyAllObserver();
    }

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        observerList.stream().forEach(o -> o.updateMsg(msg));
    }
}
