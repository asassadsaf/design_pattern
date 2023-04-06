package com.fkp.pattern.behavioral_mode.observer.my_impl;

/**
 * 具体观察者角色
 */
public class WXUser implements Observer{

    private final String name;

    public WXUser(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ": " + message);
    }
}
