package com.fkp.pattern.struct_mode.proxy.dynamic_proxy_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;

/**
 * 代理对象工厂类，提供代理对象，代理对象是运行中产生的
 */
public class ProxyFactory {
    private final SellTickets sellTickets = new TrainStation();

    public SellTickets getProxyObject(){
        return (SellTickets) Proxy.newProxyInstance(sellTickets.getClass().getClassLoader(), sellTickets.getClass().getInterfaces(), new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象本身
             * @param method 目标对象的方法对象
             * @param args 调用代理对象方法传入的参数
             * @return
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //可以对所有方法统一增强或针对某些方法单独增强
                System.out.println("代售点很高兴为您服务");
                //针对买票方法单独处理
                if(method.getName().equals("sell")){
                    //1.对方法参数增强
                    Object name = "尊敬的" + args[0];
                    boolean result = (boolean) method.invoke(sellTickets, name);
                    if(result){
                        //2.对方法体增强
                        System.out.println("代售点收取额外费用");
                    }else {
                        //3.对返回值增强，如果此时没票，但是此时是中午以前则给出候补票
                        Calendar calendar = Calendar.getInstance();
                        int hour = calendar.get(Calendar.HOUR_OF_DAY);
                        if(hour < 12){
                            result = true;
                        }
                    }
                    return result;
                }else {
                    return method.invoke(sellTickets, args);
                }
            }
        });
    }
}
