package com.fkp.pattern.behavioral_mode.interpreter;

/**
 * 终结符表达式角色，变量名
 */
public class Variable extends AbstractExpression{

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
