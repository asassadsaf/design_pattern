package com.fkp.pattern.behavioral_mode.state.after;

/**
 * 环境角色
 */
public class Context {

    //定义所有电梯状态
    public static final LiftState OPENING_STATE = new OpeningState();
    public static final LiftState CLOSING_STATE = new ClosingState();
    public static final LiftState RUNNING_STATE = new RunningState();
    public static final LiftState STOPPING_STATE = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }


}
