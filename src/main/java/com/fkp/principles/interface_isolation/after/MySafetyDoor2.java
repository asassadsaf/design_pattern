package com.fkp.principles.interface_isolation.after;

/**
 * 自定义安全门2，只想拥有防盗功能，则只实现防盗接口即可，消除了之前被迫依赖不使用的方法问题，即遵循了接口隔离原则
 */
public class MySafetyDoor2 implements AntiTheft{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }
}
