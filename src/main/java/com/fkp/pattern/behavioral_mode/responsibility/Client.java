package com.fkp.pattern.behavioral_mode.responsibility;

/**
 * 责任链模式：又名职责链模式，为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链；当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("张三", 7, "生病");

        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        Handler generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(request);

    }
}
