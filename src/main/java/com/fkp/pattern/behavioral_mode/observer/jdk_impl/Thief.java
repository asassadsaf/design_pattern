package com.fkp.pattern.behavioral_mode.observer.jdk_impl;

import java.util.Observable;

public class Thief extends Observable {

    private final String name;

    public Thief(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void steal(){
        System.out.println(name + "：我偷东西了，有没有人来抓我！！！");
        super.setChanged();
        super.notifyObservers();
    }
}
