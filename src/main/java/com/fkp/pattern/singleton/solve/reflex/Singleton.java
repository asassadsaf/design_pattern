package com.fkp.pattern.singleton.solve.reflex;

/**
 * 静态内部类方式的单例模式，解决反射破坏单例模式的方法
 */
public class Singleton {

    private static boolean flag = false;

    /**
     * 这种情况只能使用反射执行构造方法一次，之后也无法再获取该类的唯一实例
     */
    private Singleton(){
        if(flag){
            throw new RuntimeException("只能创建该类的一个实例对象!");
        }else {
            flag = true;
        }
    }

    /*
     * 实例由内部类创建，由于JVM在加载外部类的过程中,是不会加载静态内部类的,只有内部类的属性/方法被调用时才会被加载,并初始化其静态属性。
     * 静态属性由于被static修饰，保证只被实例化一次，并且严格保证实例化顺序。
     */
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return Singleton.SingletonHolder.INSTANCE;
    }
}
