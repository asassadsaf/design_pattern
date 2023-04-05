package com.fkp.pattern.behavioral_mode.command;

/**
 * 接收者角色，处理具体的命令
 */
public class SeniorChef {

    public void makeFood(String name, Integer num){
        System.out.println(num + "份" + name);
    }
}
