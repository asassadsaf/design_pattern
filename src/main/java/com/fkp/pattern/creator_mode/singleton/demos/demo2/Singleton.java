package com.fkp.pattern.creator_mode.singleton.demos.demo2;

/**
 * 饿汉式-方法2 静态代码块方式
 */
public class Singleton {

    private Singleton(){

    }

    private static final Singleton instance; //null

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
