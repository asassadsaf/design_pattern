package com.fkp.pattern.creator_mode.singleton.solve.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SloveReflex {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> declaredConstructor = clazz.getDeclaredConstructor((Class<?>[]) null);
//        Constructor<?> declaredConstructor = clazz.getDeclaredConstructors()[0];
        declaredConstructor.setAccessible(true);
        //此种情况要么用反射创建该类的实例对象，要么使用静态方法getInstance方法触发静态内部类加载静态属性初始化该类的实例
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
//        Singleton singleton = (Singleton) declaredConstructor.newInstance();
//        Singleton singleton2 = (Singleton) declaredConstructor.newInstance();
//        System.out.println(singleton == singleton3);
        System.out.println(singleton3 == singleton4);
    }
}
