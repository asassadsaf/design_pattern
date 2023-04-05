package com.fkp.pattern.behavioral_mode.template_method;

/**
 * 抽象类，（包含模板方法和基本方法（包含抽象方法，具体方法，钩子方法））
 */
public abstract class AbstractClass {

    //模板方法，定义算法的骨架，按照某种顺序调用基本方法，防止子类修改添加final关键字
    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    //基本方法的具体方法
    //第一步，倒油是一样的，直接实现
    public void pourOil() {
        System.out.println("倒油");
    }

    //基本方法的具体方法
    //第二步：热油是一样的，所以直接实现
    public void heatOil() {
        System.out.println("热油");
    }

    //基本方法的抽象方法，需要子类实现
    //第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
    public abstract void pourVegetable();

    //基本方法的抽象方法，需要子类实现
    //第四步：倒调味料是不一样
    public abstract void pourSauce();

    //基本方法的具体方法
    //第五步：翻炒是一样的，所以直接实现
    public void fry(){
        System.out.println("炒啊炒啊炒到熟啊");
    }

}
