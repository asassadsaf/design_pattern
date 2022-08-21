package com.fkp.principles.interface_isolation.before;

/**
 * 定义自己的安全门2，若此安全门只想拥有防盗功能，此时因为实现了安全门接口，则被迫依赖了它不使用的方法（防水，防火），违反了接口隔离原则
 */
public class MySafetyDoor2 implements SafetyDoor{

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    //虽然不使用该方法，但因为实现了安全门接口被迫依赖该方法
    @Override
    public void fireproof() {

    }

    //虽然不使用该方法，但因为实现了安全门接口被迫依赖该方法
    @Override
    public void waterproof() {

    }
}
