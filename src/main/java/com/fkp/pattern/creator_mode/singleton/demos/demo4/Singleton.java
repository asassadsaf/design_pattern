package com.fkp.pattern.creator_mode.singleton.demos.demo4;

/**
 * 懒汉式-方法3 双重检查锁（解决效率问题，在多线程下可能出现空指针）  ->  方法4 volatile修饰instance（既保证线程安全又解决效率问题，多线程下也不会出现空指针）
 */
public class Singleton {

    private Singleton(){

    }

//    private static Singleton instance;

    //使用volatile关键字解决多线程下出现空指针问题, volatile关键字可以保证可见性和有序性。
    private static volatile Singleton instance;

    //此种方法在多线程下因JVM在实例化对象的时候会进行优化和指令重排序操作
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
