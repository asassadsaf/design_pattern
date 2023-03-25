package com.fkp.pattern.struct_mode.decorator;

import lombok.Data;

/**
 * 具体装饰角色，培根类
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood){
        super(fastFood, 2, "培根");
    }

    @Override
    public String getDesc() {
        return super.getDesc() + super.getFastFood().getDesc();
    }

    @Override
    public float cost() {
        return super.getPrice() + super.getFastFood().cost();
    }
}
