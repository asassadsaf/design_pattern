package com.fkp.pattern.creator_mode.factory.factory_method;

/**
 * 工厂方法模式，引入抽象工厂类，具体的产品由具体的工厂类生产，当需要新增产品时只需要新创建该产品且实现抽象共产类，将其设置到咖啡店中，遵循了开闭原则
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeFactory factory2 = new LatteCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
        store.setFactory(factory2);
        Coffee coffee2 = store.orderCoffee();
        System.out.println(coffee2.getName());
    }
}
