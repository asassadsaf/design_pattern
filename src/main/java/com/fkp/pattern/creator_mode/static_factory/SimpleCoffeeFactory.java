package com.fkp.pattern.creator_mode.static_factory;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type){
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
