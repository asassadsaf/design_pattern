package com.fkp.pattern.behavioral_mode.template_method;

/**
 * 具体子类，炒包菜
 */
public class ConcreteClass_BaoCai extends AbstractClass{

    //基本方法的抽象方法，由子类实现
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    //基本方法的抽象方法，由子类实现
    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
