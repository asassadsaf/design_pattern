package com.fkp.pattern.singleton.demo3;

/**
 * 懒汉式-方法1 线程不安全  ->  方法2 线程安全（存在效率问题）
 */
public class Singleton {

    private Singleton(){

    }

    private static Singleton instance; //null

    //存在线程安全问题
    public static Singleton getInstance(){
        if(instance == null){
            //例如线程1进入if后等待，线程2到if后发现还是null则进入if,此时线程2创建了Singleton对象，线程1唤醒后又创建了Singleton对象，导致线程1和线程2拿到的不是同一个对象
            instance = new Singleton();
        }
        return instance;
    }

    //可以通过加锁来保证线程安全,此种该方法存在效率低下的问题，因为这种线程安全问题只会存在第一次创建实例对象时，当对象已经创建好后，每次线程调用getInstance方法都需要获取锁则会降低效率
    public static synchronized Singleton getInstance2(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
