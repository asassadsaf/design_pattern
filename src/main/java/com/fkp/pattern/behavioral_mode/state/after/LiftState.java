package com.fkp.pattern.behavioral_mode.state.after;

/**
 * 抽象状态角色
 */
public abstract class LiftState {
    //定义环境角色，封装状态变化引起的功能变化
    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
