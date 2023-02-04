package com.fkp.pattern.creator_mode.singleton.solve.deserializer;

import java.io.Serializable;

/**
 * 懒汉式 方法5 静态内部类（在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。）
 */
public class Singleton implements Serializable {

    /**
     * 实现Serializable接口的类需要显示的指定serialVersionUID的值
     * 若不指定则jvm会自动计算该类的序列化版本值，默认的serialVersionUID计算对类详细信息非常敏感，可能因不同的JVM实现而异，并且在反序列化过程中会导致意外的InvalidClassExceptions。
     * 只有相同的serialVersionUID才能进行序列化和反序列化，否则在反序列化时会抛出InvalidClassExceptions异常
     */
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

    //添加此方法在反序列化时会调用此方法获取该类的实例对象而不是调用构造方法
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
