package com.fkp.pattern.behavioral_mode.observer.my_impl;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 具体主题对象
 */
public class WXOfficialAccount implements Subject{

    Set<Observer> observerSet = new LinkedHashSet<>();

    @Override
    public void addObserver(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observerSet) {
            observer.update(message);
        }
    }
}
