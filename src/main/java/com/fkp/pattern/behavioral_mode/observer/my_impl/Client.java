package com.fkp.pattern.behavioral_mode.observer.my_impl;

/**
 * 观察者模式：又被称为发布-订阅（Publish/Subscribe）模式，它定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态变化时，会通知所有的观察者对象，使他们能够自动更新自己。
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new WXOfficialAccount();
        subject.addObserver(new WXUser("张三"));
        subject.addObserver(new WXUser("李四"));
        subject.addObserver(new WXUser("王五"));
        subject.notify("hello");
    }
}
