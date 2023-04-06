package com.fkp.pattern.behavioral_mode.observer.jdk_impl;

import java.util.Observable;
import java.util.Observer;

public class Policemen implements Observer {

    private final String name;

    public Policemen(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "警察：" + ((Thief) o).getName() + "，我已经盯你很久了，你可以保持沉默，但你所说的将成为呈堂证供！！！");
    }
}
