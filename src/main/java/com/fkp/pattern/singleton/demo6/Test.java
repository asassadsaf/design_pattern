package com.fkp.pattern.singleton.demo6;

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;

        Singleton singleton1 = Singleton.INSTANCE;

        System.out.println(singleton == singleton1);
    }
}
