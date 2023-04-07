package com.fkp.pattern.behavioral_mode.iterator;

import java.util.List;

/**
 * 具体迭代器角色
 */
public class MyIteratorImpl<T> implements MyIterator<T>{

    private final List<T> list;
    private int position;

    public MyIteratorImpl(List<T> list) {
        this.list = list;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        T object = list.get(position);
        position++;
        return object;
    }
}
