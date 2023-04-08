package com.fkp.pattern.behavioral_mode.interpreter;

/**
 * 抽象表达式角色
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
