package com.fkp.pattern.behavioral_mode.mediator;

/**
 * 抽象同事角色
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }


}
