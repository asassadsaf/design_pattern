package com.fkp.pattern.struct_mode.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色，使用静态内部类单例模式设计，负责创建和管理享元角色
 */
public class BoxFactory {
    private final Map<String, AbstractBox> boxMap;
    private BoxFactory(){
        boxMap = new HashMap<>();
        boxMap.put("I", new IBox());
        boxMap.put("O", new OBox());
        boxMap.put("L", new LBox());
    }

    public AbstractBox getBox(String key){
        return boxMap.get(key);
    }

    private static class BoxFactoryHolder{
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public static BoxFactory getInstance(){
        return BoxFactoryHolder.INSTANCE;
    }
}
