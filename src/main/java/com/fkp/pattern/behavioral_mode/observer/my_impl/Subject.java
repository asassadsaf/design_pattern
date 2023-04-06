package com.fkp.pattern.behavioral_mode.observer.my_impl;

/**
 * 抽象主题对象，被观察者
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notify(String message);
}
