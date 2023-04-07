package com.fkp.pattern.behavioral_mode.visitor.demo;

/**
 * 具体元素角色，狗类
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.func(this);
    }
}
