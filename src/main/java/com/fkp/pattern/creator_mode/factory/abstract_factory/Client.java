package com.fkp.pattern.creator_mode.factory.abstract_factory;

/**
 * 抽象工厂模式，工厂方法模式的升级，工厂方法模式中一种抽象工厂只生产同一级别的产品，而抽象工厂中一种工厂可以生产同一产品族的多个级别的产品，例如意大利风味的工厂可以生产意大利风味的咖啡和甜品
 */
public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Dessert dessert = italyDessertFactory.createDessert();
        Coffee coffee = italyDessertFactory.createCoffee();
        System.out.println(coffee.getName());
        dessert.show();
        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        Dessert dessert2 = americanDessertFactory.createDessert();
        Coffee coffee2 = americanDessertFactory.createCoffee();
        System.out.println(coffee2.getName());
        dessert2.show();
    }
}
