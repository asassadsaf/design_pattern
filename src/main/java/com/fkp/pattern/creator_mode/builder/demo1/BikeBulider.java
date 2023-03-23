package com.fkp.pattern.creator_mode.builder.demo1;

//抽象建造者类
public abstract class BikeBulider {

    protected Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
