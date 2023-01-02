package com.fkp.pattern.creator_mode.singleton.destruction;

import com.fkp.pattern.creator_mode.singleton.demos.demo5.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例模式
 */
public class ReflexBreakSingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> declaredConstructor = clazz.getDeclaredConstructor((Class<?>[]) null);
//        Constructor<?> declaredConstructor = clazz.getDeclaredConstructors()[0];
        declaredConstructor.setAccessible(true);
        Singleton singleton = (Singleton) declaredConstructor.newInstance();
        Singleton singleton2 = (Singleton) declaredConstructor.newInstance();
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
        System.out.println(singleton == singleton3);
        System.out.println(singleton2 == singleton3);
    }
}
