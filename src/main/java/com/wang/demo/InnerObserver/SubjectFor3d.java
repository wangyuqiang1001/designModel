package com.wang.demo.InnerObserver;

import java.util.Observable;

public class SubjectFor3d extends Observable {
    private String msg ;


    public String getMsg()
    {
        return msg;
    };


    public void  setMsg(String msg){
        this.msg = msg;
        setChanged();
        notifyObservers(msg);
    };


}
