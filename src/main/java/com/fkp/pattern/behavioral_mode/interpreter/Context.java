package com.fkp.pattern.behavioral_mode.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境角色
 */
public class Context {

    private final Map<Variable, Integer> map;

    public Context() {
        this.map = new HashMap<>();
    }

    public void assign(Variable variable, Integer value){
        map.put(variable, value);
    }

    public int getValue(Variable variable){
        return map.get(variable);
    }
}
