package com.fkp.pattern.behavioral_mode.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 */
public class Order {

    private Integer diningTable;
    private final Map<String, Integer> foodDir = new HashMap<>();

    public void addFoodDir(String name, Integer num){
        foodDir.put(name, num);
    }

    public Integer getDiningTable() {
        return diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setDiningTable(Integer diningTable) {
        this.diningTable = diningTable;
    }
}
