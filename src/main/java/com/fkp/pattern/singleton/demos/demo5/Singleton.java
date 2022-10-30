package com.fkp.pattern.singleton.demos.demo5;

import java.io.Serializable;

/**
 * 懒汉式 方法5 静态内部类（在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。）
 */
public class Singleton implements Serializable {

    private static final long serialVersionUID = 4838064301681900777L;

    private Singleton(){

    }

    /*
     * 实例由内部类创建，由于JVM在加载外部类的过程中,是不会加载静态内部类的,只有内部类的属性/方法被调用时才会被加载,并初始化其静态属性。
     * 静态属性由于被static修饰，保证只被实例化一次，并且严格保证实例化顺序。
     */
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
