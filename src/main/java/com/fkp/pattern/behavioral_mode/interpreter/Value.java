package com.fkp.pattern.behavioral_mode.interpreter;

/**
 * 终结符表达式角色,变量值
 */
public class Value extends AbstractExpression{

    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return this.value;
    }

}
