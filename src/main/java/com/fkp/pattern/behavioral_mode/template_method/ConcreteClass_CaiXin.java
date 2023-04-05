package com.fkp.pattern.behavioral_mode.template_method;

public class ConcreteClass_CaiXin extends AbstractClass{

    //基本方法的抽象方法，由子类实现
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    //基本方法的抽象方法，由子类实现
    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
