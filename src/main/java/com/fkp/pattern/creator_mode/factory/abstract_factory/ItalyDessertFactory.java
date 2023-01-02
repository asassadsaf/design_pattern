package com.fkp.pattern.creator_mode.factory.abstract_factory;

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        LatteCoffee latteCoffee = new LatteCoffee();
        latteCoffee.addMilk();
        latteCoffee.addSugar();
        return latteCoffee;
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
