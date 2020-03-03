package com.wang.demo.InnerObserver;

import com.wang.demo.Observer.Subject;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer {


    /**
     * 注册观察者在主题上
     */
    public void register(Observable observable) {
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3d) {
            System.out.println("观察者1接受到了3d彩票主题:" + arg);
        }
        if (o instanceof SubjectForSSQ) {
            System.out.println("观察者1接受到了双色球彩票主题:" + arg);
        }

    }
}
