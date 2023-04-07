package com.fkp.pattern.behavioral_mode.visitor.demo;

/**
 * 具体访问者角色，其他人类
 */
public class Somebody implements Person{
    @Override
    public void func(Cat cat) {
        System.out.println("其他人喂猫");
    }

    @Override
    public void func(Dog dog) {
        System.out.println("其他人喂狗");
    }
}
