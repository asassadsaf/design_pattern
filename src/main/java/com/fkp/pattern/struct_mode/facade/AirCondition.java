package com.fkp.pattern.struct_mode.facade;

/**
 * 空调类，子系统角色
 */
public class AirCondition {
    public void on(){
        System.out.println("打开空调");
    }
    public void off(){
        System.out.println("关闭空调");
    }
}
