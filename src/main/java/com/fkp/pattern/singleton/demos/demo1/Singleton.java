package com.fkp.pattern.singleton.demos.demo1;

/**
 * 饿汉式-方法1 静态变量方式
 */
public class Singleton {

    //1.私有构造方法
    private Singleton(){

    }

    //2.创建本类对象
    private static final Singleton singleton = new Singleton();

    //3.提供一个公共的访问方法，让外界可以获取该对象
    public static Singleton getInstance(){
        return singleton;
    }
}
