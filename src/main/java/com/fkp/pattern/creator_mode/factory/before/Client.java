package com.fkp.pattern.creator_mode.factory.before;

public class Client {


    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());
        Coffee coffee2 = store.orderCoffee("american");
        System.out.println(coffee2.getName());
    }
}
