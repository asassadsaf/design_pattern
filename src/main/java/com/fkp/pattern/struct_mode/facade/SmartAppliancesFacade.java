package com.fkp.pattern.struct_mode.facade;

import org.springframework.util.StringUtils;

/**
 * 智能音响类，外观角色
 */
public class SmartAppliancesFacade {

    private final TV tv;
    private final Light light;
    private final AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.tv = new TV();
        this.light = new Light();
        this.airCondition = new AirCondition();
    }

    public void say(String message){
        if(StringUtils.hasText(message)){
            if(message.contains("打开")){
                tv.on();
                light.on();
                airCondition.on();
            }else if(message.contains("关闭")){
                tv.off();;
                light.off();
                airCondition.off();
            }else {
                System.out.println("我还听不懂您说的什么");
            }
        }
    }
}
