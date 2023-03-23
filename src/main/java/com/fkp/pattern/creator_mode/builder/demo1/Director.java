package com.fkp.pattern.creator_mode.builder.demo1;

//指挥者类
public class Director {
    private final BikeBulider bulider;

    public Director(BikeBulider bikeBulider){
        this.bulider = bikeBulider;
    }

    public Bike construct(){
        bulider.buildFrame();
        bulider.buildSeat();
        return bulider.createBike();
    }
}
