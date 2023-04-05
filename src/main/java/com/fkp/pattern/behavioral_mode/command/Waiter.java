package com.fkp.pattern.behavioral_mode.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者类
 */
public class Waiter {
    private final List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void orderUp() throws InterruptedException {
        System.out.println("来新订单了");
        for (Command command : commandList) {
            command.execute();
        }
    }
}
