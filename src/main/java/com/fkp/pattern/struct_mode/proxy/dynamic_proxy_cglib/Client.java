package com.fkp.pattern.struct_mode.proxy.dynamic_proxy_cglib;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        boolean result = proxyObject.sell("张三");
        System.out.println(result);
        boolean result2 = proxyObject.sell("李四");
        System.out.println(result2);
    }
}
