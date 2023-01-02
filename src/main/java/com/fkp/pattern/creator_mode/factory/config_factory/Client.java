package com.fkp.pattern.creator_mode.factory.config_factory;

public class Client {
    public static void main(String[] args) {
        Coffee americanCoffee = CoffeeFactory.createCoffee("american");
        Coffee latteCoffee = CoffeeFactory.createCoffee("latte");
        System.out.println(americanCoffee.getName());
        System.out.println(latteCoffee.getName());
    }
}
