package com.fkp.pattern.struct_mode.decorator;

/**
 * 具体构件角色，炒面类
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles(){
        super(10, "炒面");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
