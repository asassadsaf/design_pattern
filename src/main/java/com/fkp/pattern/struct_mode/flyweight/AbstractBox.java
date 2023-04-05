package com.fkp.pattern.struct_mode.flyweight;

/**
 * 抽象享元角色，抽象方块
 */
public abstract class AbstractBox {

    //获取方块形状
    public abstract String getShape();

    //打印方块颜色和形状
    public abstract void display(String color);
}
