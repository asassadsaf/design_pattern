package com.fkp.pattern.struct_mode.facade;

/**
 * 电灯类，子系统角色
 */
public class Light {
    public void on(){
        System.out.println("打开电灯");
    }
    public void off(){
        System.out.println("关闭电灯");
    }
}
