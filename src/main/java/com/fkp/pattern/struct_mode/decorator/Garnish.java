package com.fkp.pattern.struct_mode.decorator;

/**
 * 抽象装饰角色
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc){
        super(price, desc);
        this.fastFood = fastFood;
    }


    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
