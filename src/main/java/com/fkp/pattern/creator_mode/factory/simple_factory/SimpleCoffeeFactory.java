package com.fkp.pattern.creator_mode.factory.simple_factory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("没有这种咖啡");
        }
        return coffee;
    }
}
