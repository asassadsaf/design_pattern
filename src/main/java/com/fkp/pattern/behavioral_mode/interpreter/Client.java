package com.fkp.pattern.behavioral_mode.interpreter;

/**
 * 解释器模式：给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");
        //Value v = new Value(1);
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        context.assign(e, 5);
        AbstractExpression expression = new Minus(new Plus(new Plus(new Plus(a, b), c), d), e);
        System.out.println(expression + "= " + expression.interpret(context));
    }
}
