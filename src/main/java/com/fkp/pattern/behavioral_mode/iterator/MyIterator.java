package com.fkp.pattern.behavioral_mode.iterator;

/**
 * 抽象迭代器角色
 */
public interface MyIterator<T> {
    boolean hasNext();

    T next();

}
