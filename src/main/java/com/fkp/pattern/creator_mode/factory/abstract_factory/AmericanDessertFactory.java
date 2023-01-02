package com.fkp.pattern.creator_mode.factory.abstract_factory;

public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        AmericanCoffee americanCoffee = new AmericanCoffee();
        americanCoffee.addMilk();
        americanCoffee.addSugar();
        return americanCoffee;
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
