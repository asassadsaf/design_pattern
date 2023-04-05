package com.fkp.pattern.behavioral_mode.strategy;

/**
 * 环境类，售货员
 */
public class SalesMan {
    private final Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }
    public void salesManShow(){
        strategy.show();
    }
}
