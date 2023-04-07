package com.fkp.pattern.behavioral_mode.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合类
 * @param <T>
 */
public class MyContainerImpl<T> implements MyContainer<T>{

    private final List<T> list;

    public MyContainerImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(T object) {
        this.list.add(object);
    }

    @Override
    public void remove(T object) {
        this.list.remove(object);
    }

    @Override
    public MyIterator<T> getIterator() {
        return new MyIteratorImpl<>(this.list);
    }
}
