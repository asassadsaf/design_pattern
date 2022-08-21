package com.fkp.principles.interface_isolation.after;

public class SafetyDoorTest {
    public static void main(String[] args) {
        //创建用户自定义安全门
        MySafetyDoor mySafetyDoor = new MySafetyDoor();
        mySafetyDoor.antiTheft();
        mySafetyDoor.fireproof();
        mySafetyDoor.waterproof();

        System.out.println("===============================================");
        //创建用户自定义安全门2
        MySafetyDoor2 mySafetyDoor2 = new MySafetyDoor2();
        //只有防盗功能，而不会被迫依赖防火和防水功能
        mySafetyDoor2.antiTheft();
    }
}
