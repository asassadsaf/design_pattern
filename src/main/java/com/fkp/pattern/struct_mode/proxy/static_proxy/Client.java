package com.fkp.pattern.struct_mode.proxy.static_proxy;

/**
 * 静态代理方式，充当访问类
 */
public class Client {
    public static void main(String[] args) {
        //通过代理对象调用方法，即通过代售点买票
        ProxyPoint proxyPoint = new ProxyPoint();
        boolean result = proxyPoint.sell("张三");
        System.out.println(result);
        //验证对返回值增强，若此时没有票但是是中午之前，则返回true，提供候补
        boolean result3 = proxyPoint.sell("王五");
        System.out.println(result3);
    }
}
