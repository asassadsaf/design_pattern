package com.fkp.pattern.behavioral_mode.mediator;

/**
 * 中介者模式：又叫调停模式，定义一个中介角色来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
 */
public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("房东", mediator);
        Tenant tenant = new Tenant("租客", mediator);
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.contact("需要租三室的房子");
        houseOwner.contact("我这有三室的房子，你需要租吗？");

    }
}
