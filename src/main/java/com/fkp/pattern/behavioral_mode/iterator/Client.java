package com.fkp.pattern.behavioral_mode.iterator;

/**
 * 迭代器模式：提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 */
public class Client {
    public static void main(String[] args) {
        MyContainer<String> container = new MyContainerImpl<>();
        container.add("张三");
        container.add("李四");
        container.add("王五");
        MyIterator<String> iterator = container.getIterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
