package com.fkp.pattern.behavioral_mode.command;

import java.util.Map;

/**
 * 具体命令类，订单命令
 */
public class OrderCommand implements Command{

    //持有接收者对象
    private final SeniorChef seniorChef;
    private final Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() throws InterruptedException {
        Integer diningTable = order.getDiningTable();
        Map<String, Integer> foodDir = order.getFoodDir();
        System.out.println(diningTable + "桌的订单");
        for (Map.Entry<String, Integer> entry : foodDir.entrySet()) {
            String name = entry.getKey();
            Integer num = entry.getValue();
            seniorChef.makeFood(name, num);
        }
        //等待5秒，模拟做饭过程
        Thread.sleep(5000);
        System.out.println(diningTable + "桌的饭做好了");
    }
}
