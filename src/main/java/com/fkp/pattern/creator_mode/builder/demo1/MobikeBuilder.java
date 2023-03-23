package com.fkp.pattern.creator_mode.builder.demo1;

//具体建造者类
public class MobikeBuilder extends BikeBulider{
    @Override
    public void buildFrame() {
        super.bike.setFrame("铝合金");
    }

    @Override
    public void buildSeat() {
        super.bike.setSeat("塑料");
    }

    @Override
    public Bike createBike() {
        return super.bike;
    }
}
