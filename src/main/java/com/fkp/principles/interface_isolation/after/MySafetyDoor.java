package com.fkp.principles.interface_isolation.after;

/**
 * 用户自定义安全门若想实现防火防水防盗功能，则实现对应的三个接口
 */
public class MySafetyDoor implements AntiTheft,Waterproof,Fireproof{
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
