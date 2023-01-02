package com.fkp.pattern.creator_mode.factory.factory_method;

public class CoffeeStore {
    CoffeeFactory factory;

    public Coffee orderCoffee(){
        if(factory == null){
            throw new RuntimeException("请调用set方法设置需要的具体咖啡工厂");
        }
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }
}
