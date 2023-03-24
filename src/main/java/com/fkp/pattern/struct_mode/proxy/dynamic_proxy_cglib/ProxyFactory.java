package com.fkp.pattern.struct_mode.proxy.dynamic_proxy_cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Calendar;

/**
 * 代理对象工厂，用来创建代理对象，cglib动态代理弥补了jdk动态代理无法代理目标对象无接口的缺点，实际生产的代理对象是目标对象的子类，因此目标对象类和要代理的方法不能是final修饰的
 * cglib是第三方提供的，需要引入jar包
 */
public class ProxyFactory implements MethodInterceptor {

    private final TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(trainStation.getClass());
        enhancer.setCallback(this);
        return (TrainStation) enhancer.create();
    }


    /**
     * 代理对象调用方法时实际执行的方法
     * @param o 代理对象
     * @param method 代理对象执行的对应目标对象方法
     * @param objects 方法参数
     * @param methodProxy methodProxy为代理对象方法，其中有被代理方法和代理方法的映射关系
     * @return 代理对象调用方法的返回值
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //可以对所有方法统一增强或针对某些方法单独增强
        System.out.println("代售点很高兴为您服务");
        //针对买票方法单独处理
        if(method.getName().equals("sell")){
            //1.对方法参数增强
            Object name = "尊敬的" + objects[0];
            boolean result = (boolean) method.invoke(trainStation, name);
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
            return method.invoke(trainStation, objects);
        }
    }
}
