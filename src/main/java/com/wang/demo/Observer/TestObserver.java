package com.wang.demo.Observer;

public class TestObserver {
    public static void main(String[] args) {
        LiveSubject liveSubject = new LiveSubject();//主题
        Viewer viewer = new Viewer();
        Viewer2 viewer2 = new Viewer2();
        liveSubject.registerObserver(viewer); //个人觉得是否通过观察者构造方法意义不大啊。都一样：
        //代码会简介点:
        liveSubject.registerObserver(viewer2);
        liveSubject.setMsg("信息啊");
    }
}
