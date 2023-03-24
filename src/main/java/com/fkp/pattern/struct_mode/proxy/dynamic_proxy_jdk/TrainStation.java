package com.fkp.pattern.struct_mode.proxy.dynamic_proxy_jdk;

/**
 * 具体主题（目标对象）:真正实现买票方法的类
 */
public class TrainStation implements SellTickets {
    private int total = 1;

    @Override
    public boolean sell(String name) {
        if(--total < 0){
            System.out.println("票卖完了");
            return false;
        }
        System.out.println(name + "买了一张票");
        return true;
    }
}
