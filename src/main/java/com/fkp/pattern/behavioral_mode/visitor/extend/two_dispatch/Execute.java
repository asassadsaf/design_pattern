package com.fkp.pattern.behavioral_mode.visitor.extend.two_dispatch;

public class Execute {
    public void execute(Animal animal){
        System.out.println("Animal");
    }

    public void execute(Cat cat){
        System.out.println("Cat");
    }

    public void execute(Dog dog){
        System.out.println("Dog");
    }
}
