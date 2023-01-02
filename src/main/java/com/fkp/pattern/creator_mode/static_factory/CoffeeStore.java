package com.fkp.pattern.creator_mode.static_factory;

/**
 * 使用简单工厂模式解除了咖啡店类和具体咖啡的耦合，但是产生了新的耦合，即咖啡工厂和具体的咖啡，咖啡店和咖啡工厂，且新增咖啡类还是需要修改咖啡工厂类，违背了开闭原则
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
