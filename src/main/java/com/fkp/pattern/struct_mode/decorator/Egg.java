package com.fkp.pattern.struct_mode.decorator;

/**
 * 具体装饰角色，鸡蛋类
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood){
        super(fastFood, 2, "鸡蛋");
    }

    @Override
    public float cost() {
        return super.getPrice() + super.getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + super.getFastFood().getDesc();
    }
}
