package com.fkp.pattern.behavioral_mode.visitor.demo;

/**
 * 具体元素角色，猫类
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.func(this);
    }
}
