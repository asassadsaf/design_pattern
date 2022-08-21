package com.fkp.principles.interface_isolation.before;


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
        mySafetyDoor2.antiTheft();
        //被迫依赖了不使用的方法防火和防水，没有遵守接口隔离原则
        mySafetyDoor2.fireproof();
        mySafetyDoor2.waterproof();
    }
}
