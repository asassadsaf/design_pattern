package com.fkp.pattern.creator_mode.builder.demo1;

//具体建造者类
public class OfoBuilder extends BikeBulider{
    @Override
    public void buildFrame() {
        super.bike.setFrame("碳纤维");
    }

    @Override
    public void buildSeat() {
        super.bike.setSeat("真皮");
    }

    @Override
    public Bike createBike() {
        return super.bike;
    }
}
