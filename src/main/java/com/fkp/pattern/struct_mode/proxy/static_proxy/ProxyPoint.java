package com.fkp.pattern.struct_mode.proxy.static_proxy;

import java.util.Calendar;

/**
 * 代理类：充当代售点，可以对目标对象的方法进行增强，分别从方法参数、方法体、方法返回值增强
 */
public class ProxyPoint implements SellTickets{

    private final TrainStation trainStation = new TrainStation();

    @Override
    public boolean sell(String name) {
        //3.对参数增强，对参数进行增强后传入目标对象，对买票人添加称呼
        boolean result = trainStation.sell("尊敬的" + name);
        if(result){
            //1.对方法体增强
            System.out.println("代售点收取额外费用");
        }else {
            //2.对返回值增强，如果此时没票，但是此时是中午以前则给出候补票
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            if(hour < 12){
                result = true;
            }
        }
        return result;
    }

}
