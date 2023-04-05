package com.fkp.pattern.behavioral_mode.state.after;

/**
 * 状态模式：对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.RUNNING_STATE);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
