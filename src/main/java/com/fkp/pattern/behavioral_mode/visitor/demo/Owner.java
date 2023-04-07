package com.fkp.pattern.behavioral_mode.visitor.demo;

/**
 * 具体访问者角色，主人
 */
public class Owner implements Person{
    @Override
    public void func(Cat cat) {
        System.out.println("主人喂猫");
    }

    @Override
    public void func(Dog dog) {
        System.out.println("主人喂狗");
    }
}
