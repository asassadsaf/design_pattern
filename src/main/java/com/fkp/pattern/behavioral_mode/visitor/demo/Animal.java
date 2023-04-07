package com.fkp.pattern.behavioral_mode.visitor.demo;

/**
 * 抽象元素角色，宠物类
 */
public interface Animal {
    void accept(Person person);
}
