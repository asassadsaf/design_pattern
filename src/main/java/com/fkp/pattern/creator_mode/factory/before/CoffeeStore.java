package com.fkp.pattern.creator_mode.factory.before;

public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("没有这种咖啡");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
