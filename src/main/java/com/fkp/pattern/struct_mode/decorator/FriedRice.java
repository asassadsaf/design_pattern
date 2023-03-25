package com.fkp.pattern.struct_mode.decorator;

/**
 * 具体构件角色，炒饭类
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(12, "炒饭");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
