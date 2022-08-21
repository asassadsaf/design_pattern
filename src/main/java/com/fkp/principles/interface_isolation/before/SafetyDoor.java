package com.fkp.principles.interface_isolation.before;

/**
 * 安全门接口，有防盗、防火、防水功能
 */
public interface SafetyDoor {
    //防盗功能
    void antiTheft();
    //防火功能
    void fireproof();
    //防水功能
    void waterproof();
}
