package com.fkp.pattern.behavioral_mode.mediator;

/**
 * 具体中介者角色，房屋中介
 */
public class MediatorStructure implements Mediator{

    private HouseOwner houseOwner;
    private Tenant tenant;

    public MediatorStructure() {
    }

    @Override
    public void contact(String message, Person person) {
        if(person == this.houseOwner){
            tenant.getMessage(message);
        }else {
            houseOwner.getMessage(message);
        }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
