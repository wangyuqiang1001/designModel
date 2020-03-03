package com.wang.demo.InnerObserver;

public class Test {
    public static void main(String[] args) {
        //博客地址https://blog.csdn.net/lmj623565791/article/details/24179699
        //貌似主题是用继承类好点，一般所有的观察者实现类，或者子类，做的功能无非是注册，还有删除，更新，其实可以封装起来的
        //只作为接口的话每个还要单独实现:
        SubjectFor3d subjectFor3d = new SubjectFor3d();
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();
        Observer1 observer1 = new Observer1();
        observer1.register(subjectFor3d);
        observer1.register(subjectForSSQ);
        subjectFor3d.setMsg("3d彩票主题");
        subjectForSSQ.setMsg("双色球主题");
    }
}
