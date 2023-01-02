package com.fkp.pattern.creator_mode.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {
    private static final Map<String, Coffee> map = new HashMap<>();
    static {
        final Properties properties = new Properties();
        try (InputStream in = CoffeeFactory.class.getClassLoader().getResourceAsStream("application.properties")){
            properties.load(in);
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                Coffee coffee = (Coffee) Class.forName(properties.getProperty((String) key)).newInstance();
                map.put((String) key, coffee);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("创建对象失败");
        }
    }
    public static Coffee createCoffee(String type){
        Coffee coffee = map.get(type);
        if(coffee == null){
            throw new RuntimeException("没有这种咖啡");
        }
        return coffee;
    }
}
