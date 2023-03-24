package com.fkp.pattern.struct_mode.proxy.static_proxy;

/**
 * 抽象主题，真实主题（目标对象）和代理对象都要实现抽象主题
 */
public interface SellTickets {

    /**
     * 卖票方法
     * @param name 购买者姓名
     * @return 是否购买成功
     */
    boolean sell(String name);
}
