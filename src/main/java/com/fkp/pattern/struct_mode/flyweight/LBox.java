package com.fkp.pattern.struct_mode.flyweight;

/**
 * 具体享元角色，I形状方块
 */
public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L";
    }

    @Override
    public void display(String color) {
        System.out.println(getShape() + "形状，" + color + "颜色方块");
    }
}
