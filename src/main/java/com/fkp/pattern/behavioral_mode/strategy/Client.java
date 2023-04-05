package com.fkp.pattern.behavioral_mode.strategy;

/**
 * 策略模式：该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 */
public class Client {
    public static void main(String[] args) {
        //售货员向客户展示不同的优惠策略
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();

        SalesMan salesMan2 = new SalesMan(new StrategyB());
        salesMan2.salesManShow();

        SalesMan salesMan3 = new SalesMan(new StrategyC());
        salesMan3.salesManShow();
    }
}
