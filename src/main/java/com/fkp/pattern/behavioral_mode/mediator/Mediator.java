package com.fkp.pattern.behavioral_mode.mediator;

/**
 * 抽象中介者角色，租房中介
 */
public interface Mediator {
    void contact(String message, Person person);
}
