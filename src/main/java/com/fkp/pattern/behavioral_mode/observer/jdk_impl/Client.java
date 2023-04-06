package com.fkp.pattern.behavioral_mode.observer.jdk_impl;

/**
 * 观察者模式jdk提供的实现：在 Java 中，通过 java.util.Observable 类和 java.util.Observer 接口定义了观察者模式，只要实现它们的子类就可以编写观察者模式实例。
 */
public class Client {
    public static void main(String[] args) {
        Thief thief = new Thief("张三");
        thief.addObserver(new Policemen("警员A"));
        thief.addObserver(new Policemen("警员B"));
        thief.addObserver(new Policemen("警员C"));
        thief.steal();
    }
}
