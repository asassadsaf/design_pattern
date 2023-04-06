package com.fkp.pattern.behavioral_mode.mediator;

/**
 * 具体同事类，房东类
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message){
        super.mediator.contact(message, this);
    }

    public void getMessage(String message){
        System.out.println("房主" + super.name +"获取到的信息：" + message);
    }
}
