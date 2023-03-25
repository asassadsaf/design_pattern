package com.fkp.pattern.struct_mode.decorator;

/**
 * 装饰者模式：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式。
 */
public class Client {
    public static void main(String[] args) {
        FastFood fastFood = new FriedNoodles();
        fastFood = new Egg(fastFood);
        fastFood = new Bacon(fastFood);
        fastFood = new Egg(fastFood);
        float price = fastFood.cost();
        String desc = fastFood.getDesc();
        System.out.println(desc + "需要付" + price + "元");
    }
}
