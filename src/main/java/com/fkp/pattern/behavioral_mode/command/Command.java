package com.fkp.pattern.behavioral_mode.command;

/**
 * 抽象命令类
 */
public interface Command {
    void execute() throws InterruptedException;
}
