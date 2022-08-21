package com.fkp.principles.interface_isolation.before;

/**
 * 定义自己的安全门类，实现安全门接口
 */
public class MySafetyDoor implements SafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
