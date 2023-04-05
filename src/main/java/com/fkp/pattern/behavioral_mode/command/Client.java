package com.fkp.pattern.behavioral_mode.command;

/**
 * 命令模式：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。这样两者之间通过命令对象进行沟通，这样方便将命令对象进行存储、传递、调用、增加与管理。
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Order order = new Order();
        order.setDiningTable(1);
        order.addFoodDir("炸鸡", 1);
        order.addFoodDir("薯条", 2);
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.addFoodDir("拉面", 1);
        order2.addFoodDir("煎蛋", 2);
        SeniorChef seniorChef = new SeniorChef();
        Command command = new OrderCommand(seniorChef, order);
        Command command2 = new OrderCommand(seniorChef, order2);
        Waiter waiter = new Waiter();
        waiter.addCommand(command);
        waiter.addCommand(command2);
        waiter.orderUp();
    }
}
