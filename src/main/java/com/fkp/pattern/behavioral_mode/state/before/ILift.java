package com.fkp.pattern.behavioral_mode.state.before;

public interface ILift {
    public static final int OPENING_STATE = 1;
    public static final int CLOSE_STATE = 2;
    public static final int RUNNING_STATE = 3;
    public static final int STOPPING_STATE = 4;

    void setState(int state);
    void open();
    void close();
    void run();
    void stop();

}
