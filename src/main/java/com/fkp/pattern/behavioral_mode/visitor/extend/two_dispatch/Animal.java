package com.fkp.pattern.behavioral_mode.visitor.extend.two_dispatch;

public class Animal {

    public void accept(Execute execute){
        execute.execute(this);
    }
}
