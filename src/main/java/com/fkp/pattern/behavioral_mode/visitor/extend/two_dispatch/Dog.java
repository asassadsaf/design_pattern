package com.fkp.pattern.behavioral_mode.visitor.extend.two_dispatch;

public class Dog extends Animal{

    public void accept(Execute execute){
        execute.execute(this);
    }
}
