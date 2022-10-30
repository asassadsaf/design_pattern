package com.fkp.pattern.singleton.demos.demo1;

public class Test {
    public static void main(String[] args) {
        //创建单例对象
        Singleton instance = Singleton.getInstance();

        //再次创建单例对象
        Singleton instance1 = Singleton.getInstance();

        //比较两个对象是否是同一个
        System.out.println(instance == instance1);
    }
}
