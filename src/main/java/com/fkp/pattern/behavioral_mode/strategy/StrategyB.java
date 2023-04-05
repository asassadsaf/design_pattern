package com.fkp.pattern.behavioral_mode.strategy;

public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
