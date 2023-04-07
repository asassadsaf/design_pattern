package com.fkp.pattern.behavioral_mode.visitor.demo;

/**
 * 抽象访问者角色，人
 */
public interface Person {

    void func(Cat cat);

    void func(Dog dog);
}
