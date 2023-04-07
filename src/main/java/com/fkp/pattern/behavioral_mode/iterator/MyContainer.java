package com.fkp.pattern.behavioral_mode.iterator;

/**
 * 抽象聚合类
 */
public interface MyContainer<T> {

    void add(T object);
    void remove(T object);
    MyIterator<T> getIterator();

}
